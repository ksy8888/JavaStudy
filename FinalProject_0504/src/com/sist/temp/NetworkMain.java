package com.sist.temp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
import java.util.*;

import java.util.List;
import java.io.*;
import java.net.*;

/*
 	자바
 		클래스개념 / 예외처리 / 라이브러리 / 인터페이스
 		------변수/메소드/생성자 		    ------요구사항 분석(기능)
 		
 		java.lang
 			Object / String / StringBuffer / Math / Wrapper
 			
 		java.util
 			StringTokenizer / Date,Calendar
 			Collection => ArrayList, HashMap, HashSet
 			
 		java.net
 			URL , URLEncoder
 			
 		java.io : 웹 => 업로드,다운로드 (File)
 				  => Buffered~
 				  FileInputStream/FileOutputStream
 				  FileReader / FileWriter
 				  BufferedReader / File
 				  
 		java.text : SimpleDateFormat
 		----------------------------------------------------------------------
 	 2차 자바 (Web 관련)
 	 	java.sql , javax.sql, javax.nameing
 	 	javax.servlet.*
 	 	
 	 =>	1) 오라클 제어
 	 		SELECT / UPDATE / DELETE / INSERT => DML
 	 		--------------------------------- 데이터 조작언어
 	 		
 	 		CREATE / ALTER / DROP / TRUNCATE / RENAME => DDL
 	 		------------------------------------------ 데이터 저장/생성
 	 		
 	 		GRANT/REVOKE
 	 		------------ DCL (Admin)
 	 		
 	 		COMMIT / ROLLBACK
 	 		----------------- TCL(일괄처리)
 		 2) 기타 : VIEW / SEQUENCE / PS-SQL(FUNCTION, 프로시저/TRIGGER)
 		 3) 데이터베이스 모델링 (정규화 , 제약조건)
 	 
 	 => 브라우저에 데이터출력 : HTML / CSS/ JavaScript
 	 => 자바스크립트 라이브러리: JQuery / Ajax
 	  					  ------------- 교재(동영상)
 		 
 */
public class NetworkMain extends JFrame implements ActionListener, Runnable, MouseListener {
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5, b6;
	JLabel logo;
	Login login = new Login();
	
	//페이지 지정
	int curpage=1;
	int totalpage=0;
	MusicSystem ms = new MusicSystem();
	
	//네트워크 관련 클래스
	// 서버연결 => 연결기기
	Socket s;
	//서버에서 보내준 값을 받는다
	BufferedReader in;
	//서버로 값을 전송
	OutputStream out;
	
	//ID저장
	String myId;
	
	//테이블 선택 인덱스번호 
	int selectRow = -1;	//-1로 둬서 선택을 안한상태
	
	//쪽지보내기
	SendMessage sm = new SendMessage();
	RecvMessage rm = new RecvMessage();
	
	public NetworkMain() {
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("c:\\javaDev\\travel.jpg"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		//logo.setIcon(new ImageIcon("c:\\javaDev\\travel.jpg"));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); //Layout 없이 직접 배치
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(10, 150, 200, 300);
		cp.setBounds(220, 15, 800, 750);
		tp.setBounds(980, 15, 250, 730);
		
		/*
		mp.setBounds(10, 15, 600, 50);
		cp.setBounds(10, 75, 960 , 730);
		tp.setBounds(980, 75, 200, 730);
		 */
		
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		b1 = new JButton("홈");
		b2 = new JButton("뮤직검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스검색");
		b5 = new JButton("게시판");
		b6 = new JButton("나가기");
		//추가
		mp.setLayout(new GridLayout(6, 1, 5, 5)); //1줄에 5개씩
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		
		
		//윈도우 크기
		setSize(1200,800);
		
		//setVisible(true);
		
		//종료
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		//로그인
		login.b1.addActionListener(this);	//리스너처리메소드 어디있는지
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
		
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);	//초기화
		cp.hp.cardPrint(list);	//배치
		totalpage = ms.musicTotalPage();
		//Homepage
		//ActionListener 여러번 => 동작을 여러번 수행하기 때문에 한번만 수행하도록 생성자로 빼놓음
		cp.hp.b1.addActionListener(this);	//이전
		cp.hp.b2.addActionListener(this);	//다음
		cp.hp.pageLa.setText(curpage+ " page /" + totalpage + " pages");
		
		cp.cp.b1.addActionListener(this);
		cp.cp.b2.addActionListener(this);
		cp.cp.table.addMouseListener(this);
		
		///쪽지 보내기
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
		
		//musicDisplay();
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");	//이거
		} catch (Exception e) { }
		new NetworkMain();
				
	}

	//버튼 처리
	public void musicDisplay() {
		
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);	//초기화
		cp.hp.cardPrint(list);	//배치
		totalpage = ms.musicTotalPage();
		//ActionListener 여기에 쓰면 등록이 여러번됨. 계속 호출되기 때문
		cp.hp.pageLa.setText(curpage+ " page /" + totalpage + " pages");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			curpage=1;
			musicDisplay();
			cp.card.show(cp, "home");
		} else if(e.getSource()==b2) {
			cp.card.show(cp, "find");
		} else if(e.getSource()==b3) {
			cp.card.show(cp, "chat");
		} else if(e.getSource()==b4) {
			cp.card.show(cp, "news");
		} else if(e.getSource()==b5) {
			cp.card.show(cp, "board");
		} 
		
		else if(e.getSource()== login.b1) {
			//로그인 데이터 읽기
			String id = login.tf1.getText();
			if(id.length() < 1) {
				JOptionPane.showMessageDialog(this, "ID를 입력");
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(name.length() < 1) {
				JOptionPane.showMessageDialog(this, "이름을 입력");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected()) {//남자 라디오 버튼이 선택 
				sex="남자";
			}
			else {
				sex="여자";
			}
			
			//서버로 전송
			try {
				//서버 연결
				s= new Socket("", 3355);
				//s= new Socket("211.238.142.118", 3456);
				//서버 컴퓨터 => IP
				//211.238.142.()
				//읽는 위치 / 쓰는 위치
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//s는 서버 메모리 => 서버메모리로부터 값을 읽어온다
				out = s.getOutputStream();
				//서버에서 읽어갈 수 있게 메모리 저장
				
				//서버로 로그인 요청
				out.write((Function.LOGIN+ "|" + id + "|" + name + "|"+ sex + "\n").getBytes());
			} catch (Exception e2) { }
			//서버로부터 전송된 값을 받아온다
			new Thread(this).start(); //run() 호출
			 
		} else if(e.getSource()== login.b2) {
			System.exit(0);
		}
		
		else if(e.getSource() == cp.cp.tf) {
			//cp.cp.initStyle();
			String msg = cp.cp.tf.getText(); //입력값 가져옴
			String color = cp.cp.box.getSelectedItem().toString();
			if(msg.length() < 1) return;
			
			//서버로 전송
			try {
				out.write((Function.CHAT+ "|" + msg + "|" + color + "\n").getBytes());
			} catch(Exception e1) { }
			
			
			//cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");
		}
		//이전 버튼
		else if(e.getSource()==cp.hp.b1) {	
			if(curpage > 1) {
				curpage--;
				musicDisplay();
			}
		}
		//다음 버튼
		else if(e.getSource()==cp.hp.b2) {
			if(curpage < totalpage) {
				curpage++;
				musicDisplay();
			}
		}
		else if(e.getSource() == cp.cp.b2) {
			//정보보기
			if(selectRow == -1) {
				JOptionPane.showMessageDialog(this,  "정보볼 대상을 선택하세요");
				return;
			}
			//선택 된 경우
			String youId = cp.cp.table.getValueAt(selectRow, 0).toString();
			try {
				//선택된 아이디의 정보를 보여달라 (서버요청)
				out.write((Function.INFO + "|" + youId + "\n").getBytes());
				//out.write => 서버요청 ==> \n포함되야한다
				//처리 => 서버 => 결과값을 받아서 클라이언트에서 출력
				
			} catch (Exception e2) { }
			
			
		}
		else if(e.getSource() == cp.cp.b1) {
			//쪽지보내기
			sm.ta.setText("");
			String youId = cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		//쪽지 보내기 관련
		else if(e.getSource() == sm.b2) {
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b2) {
			rm.setVisible(false);
		}
		else if(e.getSource() == sm.b1) {
			String youId = sm.tf.getText();
			String msg = sm.ta.getText();
			if(msg.length()<1) {
				sm.ta.requestFocus();
				return;
			}
			try {
				
				out.write((Function.MSGSEND+ "|" + youId + "|" + msg + "\n").getBytes());
				
			} catch (Exception e2) {}
			//창을 감춘ㄷ
			sm.setVisible(false);
		}
		else if(e.getSource() == rm.b1) {
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(true);
			
		} 
		else if(e.getSource() == b6)  { //나가기 
			try {
				out.write((Function.EXIT+ "|" + myId + "\n").getBytes());
			} catch (Exception ex) {}
		}
	}

	// 서버에서 결과값을 받아서 출력 => 쓰레드 (자동화)
	@Override
	public void run() {
		try {
			while(true) {
				String msg = in.readLine();
				//서ㅂㅓ에서 보낸값
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol) 
				{
				//서버에서 로그인이 들어온 경우
				//LOGiN => 테이블에 정보를 출력한다
				case Function.LOGIN:
				{
					String[] data = {
						st.nextToken(),	//ID
						st.nextToken(),	//name
						st.nextToken() }; //sex 
					
					cp.cp.model.addRow(data);
					
				}
				
				//MYLOG => 로그인 종료하고 메인창을 보여준다
				break;
				case Function.MYLOG:
				{
					setTitle(st.nextToken());	//이름
					myId = st.nextToken(); 		//id저장
					login.setVisible(false);
					setVisible(true);
				}
				break;
				case Function.CHAT:
				{
					cp.cp.initStyle();
					cp.cp.append(st.nextToken(), st.nextToken());
					//			 채팅 문자열		 색상
				}
				break;
				case Function.INFO:
				{
					String data = "아이디:" + st.nextToken() + "\n"
							+ "이름:" + st.nextToken() + "\n"
							+"성별:" + st.nextToken();
					JOptionPane.showMessageDialog(this, data);
							
				}
				break;
				case Function.MSGSEND:
				{
					String id = st.nextToken();
					String strMSg = st.nextToken();
					rm.tf.setText(id);
					rm.ta.setText(strMSg);
					rm.setVisible(true);
					
					
				}
				break;
				case Function.MYEXIT:	//본인만 나가기
				{
					dispose(); //윈도우 메모리 해제
					System.exit(0);	//프로그램 종료
				}
				break;
				case Function.EXIT: //남아있는 사람 나가기
				{
					String mid = st.nextToken();
					for(int i=0; i<cp.cp.model.getRowCount(); i++) {
						String uid = cp.cp.table.getValueAt(i, 0).toString();	//table명단에서 제거
						if(mid.equals(uid)) {
							cp.cp.model.removeRow(i);
							break;
						}
					}
				}
				break;
				}
			}
		} catch(Exception e) {}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == cp.cp.table) {
			//if(e.getClickCount() ==2) { 	//더블클릭
				selectRow = cp.cp.table.getSelectedRow();
				String id = cp.cp.table.getValueAt(selectRow, 0).toString(); //채팅유저테이블의값 가져옴
				//JOptionPane.showMessageDialog(this, "선택된 ID:" + id); //아이디클릭시 팝업
				if(id.equals(myId)) {	//쪽지보내는 사람이 본인일떄는
					cp.cp.b1.setEnabled(false);	//비활성화
					cp.cp.b2.setEnabled(false);
				}
				else {
					cp.cp.b1.setEnabled(true);	//활성화
					cp.cp.b2.setEnabled(true);
				}
			//}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
