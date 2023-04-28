package com.sist.lib;

import java.util.*;

class Person implements Cloneable {
	private String name;	//데이터 은닉화
	private int age;
	
	public String getName() {	//캡슐화 >> 은닉 데이터를 메소드를 통해 사용
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	////////// Object의 메소드를 오버라이딩 => 주소
	public String toString() {
		return name+"("+age+")";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();		//clone 복제 => 새로운 메모리를 만들어서 사용
	}
	
	//매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
public class 라이브러리_Set_1 {

	public static void main(String[] args) throws Exception {
		
		Set set = new HashSet();
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("홍길동", 25);
		
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);
		
		Person p3 = p1;	// 주소만 넘겨주는 방식 > 저장이 안됨	
		System.out.println("p3=" + p3);
		
		Person p4 = (Person)p1.clone();	//저장 (새로운 메모리) 
		System.out.println("p4=" + p4);
		System.out.println(p4.getAge());
		System.out.println(p4.getName());
		
		set.add(p1);
		set.add(p2);
		set.add(p3);	//저장안됨
		set.add(p4);
		System.out.println(set);	//Set >> new , clone 을 이용해서 add
		
	}

}
