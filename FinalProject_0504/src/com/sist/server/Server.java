package com.sist.server;

/*
 	1. 전화 / 우편
 	   --	 -->손실할 수도 있다 (속도가 빠르다) => UDP
 	신뢰성이 뛰어나다 (속도가 늦다)	=> TCP
 	
 	TCP + UDP 의 장점
 		신뢰성 + 속도 ==> RTCP (화상) => ZOOM/웨일온...
 		
 	2. TCP를 제작
 		1) PORT(전화선) => 연결선
 		0~65535까지 사용 가능
 		--> 알려진 포트 (이미 사용중)	=> 0~1023 사용중
 			80 : http (웹)
 			23 : telnet
 			25 : smtp (send 메일)
 			21 : ftp  (파일전송프로토콜)
 			8080 : 프록시
 			4000 : 머드서버
 			1521 : 오라클 서버
 			1433 : MS-SQL
 			3306 : MYSQL
 			3000 : ReactJS
 			=> 화상 => 30000
 			=> 음성 => 20000
 		-------------------------
 		2) IP(전화번호) => 컴퓨터 구분
 		   ---------------------개통
 	3. 프로그램 제작
 		1) 서버 동작
 			ServerSocket ss = new ServerSocket(port번호)
 			=> bind(): 개통 (ip,port) => 유심(통신)
 			=> listen(): 클라이언트 연결시까지 대기
 		2) 클라이언트가 접속시 처리
 			=> ss.accept()
 			   ---------- 클라이언트가 서버 연결 호출 (연결시마다 호출)
 			   ---------- 진동/음악...
 			   => 클라이언트 정보 (ip, port) 
 			   				  --------Socket
 		3) 클라이언트마다 따로 통신이 가능하게 넘겨준다
 		  ---------------------------------쓰레드
 		  쓰레드는 한개프로그램 안에서 여러개의 프로그램이 동시에 작동하게 만든다
 		  	    --------프로세스
 		  쓰레드는 시분할 => CPU를 나눠서 작업을 하기 때문에 속도가 향상된다
 		  실시간 , 동시에 수행시에 사용되는 기술
 		  ---------------------------
 		  	=> 웹 (Ajax, VueJS, ReactJS)
 		  	=> 쓰레드: 게임
 		  쓰레드 작동하는 과정
 		  --------------
 		  생성
 		  				start()		 run()		   sleep()
 		  	new Thread() ====> 대기상태 ====> Running ====> 대기상태
 		  									  |
 		  									Dead => interrupt()
			=> 서버는 1개 작동 => 통신하는 프로그램을 여러개 실행
							  ----------------------
							   쓰레드 
 
 */
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;

public class Server implements Runnable {
	//클라이언트 접속시에 정보(IP)
	private Vector<Client> waitVC = new Vector<Client>();
	/*
	 	Vector => ArrayList(데이터베이스 읽기)
	 	------    ---------
	 	동기화		비동기화
	 	 |
	 	네트워크
	 */
	private ServerSocket ss;
	private final int PORT= 3355;	//우리조 포트번호
	
	//서버 가동 ==> 한컴퓨터안에서 서버를 두개 실행 할 수 없다
	public Server() {
		try {
			ss = new ServerSocket(PORT); //1000은 인원수설정. 안쓰면 default로 50명
			System.out.println("Server Start...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//접속시마다 처리
	public void run() {
		try {
			while(true) {
				Socket s = ss.accept(); //접속시마다 발신자 정보를 확인 => 전화번호 => Socket(ip)
				
				Client client = new Client(s);
				//waitVC.add(client);
				client.start();
				//클라이언트마다 따로 생성 => 각자 통신이 가능하게 만든다
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();
		//Server안에 있는 run을 호출한다
	}
	
	//통신 서버 ==> 저장된 클라이언트 정보 사용
	/*
	 	내부 클래스 : 클래스끼리 공유하는 변수/메소드가 있는 경우
	 			   서버 프로그램 / 빅데이터
	 	class Server {
	 		class Client
	 		{
	 		}
	 	}
	 */
	class Client extends Thread {
		String id,name,sex;
		
		//클라이언트에서 보낸값 읽기
		BufferedReader in;
		
		//클라이언트로 결과값 전송
		OutputStream out;
		
		//클라이언트와 연결 ==> 연결 기기(전화기)
		Socket s;
		
		//연결 시도
		public Client(Socket s) {
			try {
				this.s =s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//socket => 클라이언트의 메모리
				out = s.getOutputStream();
				
			} catch (Exception e) {}
		}
			//개인적으로 전송
			public synchronized void messageTo(String msg) {
				//synchronized : 동기화
				//디폴트는 비동기화
				try {
					out.write((msg+"\n").getBytes());
				} catch (Exception e) { }
			}
			
			//접속자 전체 전송
			public synchronized void messageAll(String msg) {
				try {
					for(Client c : waitVC) {
						c.messageTo(msg);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			//요청에 대한 처리
			public void run() {
				while(true) {
				try {
					//요청값을 받는다
					String msg = in.readLine();
					// 100|id|name|sex
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());										
					switch(protocol) 
					{
						case Function.LOGIN: 
						{
							id = st.nextToken();
							name = st.nextToken();
							sex=st.nextToken();
							//이미 접속자에게 정보 전송
							messageAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex);
							//waitVc에 첨부
							waitVC.add(this);
							//로그인은 종료 => main창을 보여준다
							messageTo(Function.MYLOG+ "|" + name);
							//로그인하는 사람에게 모든 정보를 전송
							for(Client user : waitVC) {
								messageTo(Function.LOGIN + "|" 
										+ user.id + "|"
										+ user.name + "|"
										+user.sex);
								}
								
							}
							break;
							case Function.CHAT: 
							{
								String strMsg = st.nextToken();
								String color = st.nextToken();
								messageAll(Function.CHAT + "|[" + name + "]" + strMsg+"|" + color);
							}
							break;
							}
				} catch (Exception e) {
					// TODO: handle exception
				}
				}
			}
			
		}
	}
	

