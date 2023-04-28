package com.sist.text;

import java.text.MessageFormat;

/*
 	제목:
 	감독:
 	출연:
 	----------
 	제목	감독	출연
 	
 	MessageFormat ==> 오라클 SQL 문장 작성
 	
 		브라우저 =====> 자바 =====> 오라클
 			  <=====     <=====
 */
public class MovieSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");	// \t 옆으로 출력
		//String msg = "{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t";
		
		//출력형식 지정
		String msg ="이름:{0}\n국어:{1}\n영어:{2}\n수학:{3}\n총점:{4}\n평균:{5}\n"; // \n 아래로 출력
		
		Object[] obj1 = {"홍길동", 90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj1));	//msg 형식으로 obj1 출력
		System.out.println("======================");
		
		Object[] obj2 = {"심청이", 90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj2));
		System.out.println("======================");
		
		Object[] obj3 = {"박문수", 90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj3));
		
	}

}
