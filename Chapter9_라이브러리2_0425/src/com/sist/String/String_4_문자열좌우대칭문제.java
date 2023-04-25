package com.sist.String;
// charAt(0)
//코테 
//문자열을 입력해서 좌우대칭인지 확인
//ABBA
import java.util.Scanner;

public class String_4_문자열좌우대칭문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String data="";
		
		while(true) {	///홀수이면 안됨. 예외처리
			System.out.println("문자열 입력: ");
			data = scan.next();
			if(data.length()%2!=0) {
				System.out.println("문자갯수가 짝수여야합니다");
				continue;
			}
			break;
		}
		
		System.out.println(data);
		
		boolean bCheck = false;
		int j=data.length()-1;
		for(int i=0; i<data.length()/2; i++) {		//절반으로 나눠서 비교
			if(data.charAt(i) == data.charAt(j)) {	//앞문자와 맨뒷문자 비교
				bCheck = true;
			}
			j--;
		}
		if(bCheck==true) {
			System.out.println(data+"는(은) 좌우대칭이다");
		} else {
			System.out.println("좌우대칭이 아니다");
		}
		
	}

	
//	System.out.println("문자열 입력: ");
//	String tt = scan.next();		
//	for(int i=0; i<tt.length(); i++) {			
//		//System.out.print(tt.charAt(i));
//		for(int j=i; j>=0; j--) {
//			//if()
//			System.out.print(tt.charAt(j));
//		}
//		
//	}
	
}
