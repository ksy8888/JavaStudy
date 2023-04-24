package com.sist.exception;

/*
 	에러 => 컴파일(javac) / 실행시(java)
 		   ----------    ---------
 		   Check		UnCheck -> 예외처리 생략
 		    |
 		   자바문법(반드시 예외처리)
 	에러
 	--
 		= 수정이 불가능한 에러 (심각한 오류) : 메모리 부족 , 윈도우 덤프
 		Error
 		= 수정이 가능한 에러	(가벼운 오류) : 소스상에서 수정이 가능
 			=> 파일읽기 (파일명이 틀리다), 배열 인덱스를 벗어난 경우
 			=> 웹 연결 (URL 틀리다)
 			=> Exception (예외처리)
 	
 	에러가 발생
 	--------
 		1. 프로그래머의 실수
 		   => 초기화값이 없는 상태에서 비교
 		   => 배열인덱스 오류
 		   => 무한루프
 		   => 파일명 오류 ...
 		2. 사용자 입력 오류
 		   => 계산기 나누기 => 0
 		   => 정수 => 문자열 ...
 		   -------------------- 웹에서 유효성 검사
 	예외처리 : 견고한 프로그램을 만들기 위해 사용
 			------------ 비정상 종료를 방지하고 정상상태 유지
 			------------ 사전에 에러를 방지하는 프로그램
 	1. 예외처리 방식
 		= 고려할 점 : if => 예외처리
 		= 예외처리 : 복잡한 에러, if문으로 해결이 불가능할 때 사용
 			웹:404, 500, ...
 	2. 예외처리 종류
 		
 	ex)	사용자로부터 문자열을 받아서 정수 변경후에						try{
 				------------------- 값을 잘못입력한 경우			} catch(NumberFormatException e) {
 		배열에 저장												} catch(나누기...) {}
 		--------											catch(Exception e) {} >> 위에서 에러를 못 잡아주는 기타에러를 잡아줌
 		나누기를 한 후에 출력
 		----------0으로 나눌 경우 
 		
 		= 예외 발생시 => 복구
 			try~catch
 		= 예외 발생시 => 회피
 			throws
 		= 예외 발생 시킬 때 => 테스트할때
 			throw
 		= 사용자 정의 예외
 			=> 지원하지 않는 예외가 존재
 		
 		예외처리의 계층구조
 			Object
 			  |
 			Throwable
 			  |
 	 -----------------------
 	 |					|
  Error				Exception
  						|
  						
  				------------------
  				|				|
  		 CheckException		UnCheckException >> 필요시에만 사용
	  >> 반드시 예외처리				|
  		 		|				|
  				|			RuntimeException
  				|				|
  				|			NumberFormatException
  				|			 문자열 => 정수형으로 변경
  				|			 윈도우/웹 
  				|				|
  				|			NullPointerException
  								=> 객체 초기화가 안된 상태
  								=> 참조할 주소가 없는 경우(선언)
  							ArrayIndexOfOutBoundsException
  								=> 배열범위 초과시 발생
  							ArithmeticException
  								=> 0으로 나눌 경우
  							ClassCastException
  								=> class형변환이 틀린 경우
  							IllegalargumentException
  								=> 부적절한 인자 전달
  							IndexOfOutBoundsException
  								=> 문자열 관련
  		 IOException(입출력) => 메모리 입출력 , 파일 입출력, 네트워크 입출력
  		 	java.io => 클래스가 동일
		 SQLException(오라클 연동)
		 	java.sql => 네트워크 통신
		 	자바응용프로그램 <==========>  오라클
		 	  Client				 Server
		 	  => 웹에 출력하는 모든 데이터 => 오라클
		 	  => 자바
		 ClassNotFindException(리플렉션)
		 	=> 클래스명이 틀린 경우
		 
		 MalformedURLException
		 	=> URL 주소가 틀린 경우
		 	=> Jsoup
		 InterruptedException
		 	=> 스레드 충돌
		 ...
	
	263 page
	--------
	예외의미 => 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시
							 --------------
			처리를 어떻게 할지
			------------
			프로그램은 에러시에 비정상으로 종료 => 방지하고 정상적으로 종료가 가능하게 만드는 과정 (예외처리)
			
 
 */

class AAAAA
{
	public void display() {
		System.out.println("A:display() Call");
	}
}

class BBBBB
{
	
}

class CCCCC extends BBBBB
{
	
}
public class 예외처리1 {
	static String s;
	static AAAAA a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss ="Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"), ss.lastIndexOf("J")));
	//	a.display();	==> 오류. 선언만 하고 참조할 주소를 갖고 있지않아서 오류남. new
		
		
		System.out.println("1");
	//	int[] arr= new int[2];
	//	arr[2] = 10;
		System.out.println("2");
		if(s.equals("Hello"))
		{
			System.out.println("OK");
		}
		System.out.println("3");
		int a = 10;
		int b = 0;	//사용자로부터 값을받았을때
		
		//처리
		if(b!=0)	//정상수행 ==> try
		{
			int c=a/b;
			System.out.println("c="+c);
		}
		else {	//예외처리 catch
			System.out.println("0으로 나눌 수 없다");
		}
		//1. 정상적으로 종료가 되게 만든다
		//2. 우선적 => if문으로 처리가 가능한지여부 => 자바에서 제공하는 예외처리를 이용한다
		//3. if는 주로 사용하는게 ==> 검색용도, 사용자 입력 제한...
		
		
		
	}

}
