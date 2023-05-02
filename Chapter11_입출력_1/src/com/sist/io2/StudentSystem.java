package com.sist.io2;

import java.util.*;
import java.io.*;

public class StudentSystem {
	
	//모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList = new ArrayList<Student>();
	
	//파일을 읽어서 메모리에 저장
	static 
	{	
		FileReader fr = null;	//null값 안주면 오류남 >> 초기값설정
		try {
			fr = new FileReader("c:\\java_data\\school.txt");
			StringBuffer sb = new StringBuffer();
			
			int i=0; //문자받기
			
			while((i=fr.read()) != -1) {
				sb.append((char)i);
			}
			
			// 홍길동|90|90|90|270|90.00\r\n		
			String[] stds = sb.toString().split("\n"); //한줄씩 저장
			//한줄씩 가져오기 //학생별
			for(String ss: stds) {
				StringTokenizer st = new StringTokenizer(ss, "|");
				//학생 데이터별
				Student s = new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				
				int total =s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
				
			}
			
		} catch(Exception ex) {
			ex.printStackTrace(); //에러위치확인
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}
	
	public int menu() {
		
		System.out.println("======== 메뉴 ========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("=====================");
		
		int no = 0;		
		try {
			//키보드 읽기 => 예외처리 => Scanner를 대체
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));			
			System.out.print("메뉴번호 입력:");
			String str = in.readLine();
			no = Integer.parseInt(str);
					
		} catch(Exception ex) {
			
		}
		return no;
	}
	public void process() {
		while(true) {
			int no = menu();
			if(no==5) {
				System.out.println("프로그램 종료");
				
				//프로그램종료시 파일에 데이터 저장
				FileWriter fw = null;	//한글 저장시 FileOutputStream보다 편리함
				try {
					fw = new FileWriter("C:\\java_data\\school.txt");
					// 자바프로그램과 파일 연결 => 스트림 (출력 스트림)
					// 2byte씩 전송한다 (문자 스트림) => 한글 (2byte)
					// 알파벳, 숫자는 1byte, 2byte 상관없이 가능
					String temp = "";
					for(Student ss : stdList) {
						temp += ss.getHakbun()+"|" + ss.getName()+"|" + ss.getKor()+"|" + ss.getEng() + "|" + ss.getMath()+"\n";
					}
					fw.write(temp);
					
				} catch(Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch(Exception ex) {}
				}
				break;
			}
			else if(no==1) {
				for(Student ss:stdList) {					
					int total =ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					
					System.out.println(ss.getHakbun()+ " "
							+ ss.getName()+ " "
							+ ss.getKor()+ " "
							+ ss.getEng()+ " "
							+ ss.getMath()+ " "
							+ ss.getTotal()+ " "
							+ String.format("%.2f" , ss.getAvg()));
					
				}
			} else if(no==2) {
				try { 
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	//Scanner 대체
					System.out.print("이름 입력:");
					String name = in.readLine();
					System.out.print("국어점수: ");
					String kor = in.readLine();
					System.out.print("영어점수: ");
					String eng = in.readLine();
					System.out.print("수학점수: ");
					String math = in.readLine();
					
					//시퀀스 => 자동 증가 번호 만들기 => 구분자
					int max=0;
					for(Student ss:stdList) {	//학번 자동 생성
						if(ss.getHakbun() > max) 
							max=ss.getHakbun();
					}
					
					Student s = new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					stdList.add(s);
					
					
				} catch(Exception e) {}
			}
			else if(no==4) {
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번 입력:");
					String hak = in.readLine();
					
					for(Student ss : stdList) {
						if(ss.getHakbun() == Integer.parseInt(hak)) {
							stdList.remove(ss);
							break;
						}
					}
				} catch(Exception ex) {}
			}
			
		}
	}
}
