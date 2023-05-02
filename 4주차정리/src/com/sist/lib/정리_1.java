package com.sist.lib;

/*
 		8장 => 예외처리
 			=> 목적: 사전에 에러를 방지하는 프로그램을 제작
 					비정상 종료를 방지하고 정상상태 유지
 			=> 예외처리의 방법
 			   ----- 수정이 가능한 에러
 			   1) 상속도 => 예외처리 방법에 순서 존재
 			   
 			   			Object
 			   			  |
 			   		  Throwable (Spring => AOP)
 			   			  |
 			  -------------------------------
 			  |								|
 		   Error						Exception (예외처리의 최상위 클래스)
 		   									|
 		   				  CheckedException						UnCheckedException
 		   				  컴파일시에 예외처리여부 확인					예외처리여부를 미확인
 		   				  => 예외처리를 반드시 한다					=> 필요시에만 작업
 		   				  		|								=> 자주 오류나는 부분은 예외하는 것이 좋다
 		   				  		|								   ------------ 
 		   				  		|								   NumberFormatException (사용자입력)
 		   				  		|								   *** 에러: 사용자 입력 / 프로그램 실수
 		   				  		|								   NullPointerException
 		   					-------------------------------------------------
 		   					|												|
 		   			IOException: file명/디렉토리명							실행시에러 (인터프리터)
 		   			ClassNotFoundException								RuntimeException
 		   				=> Class.forName("패키지명.클래스명");						|
 		   				=> 웹 (MVC)										NullPointerException
 		   			InterruptedException (쓰레드)								String s;
 		   			MalforedURLException (ip, 웹주소)							s.replace()
 		   			SQLException (문법 => 오라클)							NumberFormatException
 			   			  												Integer.parseInt(" 10");
 			   			  												web
 			   			  												---
 			   			  												데이터 전송 => 웹주소/파일명?no= 10
 			   			  												ArrayIndexOutOfBoundException
 			   			  												ClassCastException
 			   2) 예외처리의 종류
 			   		= 예외복구 ***
 			   		try {
 			   		
 			   			정상적으로 수행하는 소스 코딩
 			   			=> 지금까지 코딩한 모든 내용
 			   			=> 에러 발생시  catch로 이동
 			   			 ----------------------
 			   			  에러 밑에 있는 문장은 수행하지 않는다
 			   			  
 			   		} catch(예외처리 클래스) {
 			   		
 			   			try수행시 에러가 발생할때 처리되는 문장
 			   			여러개를 사용할 수 있다
 			   			=> 순서가 존재 (상속도)
 			   			=> 상속을 내리는 클래스가 처리하는 예외가 많다
 			   			
 			   		} finally { 
 			   		
 			   			생략 가능
 			   			try,catch수행 상관없이 무조건 수행
 			   			=> File 닫기
 			   			=> 오라클 연결 해제
 			   			=> 서버 연결 해제
 			   		}
 			   		= 예외회피 : 예외 떠넘기기 (라이브러리) ***
 			   		 => 사용법
 			   		 	메소드선언 뒤에 예상되는 에러를 선언
 			   		 	=> 메소드 호출시에 처리할 수 있게 만든다
 			   		 		===> 사용하는 프로그래머가 처리해서 사용
 			   		 		===> 1) 선언
 			   		 			 2) try~catch
 			   		 		예) public void method() throws 예외처리클래스,예외처리클래스....
 			   		 			{							-------------------순서가 없다
 			   		 										method호출시에 예상되는 에러 체크
 			   		 			}
 			   		 			
 			   		 			==> 메소드 호출
 			   		 			public void display() throws 예외처리클래스,예외처리클래스....
 			   		 			{
 			   		 				method()
 			   		 			}
 			   		 			public void display()
 			   		 			{
 			   		 				try {
 			   		 					method();
 			   		 				} catch(예외처리클래스() {}
 			   		 			}
 			   		 			
 			   		 			선언된 예외클래스가 많은 경우
 			   		 			=> 1) 전체를 사용 catch()를 여러개 사용
 			   		 			=> 2) 전체를 포함 클래스로 통합
 			   		 				 -------------------- Exception / Throwable
 			   		 			
 			   		 			예)
 			   		 				public void method() throws IOException, InterruptedException, SQLException
 			   		 				{
 			   		 				}
 			   		 				
 			   		 				호출
 			   		 				public void display()	==> 오류 (아래 catch절이 3개 있어야함)
 			   		 				{
 			   		 					try {
 			   		 					} catch(IOException e) {
 			   		 					} 
 			   		 				}
 			   		 				
 			   		 				-----------------------------------------------
 			   		 				public void display()	==> 정상수행 (Exception이 상위 클래스이기 때문에 하나 써도됨)
 			   		 				{
 			   		 					try {
 			   		 					} catch(Exception e) {
 			   		 					} 
 			   		 				}
 			   		= 예외 임의 발생 : throw (테스트용으로 사용) => 배포
 			   		= 사용자 정의 예외처리 : 거의 없다
 			   			class MyException extends Exception
 			   			=> if문 
----------------------------------------------------------------------  자바의 문법(8장)
															=> 프로그램 상에서 제어가 안되는 경우가 많다
																=> 다른 프로그램과 연동
																브라우저 , 오라클 ...
																=> 파일 읽기/쓰기
																=> 프로그램안에 다른 프로그램을 동시 동작
																=> 자료구조 (메모리관리)
																----------------> 직접 만들어서 제공 (라이브러리)
																----------------> 사용자 정의 클래스+라이브러리 => 조립
 			   		
 		9장/10장 => 라이브러리
 		-----------------
 		java.lang : 자바 프로그램의 기본 라이브러리 (가장 많이 사용)
 					=> import를 생략 
 			라이브러리 => 변수는 없다 / 메소드 (기능)		
 			=> Object
 			***	=> Object clone() : 복제 (prototype: Spring)
 				   새로운 메모리를 생성
 				=> equals() : 객체 비교 (오버라이딩을 하기전까지는 메모리 주소를 비교)
 									 -------- 값을 비교 : String
 			***	=> toString(): 객체를 문자열화 (디폴트는 메모리 주소 리턴)
 				=> finalize(): 소멸자 (객체 메모리 해제 => 자동 호출)
 			=> String : <String클래스문제> 확인
 			=> StringBuffer : 문저욜 굘헙 => append()
 			=> Wrapper
 			   -------
 			   기본데이터형을 사용하기 쉽게 기능을 부여 => 클래스
 			   int	==>	 Integer
 			   double  ==> Double
 			   boolean ==> Boolean
 			   long ==> Long
 			   
 			   => 문자열을 해당 데이터형으로 변경할때 주로 사용
 			   	  "10" => 10
 			   	  Integer.parseInt("10")	=> 10
 			   	  Double.parseDouble("10.5")  => 10.5
 			   	  Boolean.parseBoolean("true") => true
 			   	  Long.parseLong("10") => 10L
 			   	  
 			   => 제네릭 사용시
 			   	컬렉션 정수 저장
 			   	List<Integer> => List<int>
 			   	-------------
 			   	List<Double> 제네릭 => 항상 클래스형으로만 등록 가능
 			   	=> 호환
 			   	   Integer i = 10 => 오토박싱(박싱)
 			   	   int i = new Integer(10) => 언박싱
 			=> System : gc()
 			=> Math: ceil(), round(), random()
 			
 		java.util
 		---------
 			=> 프로그램에서 많이 사용되는 유용한 클래스의 집합
 			
 			=> 날짜
 			   Date/Calendar
 			   Date => 기능이 없다 (단지 날짜를 저장할 목적)
 			   Calendar는 Date에 없는 기능을 보완 => 달력
 			   	=> 날짜 설정
 			   	   Set(Calendat.YEAR, 2023)..
 			   	   				---- MONTH, DATE
 			   	=> 설정된 날짜 읽기
 			   		get(Calendar.YEAR), MONTH, DATE
 			   	=> 요일 읽기 get(Calendar.DAY_OF_WEEK)
 			   	=> 월 (month) => 0부터 시작한다
 			   		월 등록할때는 month-1
 			   	=> 요일 (week) => 1부터 시작한다
 			   		요일 등록할때는 week-1
 			   		
 			=> 문자열 분해
 				StringTokenizer
 					=> counterTokens(): 분해된 문자열의 갯수
 					=> hasMoreTokens(): 데이터가 존재할때까지 => true
 					   while문을 이용해서 주로 사용
 					=> nextTokens(): 실제 분해된 데이터 읽을 경우에 주로 사용
 					=> 오라클 연동 / 네트워크로 상대방에 값을 전송
 					
 			=> 자료구조: 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 			   ----- 컬렉션 (데이터를 모아서 관리) => 가변형 (크기를 결정하지 않는다)
 			   ----- 관리프로그램을 제작 (사람,영화...)
 			   ----- 표준화(모든 프로그래머가 동일하게 사용)
 			   		 --- 인터페이스
 			   		 	Collection
 			   		 	    |
 			   		---------------------------		
 			   		|						  |
 			   	  List						 Set	     Map => 인터페이스
 			   	    |						  |			   |
 			 ***  ArrayList				***	HashSet	 *** HashMap	=> 구현된 클래스
 			   	 Vector						TreeSet		HashTable	 
 			   	 LinkedList
 			   	 
 			   	 List : 순서가 존재(인덱스번호 0번부터 시작), 중복 데이터 허용
 			   	 		오라클(데이터베이스) 연동시 주로 사용되는 클래스
 			   	 			 -------- 메모리, 파일, RDBMS(관계형 DB)
 			   	 			 	|			----------------영구적인 저장 장치
 			   	 			 	|
 			   	 			 변수, 배열, 클래스 => 메모리 => 파일 => 오라클 서버
 			   	 			 								 구분 (제약조건)
 			   	 			 								 => key
 			   	 	=> 대표적: ArrayList
 					=> WEB => 데이터를 모아서 전송할때(목록)
 					=> 주로 사용 기능 (메소드)
 					 ***1) 데이터 추가: add()
 						2) 데이터 수정: set()
 					 ***3) 저장된 데이터 읽기: get(int index)
 					 ***4) 저장 갯수: size()
 					 ***5) 전체 삭제: clear()
 						6) 데이터 존재여부: isEmpty()
 					
 			   	 Set : 순서가 없다, 데이터중복을 허용하지 않는다
 			   	 		=> List에서 중복된 데이터를 추출
 			   	 		***1) 데이터 추가: add()
 			   	 		***2) 저장된 데이터 읽기: get(int index)
 			   	 		***3) 저장 갯수: size()
 			   	 		***4) 전체 삭제: clear()
 			   	 	=> HashSet
 			   	 	=> 네트워크에서 서버에 접속하는 클라이언트의 IP, PORT
 			   	 	=> Web 채팅
 			   	 	
				 Map : 순서가 없다, key-value => 두개를 동시에 저장
				 	=> HashMap
				 	=> WEB(지원하는 클래스 => Map)
				 	   클래스를 여러개 모아서 관리 (Spring, MyBatis)
				 	=> put() : 저장시에 사용
				 	=> get(key): 저장된 데이터 읽기
			
			1) 기본 생성자를 사용하게 되면 모든 데이터형은 Object
				List list = new ArrayList();
				=> 저장
					add(Object)
					Object get(int index)
					
				Map map = new HashMap();
				=> 저장
					put(String s, Object o)
					Object get(key)
					 
				Set set = new HashSet();
				=> 저장
					add(Object)
					Object get(int index)
					=> 관리하기 어렵다
					=> Object가 추가되면 모든 데이터형을 첨부
						=> 데이터형이 섞여있으면 관리가 어려운 것은 => for문 수행이 어렵다
						=> 같은 데이터형을 첨부하는 것이 편리하다
						=> Object리턴이면 반드시 형변환을 시킨다
						(제네릭)
							=> 메소드에서 사용되는 모든 매개변수, 리턴형을 통일화 
							=> 형변환 할 필요가 없기 때문에 소스가 간결하다
							=> 표준화 시킬 수 있다
							=> 클래스 뒤에 <데이터형:반드시 클래스형으로만 사용>
							예)
								문자열
								List<String> => add(String s), String get(index)
								정수
								List<Integer> => add(Integer i) , Integer get(index)
													-----------	  -----------------
													 int(오토박싱)		  int (언박싱)
---------------------------------------------------------------------------------------
 		java.text
 			날짜 변경(출력 형식) : SimpleDataFormat()
 				<fmt: formatDate>
 				<fmt: formatNumber>
	 			년도:	 yyyy
	 			월:	MM , M
	 			일:	dd , d
	 			시간: hh , h
	 			분:	mm , m
	 			초:	ss , s
	 			==> yyyy/MM/dd , yyyy-MM-dd
 			숫자: DecimalFormat ==> ##, ###
 			=====> 오라클 (TO_CHAR)
 		java.io
 		java.net
 		java.sql
 */
public class 정리_1 {

	public static void main(String[] args) {

	}

}
