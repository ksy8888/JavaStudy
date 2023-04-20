package com.sist.main2;

//Object 는 모든 클래스의 상위 클래스(모든 클래스는 Object상속을 받는다 = 최상위 클래스)
/*
 		class A	(extends Object)
 		class B extends A
 		
 		 Object
	 		|
	 		A
	 		|
	 		B
	 	Object o = new A()
	 	Object o = new B()

스프링:클래스를 관리하는 영역. container
 */
public class Container {
	public Object getBean(int no) {
//		Object o = new A();
//		o=new B();
//		o=new C();
//		o=new D();
//		o=new E();
//		return o;
		Object o = null;
		if(no==1)
			o=new A();
		else if(no==2)
			o=new B();
		else if(no==3)
			o=new C();
		else if(no==3)
			o=new D();
		else if(no==4)
			o=new E();
		return o;
	}
}
