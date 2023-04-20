package com.sist.main;
/*
 	1. 사용처 => 응용
 	-----------------
 	인터페이스 : 추상클래스의 일종 (보완)
 		1) 다중 상속 가능
 		2) 인터페이스는 클래스와 동일 (상속을 받으면 상위 클래스다)
 		3) 설계만 되어 있다 (구현이 안된 메소드만 모아서 선언)
 		4) 장점
 		   ---
 		    = 기능 설계 => 개발 시간 단축
 		    = 요구사항 분석 => 데이터베이스 설계 => 데이터 수집 => 화면 UI => 구현
 		    = 표준화 기능 : 같은 메소드를 사용
 		    ---------스프링(통합)
 		     프레임워크
 		    
 		    = 서로 관계없는 클래스 연결해서 사용가능
 		    = 유지보수가 편리하다
 		    = 독립적으로 사용이 가능
 	----------------------------------------------
 	 클래스 여러개를 묶어서 한개의 이름으로 제어 가능
 	 		List(*************)
 	 		 |
 		-----------------------------------------------
 		|			 |			|		|		 |
 	ArrayList	 LinkedList	 Vector	   Queue   Stack
 	
 		List list = new ArrayList()
 		list = new Vector()
 		list = new LinkedList()
 		list = new Queue()
 		list = new Stack()
 		
 		웹에서 가장 많이 사용하는 라이브러리
 		--------------------------
 		1. String
 		2. List
 		3. Integer (int를 사용하기 편리하게 만든 클래스)
 			웹/윈도우 => 모든 데이터형 (String)
 		--------------------------
 		
 		=> 형식)
 			[접근지정어] interface InterfaceName
 			{
 				-------------------------
 				상수
 					int a; ==> 오류
 					(public static final) int a=10;
 					------------------
 						자동추가
 				-------------------------
 				추상메소드
 					void display();
 					(public abstract) void display();
 				-------------------------
 			}
 		자동추가
 		1) import java.lang.*; => String , Math...
 		2) 메소드 => void aaa()
			 		{
			 			=> return;
			 		}
		3) 생성자 => class A
				   {
				   		=> A() {}
				   }
		4) 인터페이스
			변수선언 => (public static final) int a=10;
					  (public abstract) void display();
					  구현이 가능한 메소드
					  : (public) default void aaa() {}
	
	interface는 상수, 메소드 => public만 사용한다
	= 선언만 되어있다 => 상속을 내린다
		=> 상속받은 클래스를 구현해서 사용 (오버라이딩)
	= 다중상속을 지원한다
	 -------
	 상속과정
	 -----
	 interface A
	 class B implements A 
	 	     ---------- 구현후에 사용
	 
	 interface A
	 interface B ( extends ) A
	 
	 interface A
	 class B ( implements ) A
	 -------------------------------
	 class A
	 interface B () A ==> 오류
	 -------------------------------
	 
	 interface A
	 interface B extends A
	 class C implements B	==> 단일 상속
	 
	 interface A
	 interface B
	 class C implements A,B ==> 다중 상속
	 
	 interface A
	 interface B
	 class C
	 class D extends C implements A,B
	 
	 -----------------------------------------
	 interface A
	 {
	 	void aaa();
	 }
	 class B implements A
	 {
	 	public void aaa() {} ==> public 없으면 오류
	 }
					  
	249 page
	1) 인터페이스는 객체를 생성할 수 없다 (구현이 안된 메소드를 가지고 있기 때문에 메모리에 저장이 불가능)
		인터페이스 = new 구현할 클래스()
		=> 익명의 클래스를 이용하면 객체 생성할 수 있다
	
	2) 인터페이스는 다중 상속이 가능하다
		class A implements 인터페이스 , 인터페이스...
								  --- 
		
 */
interface AA {
	int a=10;
	void aaa();
}
interface BB {
	int a=10;
	void bbb();
}
class CC implements AA,BB {
	//AA.a , BB.a
	public void print() {
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb() 구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa() 구현");
	}
}

//interface A
//{
//	public int a=10;
//	//private int a=10; >> 오류
//	
//	public void display();
//	//protected void display(); >> 오류
//}


public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c = new CC();
		c.print();
		c.aaa();
		c.bbb();
		
		///////////////////////////////
		AA aa = new CC();			//implements도 extends와 동일하게 적용
		//bbb() 호출을 못한다
		
		aa.aaa();
	//	aa.bbb();	==> 오류. AA에 bbb라는 메소드가 없음
		
		BB bb = new CC();
		bb.bbb();
	
	}

}
