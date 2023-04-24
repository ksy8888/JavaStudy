package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

//예외 떠맡기기 , 예외회피 ....
// => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다 (알려만주는것) => 예외선언
// => 메소드 호출시에 반드시 => 직접 처리, 선언 
// => RuntimeException => 생략 가능 (예외처리를 안해도 된다)
/*
 	상위 클래스 이용해서 전체를 처리 가능하다
 		Throwable (Exception / Error)
 			|
 	-------------------------
 	|						|
 Error					Exception
 				Check		|		 UnCheck
 				-----------------------------
 				|						|
 			IOException				RuntimeException
 			SQLException				|
 									NumberFormatException , Arr...
 
 // ***: 예외처리대상		
	void method() throws RuntimeException
***	 void method() throws Exception
	void method() throws NumberFormatException, ClassCastExcepion...
***	void method() throws IOException	 
*** void method() throws SQLException, NumberFormatException


 */ 
public class 예외처리_예외회피 {
	
	public static void methods() throws Exception {
		//예외처리대상
	}
	
	public static void method1() throws Exception {
		methods();
	}
	
	public static void method2()
	{
		try {
			methods();
		} catch(Exception e) {	//Exception보다 크거나 같은 예외클래스 써야함
			
		}
	}
	
	public static void method3() throws IOException, SQLException, ClassNotFoundException {
		
	}
	
	public static void method4()  throws IOException, SQLException, ClassNotFoundException {
		method3();
	}
	
	public static void method5()  throws Exception {
		method3();
	}
	
	public static void method6()  throws Throwable {
		method3();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
