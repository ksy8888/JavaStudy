package com.sist.main;

//Math클래스는 지원하는 모든 메소드가 static
import static java.lang.Math.random;

/*
 		void method() 
 		{
 			return; //자동 설정(생략가능) => void에서만
 			==> 중간에 존재할때도 있다
 		}
 */


public class 클래스_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = (int)(random()*100)+1;
//		System.out.println(a);
		
		int a = 10;
		if(a%2==0) {
			System.out.println("a= "+a);
			return;
		}
		System.out.println("1");	//위에서 return으로, 프로그램 종료
		System.out.println("2");	//따라서 1과 2는 출력 안됨
		
	}

}
