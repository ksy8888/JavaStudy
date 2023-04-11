import java.util.Arrays;
import java.util.Scanner;

/*
 		클래스 구성요소
 		--------------------------------
 			변수 : 프로그램 종료시까지 유지하는 변수 (전역변수, 멤버변수)
 				 메소드안에서 사용되는 변수 (지역변수) ***
 				 기본형 / 참조형
 				 ----
 				 정수 : int, long
 				 실수 : double
 				 논리 : boolean
 				 참조형 : => 데이터가 여러개 (메모리 주소를 이용해서 연결)
 				 		배열 (1차원) --- 같은 크기의 데이터형
 				 		클래스 --- 다른 크기의 데이터형 (****)
 		-------------------
 			생성자 : 변수에 초기화, 클래스를 메모리에 저장시에 사용
 		-------------------
 			메소드 : 기능을 수행 , 다른 클래스와 연결 (메세지) ***
 				   ------- 연산자 / 제어문 (명령문)
 				   		   명령문의 집합
 				   		   => 1 다른 클래스와 통신 
 				   		   => 2 재사용 목적
 				   		   		----
 				   		   		기능을 최소화 (한개의 기능만 수행)
 				   		   		예)
 				   		   			회원
 				   		   			= 회원 가입
 				   		   			= 회원 수정
 				   		   			= 회원 탈퇴
 				   		   			= 로그인
 				   		   			= 로그아웃
 				   		   			= 아이디 찾기
 				   		   			= 비밀번호 찾기
 				   		   			==> 객체지향 (수정, 추가)
 		-----------------------------------------------------------------------
 		1. 메소드 형식
 			[접근지정어] [옵션] 리턴형 메소드명(매개변수)
 			public  static/final/abstract
 		2. 메소드 종류
 			리턴형	매개변수
 			-------------
 			 O		 O
 			 ==> String
 			 String substring(int s)
 			 String replace(String s1, String s2)
 			-------------
 			 O		 X			
 			 String trim()
 			 double random()
 			-------------
			 X		 O		
			 void println(String s)
			 void main(String[] arg)	
			 ---- 결과값이 없는 경우
 			-------------
 			 X		 X			
 			 void println()
 			 ------------
 		3. 메소드 구성요소
 			= 리턴형 (처리 결과값)  => 화면 출력 (데이터)
 								여러개인 경우: 배열 , 클래스 
 								예) 검색 , 상세보기 ...
 								한개인 경우: 기본형
 								예) 최대값 , 최소값 .. 합,평균 (double)
 								------------------- int
 								
 			= 매개변수 (사용자 요청값) : 여러개 : 3개 이상이면 => 배열, 클래스
 			ex) aaa(int a, int b, int c, int d, int e... int p)
 				=> aaa(int[] arr)
 								  한개: 기본형
 			= 메소드명 
 				알파벳으로 시작한다 (대소문자 구분)
 				숫자사용이 가능 앞에 사용금지
 				특수문자 사용이 가능 (_, $) ==>
 				_: 임시메소드 _main
 				_: 단어가 2개 이상 board_write()
 				키워드는 사용 금지 int...
 				약속 : 소문자 시작한다
 				------------------------------------- 식별자
 				*** 변수는 같은 이름으로 사용이 불가능하다
 				*** 메소드는 같은 이름을 사용할 수 있다 (오버로딩)
 				ex) plus(int, int)
 					plus(double, int)
 					plus(char, char) ... >> 메소드명이 같아도 매개변수만 다르면 가능
 				
 				*** 매개변수 (갯수를 알지 못하는 경우)
 				1. 장바구니 => 가변매개변수
 					(int...arg)
 					ex) printf(String format, Object... args)
 					
 */
public class 메소드1_난수발생 {
	// 사용자가 원하는 갯수만큼 난수 발생(1~100)
	// 사용자 => 갯수넘겨줘야함 (매개변수)
	// 리턴형 => 배열 
	//예약 가능한 날 / 예약 가능한 시간
	static int[] rand(int count) //count 갯수만큼 랜덤으로 배열생성
	{
		int[] arr = new int[count];
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int)(Math.random()*100)+1;
		}
		
		//결과값 전송
		return arr;
	}
			
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("난수 개수 입력: ");
		int count = scan.nextInt();
		
		int[] arr =rand(count);
		// 메소드 호출 (메소드명(매개변수값)) => 자신의 클래스
		// 다른 클래스에서 호출 => 클래스명.메소드명(매개변수값)
		System.out.println(Arrays.toString(arr));
		
	}

}
