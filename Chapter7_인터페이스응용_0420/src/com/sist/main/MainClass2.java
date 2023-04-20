package com.sist.main;

class A
{ 
	public A() {	//상위 생성자에서 매개변수 있는 생성자 만드려면 위에 기본 생성자를 만들어놔야 사용 가능
		System.out.println("A() Call...");
	}
	public A(int a) {
		System.out.println("A1() Call...");
	}
	
	
}
class B extends A
{
	public B() {
		System.out.println("B() Call...");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new B();
	}

}
