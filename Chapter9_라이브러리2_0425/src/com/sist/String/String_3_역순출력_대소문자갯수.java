package com.sist.String;

//String 메소드 (문자열 제어하는 기능)
/*
 	String은 문자열 배열
 	----- 문자마다 인덱스번호를 가지고 있다 (0부터 시작)
 	String s = "Hello java";
 	
 	주요기능 (310page)
 	1) 문자열에서 문자 한개 추출 => char charAt(int index)
 */
import java.util.Scanner;
public class String_3_역순출력_대소문자갯수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello ";
//		System.out.println(s1.hashCode());
//		s1 = s1+"Java";
//		System.out.println(s1.hashCode());
		
		String msg = "Hello Java";
	/*	for(int i=0; i<msg.length(); i++) {
			System.out.println((i+1)+"번째 문자:" + msg.charAt(i));
			
		}
	*/
	
/*		//코딩 테스트 => msg를 거꾸로 출력하는 프로그램을 작성
		for(int i= msg.length()-1; i>=0; i--) {
			System.out.print(msg.charAt(i));
			
		}
*/
		//알파벳 문자열을 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		String num = scan.next();
		
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<num.length(); i++) {
			//System.out.print(num.charAt(i));
			if(num.charAt(i)>='A' && num.charAt(i)<='Z' ) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("대문자: "+  count1 + ", 소문자: " + count2);
	}

}
