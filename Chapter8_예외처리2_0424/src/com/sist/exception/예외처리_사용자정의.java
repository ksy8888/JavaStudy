package com.sist.exception;

import java.util.*;

//사용자 정의 => Exception을 상속
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
public class 예외처리_사용자정의 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력:");
		int num = scan.nextInt();
		
		try {
			if(num % 2 ==0) {						
				throw new MyException("짝수입니다");					// ←
			}														 // |						
																	 // |
		} catch(MyException e) {	//catch절에는 사용자 정의 못 불러옴 호출해야함 |
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
