package com.sist.dao;

public class aa {
	public static void main(String[] args) {
		
		String name ="홍길동";
		String sex = "남자";
		String addr ="서울";
		int age = 25;
		String sql = "INSERT INTO member VALUES('"+name+"', '"+sex+"','"+addr+"',"+age+")";
		System.out.println(sql);
	}
}
