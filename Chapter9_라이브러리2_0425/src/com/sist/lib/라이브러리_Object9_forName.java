package com.sist.lib;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

class A {
	public void aaa() {
		System.out.println("aaa() Call...");
	}
	public void bbb() {
		System.out.println("bbb() Call...");
	}
	public void ccc() {
		System.out.println("ccc() Call...");
	}
	public void ddd() {
		System.out.println("ddd() Call...");
	}
	public void eee() {
		System.out.println("eee() Call...");
	}
}
public class 라이브러리_Object9_forName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("메소드명 압력: ");
		String m = scan.next();
		
/*		A a = new A();
		
		if(m.equals("aaa"))
			a.aaa();
		else if(m.equals("bbb"))
			a.bbb();
		else if(m.equals("ccc"))
			a.ccc();
		else if(m.equals("ddd"))
			a.ddd();
		else if(m.equals("eee"))
			a.eee();
*/
		try {
			//리플렉션 => 클래스이름으로 클래스정보 읽기 => 모든 제어가 가능
			// 변수 제어 , 자동 메모리 할당 , 메소드 호출 , 생성자 변경...
			Class clsName = Class.forName("com.sist.lib.A");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			/*
			 getDeclaredConstructors() : 해당 클래스에 선언된 모든 생성자를 배열의 형태로 반환합니다. 여기에는 private으로 선언된 생성자도 포함
			 */
			
			//메소드 읽기
			Method[] methods = clsName.getDeclaredMethods();
			
			//System.out.println(Arrays.toString(methods));
			
			for(Method mm:methods) {
				if(m.equals(mm.getName())) 
				{
					mm.invoke(obj, null);	
					/*
					  리플렉션에서 메서드를 동적으로 실행하기 위해서는 이 메서드를 사용해야 되는데요. 매게 변수를 2개 필요로 합니다.
					   obj는 메서드(여기서는 setName())를 실행하기 위한 객체이고, args는 메서드(setName())를 실행하기 위해 필요한 매게 변수입니다.

					 */
				}
			}
		} catch(Exception e) {
			
		}
	}

}
