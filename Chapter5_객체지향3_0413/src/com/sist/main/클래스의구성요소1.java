package com.sist.main;
// import com.sist.main.클래스의구성요소;  //패키지 불러올때 import
// import com.sist.main.*;  
// 주의점 :키워드는 사용 할 수 없다 (대소문자 구분 => 소문자 권장)
// 숫자를 앞에 사용할 수 없다
// com.sist.class , com.sist.public >> 오류
//다른 패키지에서는 같은 이름의 클래스를 만들 수 있다

// => 메소드 => 접근방식 . 을 이용한다
// => 인스턴스 메소드 => static이 없는 메소드 => 메모리에 따로 저장
// => 클래스의 분리
/*
 	클래스
 		= 데이터형
 		= 액션(동작) => 메소드
 		------------------------
 		
 		1) 데이터형
 		2) 데이터 처리
 		3) 조립 => main => 메인보드
 	
 	메소드 => 140 page
 	1. 메소드의 구성요소
 		리턴타입(결과값) 메소드형(매개변수 -> 요청데이터) => 선언부
 		{
 			구현부
 			return 결과값
 				   ------ 리턴타입과 데이터형이 일치해야함
 		}
 		
 		리턴타입 : 사용자가 요청한 내용을 처리후에 결과값의 데이터형
 				1) 결과값이 있는 경우
 				2) 결과값이 없는 경우 => void
 				리턴타입 / return 값은 항상 일치하지는 않는다
 				----- 	------
 				항상 리턴타입이 결과값보다는 크거나 같다
 					----	---
 					int		10.5 => 오류
 					double	10   => 정상 수행
 				3) 리턴타입이나 결과값은 1개만 나온다 
 					** 여러개일 경우 : 배열 , 클래스를 이용한다 
 		
 		리턴형 : 기본형 , 배열 , 클래스 (사용자 정의 데이터형)
 		return int
 			   double
 			   char
 			   배열 => 배열명(주소)
	 			   int[] arr = new int[5];
	 			   return arr;
 			   클래스 => 객체명(주소)
 			   		A a = new A();
 			   		return a;
 	매개변수 : 사용자 요청값
 		getView(int page)
 		findData(String s)
 		login(String id, String pwd)
 */
class Student {
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}
class StudentSystem {
	
/*	int getHakbun() {
		return 1;
	}
	String getName() {
		return "홍길동";
	}
	String getSex() {
		return "남자";
	}
	int getKor() {
		return 90;
	}
	int getEng() {
		return 80;
	}
	int getMath() {
		return 78;
	}
*/	
	Student getData() {			//이 부분에서 Student는 데이터형. >> 클래스명 생성메소드명() { }
		Student s = new Student();
		s.hakbun=2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 80;
		s.eng = 90;
		s.math = 100;
		return s;
	}
	
}
public class 클래스의구성요소1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();

		StudentSystem ss = new StudentSystem();	 //클래스 접근
		Student shim = ss.getData();	//클래스 안의 메소드 접근
		System.out.println(shim.name);
		
	}

}
