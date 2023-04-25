package com.sist.lib;
// equals => Object에서는 객체비교 , String에서는 문자열
class Student2 {
	String name;

	public Student2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//재정의 하지 않는 경우는 ==동일하다
	//((Student2)obj) ==> 형변환
	//Object => equals는 사용빈도가 많지않다 => 오버라이딩을 사용해야된다
	// => String .. equals가 재정의 되어있다 (실제 문자열)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
			return name==((Student2)obj).name;	//문자열 비교
		else 
			return false;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("이름: "+ name);
	}
	
	
	
}
// == (객체=>주소) , equals (객체 가지고 있는 변수값 비교)
public class 라이브러리_Object5_equals {
	public static void main(String[] args) {
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		
		//객체비교
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("같지않다");
		}
		
		//주소값 비교 (default)
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("같지않다");
		}
	}
}
