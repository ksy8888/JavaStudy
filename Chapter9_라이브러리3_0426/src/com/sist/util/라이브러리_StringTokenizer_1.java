package com.sist.util;

/*
 	StringTokenizer: 문자열 분리
 	1) split() 를 대체함
 	2) 빅데이터 / 네트워크 / 웹 
 	-------------------------
 	기능
 	 = 생성자 
 	 String s1 ="애니메이션/어드벤처/코미디";  
 	 		>> StringTokenizer st = new StringTokenizer(s1 , "/")
 	 
 	 String s2 = "박서준 ,  아이유 ,  김종수 ,  고창석 ,  정승길 ,  이현우 ,  양현민 ,  홍완표 ,  허준석 ,  이하늬"; 
 	 		>> StringTokenizer st = new StringTokenizer(s2)
 	 
 	 	StringTokenizer st = new StringTokenizer("구분할 문자열" , 구분자)	=> 구분자를 통해 자름
 	 	
 	 	StringTokenizer st = new StringTokenizer("구분할 문자열")	=> 공백을 통해 자름
 	 	
 	  = 기능
 	  	1) countTokens() : 분리된 데이터 갯수
 	  	2) nextToken() : 분리된 데이터 읽기
 	  	3) hasMoreTokens() : 분리 갯수만큼 수행
 */
import java.util.StringTokenizer;

public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="애니메이션/어드벤처/코미디";
		//StringTokenizer st = new StringTokenizer(s1 , "/");
		
		 String s2 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
 				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				 + "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "; 
	 
		StringTokenizer st = new StringTokenizer(s2);
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		
//		int a = st.countTokens();	//숫자센거 초기화 시켜줘야함 루프안에 바로 st.countToken넣으면 안됨
//		for(int i=0; i<a; i++) {
//			//System.out.print(st.countTokens());
//			System.out.print(st.nextToken() + " ");
//		}
		
		
	}

}
