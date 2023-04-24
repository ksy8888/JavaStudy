package com.sist.exception;

// 267 page => try~catch (예외복구)
/*
 		try: 정상실행하는 코딩
 		catch: 예외가 발생시에 복구하는 과정 (여러개 사용이 가능 => 순서) =>  계층구조
 		------------------------------------------------------------
 		예외처리 => 소스상에서 수정이 가능한 에러(가벼운 에러)
 		-----
 			사전에 에러를 방지하는 프로그램
 			비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 					계층구조 (상속도)
 					-----
 					Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받음)
 					
 					Throwable : 에러의 최상위 클래스
 						|
 			 -----------------------
		 	 |					|
		  Error				Exception  >> 0으로 나누는 경우/ 정수변환의 문제
        --------				| 	   >> 형변환, 파일명이 틀린 경우
        처리가 불가능		  			   >> Web에서 URL/IP 틀린경우 , 객체가 null일때 주소에 접근하는 경우		
	=> 메모리 부족	  		------------------
    => 윈도우 충돌					|				
		  		 		1) CheckException : 컴파일시에 예외처리 했는지 여부 확인
		  		 							반드시 예외처리를 해야한다
		  		 		2) UnCheckException : 컴파일시에 예외처리를 확인하지 않는다
		  		 							  필요시에만 예외처리
			 ---------------------------------------------------------------
			 	1) CheckException	: 컴파일 시에	 								
		  		 	=> IOException(입출력) => 파일 입출력 , 메모리 입출력, 네트워크 입출력
		  		 	   (java.io) => 클래스가 동일
				 	=> SQLException(오라클 연동)
				 	   (java.sql)
				 		JDBC ===> DBCP ===> ORM (MyBatis, JPA)
				 	=> MalformedURLException : IP/Web URL
			  		   (java.net)
			  		=> ClassNotFindException : 클래스이름으로 메모리할당 => 클래스명, 패키지명 틀린 경우
			  		  	= 스프링에서 주로 사용하는 기술 (리플렉션) 
			  		  							------ private까지 접근 가능
			  		A a = new A();	, Class.forName("A")  	
			  		=> InterruptedException : 스레드 (한개의 프로세스안에서 여러개의 프로세스가 동시에 움직임)
			  				충돌과 관련
			  		=> java.lang / java.util => 예외처리와 관련 없다
			  		=> 예외처리는 필수 : 정상상태를 유지 => 견고한 프로그램
			  		
			  	2) UnCheckException : 예외처리는 필요한 경우에만 사용
			  				Exception 
			  				   |
			  				RuntimeException  : 실행 시 (인터프리터) => 사용자 입력, 프로그램 실수
			  					|
		  					NumberFormatException : 정수 변환에서 에러
		  						=> Wrapper: 기본형을 사용하기 쉽게 클래스형으로 제작
		  									boolean => Boolean
		  									int		=> Integer
		  									double  => Double
		  							Integer.parseInt();
		  								웹에서 전송된 데이터를 받는 경우
		  								-----------------------
		  									String getParameter() => 정수
		  								Jsoup : 데이터수집 (String)
			  				   |
			  				ArrayIndexOfOutBoundsException : 배열범위 초과
			  				------------------------------ 컬렉션 
			  				ArithmeticException : 0으로 나눌 경우
			  				NullPointerException : 객체나 배열에 주소가 없는 경우		  		 								  									  							
		  							A a; => 객체 초기화가 안된 상태 ==> A a = new A();
		  							int[] arr; => 참조할 주소가 없는 경우(선언)
							ClassCastException :  class 형변환이 틀린 경우
		  							
		  	--------------------------------------------------------------------
		  	
		  	예외처리의 기본 (267 page)
		  	try~catch
		  	---------
		  	형식) try 
		  	{
		  		정상수행이 가능한 코딩 => 지금까지 소스가 들어감
		  	} catch(예외처리 종류 설정)
		  	{
		  		수행과정에서 오류발생시 처리되는 부분
		  	}
		  	
		  	--------------------------------------------------------------------
			
			try~catch => 소스 전체 처리 : 종료
						------------
						부분 처리 : 제외
			
 						
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제외시키고 가져올때 for문 안쪽에 try-catch
			for(int i=1; i<=10; i++)
			{
				try {
					int j = (int)(Math.random()*3);	//0,1,2
					int k=i/j;
					System.out.println("i=" + i +"k= "+k);
				} catch(Exception ex) {
					System.out.println("0으로 나눌 수 없다");	//오류발생시 catch 잡고 다시 for >> 10번 모두 수행
				}
			}
		 
		
		
	}

}
