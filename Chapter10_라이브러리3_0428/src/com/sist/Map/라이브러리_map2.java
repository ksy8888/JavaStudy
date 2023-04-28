package com.sist.Map;
import java.util.*;



class A {
	public void execute() {
		System.out.println("A: excute() Call...");
	}
}

class B {
	public void execute() {
		System.out.println("B: excute() Call...");
	}
}

class C {
	public void execute() {
		System.out.println("C: excute() Call...");
	}
}

//클래스 A,B,C 한번에 묶기 
//Spring => 클래스 관리자 (게임)
class Container {
	Map map = new HashMap();
	
	///싱글턴
	public Container() {	//메모리누수현상 막음
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	
	public Object getBean(String key) {
		return map.get(key);
	}
}
public class 라이브러리_map2 {

	public static void main(String[] args) {
		
		Container c = new Container();
		A aa = (A)c.getBean("a");
		aa.execute();
		
		A bb = (A)c.getBean("a");
		bb.execute();
		
		System.out.println("aa="+aa);
		System.out.println("aa="+bb);	//한개의 주소로 리턴됨
		
	}

}
