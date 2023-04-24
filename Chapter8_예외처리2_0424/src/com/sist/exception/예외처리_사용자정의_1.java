package com.sist.exception;
import java.util.*;

/*
 	자신 ===> 객체호출(this) , 생성자(this())
 	상위클래스 ==> 객체호출 (super) , 생성자 (super())
 	
 	class A 
 	{
 	}
 	class B extends A
 	{
 	}
 	
 	B b = new B(); ==> 호출 순서 new A() , new B()
 							  -------    ------
 							  super에 저장  this에 저장 
 							  super. : A , this. : B
 							  
 							  --------------------
 							      -----A----
 							      => super
 							      ----------
 							  --------------------
 							  	  -----B----
 							      => this
 							      ----------
 							  --------------------
 */
class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException(String msg) {
		super(msg);	//RuntimeException가 가지고 있는 생성자 호출
	}
}
public class 예외처리_사용자정의_1 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("점수 입력:");
			int score = scan.nextInt();
			
			if(score<0)
			{
				throw new MyRuntimeException("음수는 사용할 수 없습니다");
				// 장점 => 에러위치 확인 가능
				//사용자 정의 클래스를 호출할 때 사용
			}
			System.out.println("점수는 " + score + "점 입니다");
			
		} catch(MyRuntimeException ex) {
			System.out.println(ex.getMessage());
			System.out.println("-------------에러 발생 위치 확인----------------");
			ex.printStackTrace();
///			getMessage() => 에러에 대한 메세지만 전송
//			 	 	=> 에러에 대한 숙달
//			 	 printStackTrace() => 실행하는 과정 => 어디서 에러가 발생 했는지 확인
		}
	}
}
