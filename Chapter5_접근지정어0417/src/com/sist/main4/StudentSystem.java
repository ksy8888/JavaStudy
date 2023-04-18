package com.sist.main4;
import com.sist.main3.*;
import java.util.Scanner;

public class StudentSystem {
	
	private Student[] std = new Student[3];	//std 공간만 생성(선언) 해둔 상태
	//Student s = new Student();
	
	//1. 학생 초기화
	public void init() {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<std.length; i++) {
			//메모리 할당 안된 상태.
			
/*****/			std[i] = new Student();  // 배열은 모든 저장공간이 null
			//	----------------------- 메모리 연결하는 부분***** 이거 없으면 NullPointException 오류남

			System.out.println("학번 입력: ");
			std[i].setHakbun(scan.nextInt());	
			
			System.out.print("이름 입력: ");
			std[i].name = scan.next();
			
			System.out.print("국어 영어 수학 입력(80 90 80): ");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
			
			System.out.print("성별 입력: ");
			std[i].setSex(scan.next());
			
		}
	}
	//1-1. 출력
	public void display()	//void >> 같은 패키지 내에서만 사용 가능. public 붙이면 사용가능. 메소드는 무조건 public으로.
	{
		for(Student s : std) {
			System.out.println(s.getHakbun()+" "
							+ s.name + " "
							+ s.getKor()+" "
							+ s.getEng() + " "
							+ s.getMath() + " "
							+ s.getSex() + " "
							+ s.getTotal() + " "
							+ s.getAvg() + " "
							+ s.getScore() + " "
							+ s.getRank());							
		}
	}
	//2. 평균 구하기
	public void stdAvg() {
		for(int i=0; i<std.length; i++) {
			std[i].setAvg(std[i].getTotal()/3.0);
		}
	}
	//3. 총점 구하기
	public void stdTotal()
	{
		for(int i=0; i<std.length; i++) {
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());
		}
	}
	//4. 학점 구하기
	public void stdScore() {
		char c ='A';
		for(int i=0; i<std.length; i++) {
			
			switch((int)(std[i].getAvg())/10) {
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			}
			std[i].setScore(c);
		}
	}
	//5. 등수 구하기
	public void stdRank() {
		for(int i=0; i<std.length; i++) {
			std[i].setRank(1);	//1등으로 설정해두고
			for(int j=0; j<std.length; j++) {
				if(std[i].getTotal() < std[j].getTotal()) {	//비교배열 값 클 때마다
					std[i].setRank(std[i].getRank()+1);		//순위 +1 
				}
			}
		}
	}

}
