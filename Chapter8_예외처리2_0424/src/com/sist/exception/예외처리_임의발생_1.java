package com.sist.exception;
/*
 	임의발생 : 테스트목적
 	---------------- 배포전 (배포:상용화)
 	형식)
 		throw new 예외처리생성자()
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args)  {	//main에 throw 형식으로 쓰면 복구 안됨
		// TODO Auto-generated method stub
		
		try {
			int a = 10;
			if(a%2==0) {
				System.out.println("임의로 예외발생");
				throw new NumberFormatException("정수 변환이 안됨"); // ==> catch로 이동하기 때문에 아래에 코딩 못함
				//throw => 사용자 정의 예외처리
				//getMessage변경 => 생성자 매개변수 이용
				/*
				 	 class NumberFormatException extends Exception
				 	 {
				 	 	private String message = "default문자열";
				 	 }
				 */
				//Integer.parseInt(" 10");
			}
		} catch(ClassCastException e) {
			System.out.println(e.getMessage());
			// 에러 확인 ==> 에러부분을 수정
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException: "+ e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
