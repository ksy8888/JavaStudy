package com.sist.exception;

import javax.management.RuntimeOperationsException;

/*
 	예외처리
 	=> 직접 처리 (프로그래머 처리)
 	  --------예외에 대한 복구 ==> 예외복구 (catch절)
 	  try~catch~finally
 	=> 간접 처리 (JVM에 맡긴다)
 	   ------예외를 복구 할 수 없다 ==> 건너뛰게 만든다
 	  throws
 	  형식)
 	  	method() throws 예외처리클래스, 예외처리클래스... (순서가 없다)
 	  			 ---------------- 선언
 	  	=> method() 를 호출하는 프로그래머가 예외처리후에 사용
 	  	   => 예외 떠맡기기
 	  	   => 1) 예외 떠맡기기
 	  	   	  2) try~catch로 처리가 가능하다
 	  	   	  3) 라이브러리 => 사용자에게 떠맡긴다
 	  	예) 
 	  		void method() throws ArrayIndexOutOfBoundsException,
 	  							 NumberFormatException
 	  		void 예외처리() throws ArrayIndexOutOfBoundsException,
 	  							 NumberFormatException
 	  		{
 	  			method();
 	  		}
 	  		void 예외처리()
 	  		{
 	  			try{
 	  				method();
 	  			} catch(ArrayIndexOutOfBoundsException e) {
 	  			
 	  			} catch(NumberFormatException e) {
 	  			}
 	  		}
 	  		void 예외처리()
 	  		{
 	  			method();
 	  		}
 ------------------------------------------------------------//	  
 
 별로안씀_
 	=> 사용자 정의 예외처리 : 지원하지 않기 때문에 직접 예외처리 제작
 		=> 거의 없다 (if을 이용하는 것이 더 좋다)
 		class MyException extends Exception
 		{
 		}
 	=> 자동 호출시에 자바는 자바에서 만든 예외처리만 호출된다
 		=> 임의로 발생해서 찾는다 (throw)
 		
 		
 	---------------------------------------------------------
 	메소드만 중간에 호출 (코드양이 많을 때, 유지보수) >> throws
 	메소드 안에서 "처음부터" 코딩할 때>> try~catch
 */
public class 예외복구_정리 {
	
	public static void method() throws ArrayIndexOutOfBoundsException , NumberFormatException {
		
	}
	
	public static void execute() throws ArrayIndexOutOfBoundsException , NumberFormatException { 
		method();
	}
	
	public static void execute2() {
		try {
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
		} catch(NumberFormatException e) {}
	}
	
	public static void execute3() {
		try {
			method();
		} catch(RuntimeException e) {
			
		} 
	}
	
	public static void execute4() {
		try {
			method();
		} catch(Exception e) {
			
		}
	}
	
	public static void execute5() {
		try {
			method();
		} catch(Throwable e) {
			
		}
	}
	
	public static void main(String[] args) {
		method();	//실행 시 에러이기 때문에 => 예외처리를 생략 할 수 있다
	}
}
