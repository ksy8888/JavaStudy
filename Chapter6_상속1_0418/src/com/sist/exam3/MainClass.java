package com.sist.exam3;

//A => a, b, name, A(), print()
// 공유 => addr , display() ==> A가 마음대로 제어를 못한다
class A
{
	int a;
	int b;
	String name;
	static String addr;
	
	public A()
	{
		/* 사용가능
		 * 	int a;
			int b;
			String name;
			static String addr;
			print()
			display()
		 */	
		display();
		a=10;
		b=20;
		name="hong";
		addr="seoul";
		
	}
	public void print() {
		/* 사용가능
		 * 	int a;
			int b;
			String name;
			static String addr;
			print()
			display()
		 */
		display();
		a=10;
		b=20;
		name="hong";
		addr="seoul";
	}
	public static void display() {
		addr = "";	// ==> static은 static만 사용 가능
		
		A aa = new A();	//인스턴스는 new 객체 생성후에 사용가능
		aa.a=10;
		aa.b=20;
		aa.name="hong";
		aa.print();
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new HelloImpl();
		hello.sayHello("심청이");
	}

}
