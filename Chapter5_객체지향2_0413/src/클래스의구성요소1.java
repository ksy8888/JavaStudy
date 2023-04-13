/*
 * 	기초
 	= 변수 , 데이터형 (정수:int, byte,long, 실수:double, boolean, char)
 	= 연산자 , 제어문
 	  ---- 단항 연산자(++,--,!, (type))
 	  ---- 이항 연산자 (산술, 비교, 논리, 대입)
 	  ---- 삼항 연산자 
 	  ---- 조건문 (단일 if, 선택 if~else, 다중 if~else if...)
 	  ---- 반복문 (for, while)
 	  			---- 이차 for, for-each
 	  ---- 반복제어문 (break)
 	= 배열: 1차
 	= 문자열 저장 => String
 		기능: 	
 		***	1) equals : 문자열 비교
 				boolean equals(String s)
 			2) startsWith : 시작문자열
 				boolean startsWith(String s)
 			3) endsWith : 끝문자열
 				boolean endsWith(String s)
 		***	4) contains : 포함
 				boolean contains(String s)
 			5) length : 문자 갯수
 				int length()
 			6) indexOf : 문자, 문자열의 위치 (처음부터 찾음)
 				int indexOf(char)
 				int indexOf(String)
 				*** 문자열은 index 번호가 0부터 시작
 				String s = "Hello Java";
 								   -			//////// 앞 a
 			>>	s.indexOf('a'), s.indexOf("a")
 			7) lastIndexOf : 문자, 문자열의 위치 (뒤에서부터 찾음)
 				int lastIndexOf(char)
 				int lastIndexOf(String)
 				
 				String s = "Hello Java";
 								     -			//////// 뒤쪽 a
 			>>	s.lastIndexOf('a'), s.lastIndexOf("a")
 			8) trim : 좌우 공백 제거
 				String trim()
 			9) valueOf : 모든 데이터형을 문자열로 변환
 				valueOf(1) => "1"
 				String valueOf(모든 데이터형)
 				사용 >> String.valueOf(1)
 				
 			10) replace	: 변환 (문자열, 문자)
 				String replace(char, char)
 							    old   new
 				Strint replace(String, String)
 			11) replaceAll : 변환 (문자열, 문자)
 				String replaceAll(String, String)
 								  ------ regexp => 정규식
 				replaceAll("[가-힣]","") >>> 한글 전체를 공백으로 바꿔라
 					[A-Z] [a-z] [0-9]
 			12) substring() : 문자열을 자르는 경우
 				String substring(int s)
 				String s = "Hello Java"
 				s.substring(6)  => Java //6번위치부터 잘라라
 				
 				String substring(int s, int e)
 				s.substring(0,5) => Hello  //0번부터 5번전까지 잘라라
 		
 		class : 설계 => 속성 , 기능 --메소드
 					 ----- 변수
 				웹 => 출력 내용 (변수)
 				  => 메뉴, 버튼 => 기능
 				  ---------------------- 요구사항분석 (설계)
 			추상화 : 설계 (기능, 데이터) : 사물을 단순화
 			class 설계 ==========> 메모리저장(인스턴스)
 						new (클래스를 저장할때 => new)
 		1. 구성요소
 			class ClassName
 			{
 				-----------------------------
 					변수(속성)
 						멤버변수
 						= 인스턴스변수 => new 사용시마다 따로 메모리를 만든다
 						= 정적변수(static) => 한개의 공간만 생성 => 공유변수	
 							=> 컴파일러에 의해 자동 생성(new 안써도됨)
 				-----------------------------
 				***	메소드(동작) : 기능
 				-----------------------------
 				***	생성자 : 멤버변수 (인스턴스변수) 초기화
 						메모리에 저장시 처음으로 호출되는 메소드
 				-----------------------------
 			}
 		2. 구성요소 사용법
 			1) 메모리에 저장
 				claas A
 				{
 					변수/메소드
 				}
 				
 				A a; 선언
 				a = new A();
 				
 				A a = new A();
 				
 				class A {
 					int sabun;
 					String name;
 					String getName() {}
 					int getSabun() {}
 					void run()
 				}
 				A a = new A();
 				 --- 
 				 a.sabun => a객체의 메모리 주소에 있는 sabun의 값을 가지고 온다
 				 			. => 메모리 주소 접근 연산자
 				 			
 				 		new => 데이터메모리를 모아준다
 				
 		3. 접근범위
 		4. 객체지향의 3대 요소
 		5. 클래스의 종류
 		6. 예외처리
 		--------------------------
 		API => 지정된 라이브러리 사용법 
 		
 		class A
 		{
 			int aa;
 		}
 		static class B {
 			A a = new A();
 		}
	
		B b = new B();
		B.a.aa;
	----------------------------------
		 class A
 		{
 			int aa;
 		}
 		class B {
 			A a = new A();
 		}
 		class C {
 			B b = new B();
 		}
	
		C c = new C();
		C.b.a.aa;			new로 생성된 "객체" 를 통해 접근함
 */



class Student {
	int hakbun;
	String name;
}
public class 클래스의구성요소1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
			//hong >> hakbun,name 
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim = hong;
		shim.hakbun=2;
		shim.name="심청이";
		System.out.println(hong.hakbun); //2
		System.out.println(hong.name);	//심청이

	}

}
