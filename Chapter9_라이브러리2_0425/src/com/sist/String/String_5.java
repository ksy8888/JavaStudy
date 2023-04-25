package com.sist.String;

import java.nio.file.spi.FileSystemProvider;

//concat: 문자열 결합 (+)
/*
 	String s1 = "Hello";
 	String s2 = "Java";
 	s1.concat(s2) ==> "Hello Java";
 	
 	===> concat ==> MySQL LIKE문장을 만들때
 	
 	endsWith : 끝나는 문자열이 같은 경우에 사용 
 	boolean endsWith(String s)
 	String concat(String s)
 	---------------------------------------
 	charAt()
 	equals(): 대소문자 구분 , equalsIgnoreCase(): 대소문자 구분없이 비교
 	-------ID,PWD		  ----------------- 영어검색, 영문이름
 	indexOf(), lastIndexOf()---> 뒤에서부터찾는다
 	------- 위치확인(문자/문자열)
 	------- 앞에서부터 찾기
 	length(): 문자의 갯수
 	startsWith(): 시작문자열이 같은 경우 => suggest *** (자바로 시작하는 단어들 검색)
 	substring(): 원하는 문자열을 자를 때
 	trim(): 공백 제거
 	split(): 특정 문자로 자를 때
 	contains(): 포함문자열인지 확인
 	valueOf(): 모든 데이터형을 문자열 반환
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String s1 = "Hello ";
		String s2 = "Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);	
		
		if(s1.endsWith(""))		//공백 포함됨
			System.out.println("o자로 끝났다");
		else
			System.out.println("o자로 끝나지 않았다"); 
*/
		String[] data = {"JAVA", "java", "Java", "JAva", "JAVa", "jaVA", "javA"};
		for(String s:data) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		//equals는 대소문자를 구분해서 비교
		//원형: boolean equals(String s)
		//라이브러리 => 1)기능 2)리턴형 3)매개변수 4)사용처 => 로그인,상세보기
		System.out.println("===== equalsIgnorecase() ======");
		for(String s:data) {
			if(s.equalsIgnoreCase("java")) {
				System.out.println(s);
			}
		}
		//equalsIgnoreCase: 대소문자를 구분하지 않고 비교
		//원형: boolean equalsIgnoreCase(String s)
		//사용처: 검색, 영문이름, 영문으로 된 데이터를 찾는 경우
		//한글 찾을 떈 equals
		//한글 => 자음으로 찾기 => 사용자 정의
		
		System.out.println("===========length()=============");
		String[] data2 = {
				"apple",
				  "avocado",
				  "banana",
				  "blackberry", 
				  "blueberry",
				  "cherry tomato",
				  "cherry",
				  "coconut", 
				  "grape" ,
				  "kiwi" ,
				  "lemon" ,
				  "lime" ,
				  "mango" ,
				  "melon" ,
				  "orange" ,
				  "papaya" ,
				  "peach" ,
				  "pear" ,
				  "persimmon" ,
				 "pineapple" ,
				  "plum" ,
				  "strawberry" ,
				  "tangerine" ,
				  "tomato" ,
				 "watermelon" 
		};
		//1. 각 과일명의 문자길이를 출력
		for(String s:data2) {
			System.out.println(s+":"+s.length());
		}
		
		System.out.println("=================================");
		
		System.out.println("가장 긴 이름의 과명을 출력");
		
		int max=0;
		for(String s:data2) {
			
			if(max<s.length()) {
				max=s.length();
				
			}
			
		}  
		for(String s:data2) {
			
			if(s.length() == max){
				System.out.println(max);
				System.out.println(s);
			}
		}
		
		
		System.out.println("=============== startsWith ==================");
		// startsWith => 시작문자열이 같은 경우
		// 원형: boolean startsWith(String s)
		// 사용처: 자동 완성기 (검색기), 쿠키 검색
		for(String s:data2) {
			if(s.startsWith("w")) {	//p로 시작하는 단어 출력
				System.out.println(s);
			}
		}
		
		System.out.println("=============== Trim() ==================");
		//trim(): 좌우 공백 제거
		//원형: String trim()
		//사용처: 로그인, 회원가입, 검색...
		String id="admin";
		if(id.equals(" admin".trim())) {
			System.out.println("같은 ID");
		} else {
			System.out.println("다른 ID");
		}
		
		
		System.out.println("=============== contains ==================");
		for(String s:data2) {
			if(s.contains("a")) {
				System.out.println(s);
			}
		}
		//contains: 포함 문자열을 찾는 경우
		//원형: boolean contains(String s)
		//사용처: 검색, 추천 
		//추천 => 네이버 블로그 , 카페 => 포함된 영화명...
		
		System.out.println("=============== valueOf() ===============");
		//valueOf: String에서 유일한 static 메소드
		//모든 데이터형을 문자열로 변환
		//원형: static String valueOf((type)) => 오버로딩된 상태
		//사용처: 자바에서 윈도우 전송, 네트워크 전송 , 웹 (String만 인식)
		System.out.println(String.valueOf(10)+String.valueOf(30));
		//"10"+"30"==> "1030"
		
		
		System.out.println("=============== subString ===============");
		//substring() indexOf() , lastIndexOf()
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res=ss.substring(ss.lastIndexOf("/")+1); 	//main.do		
		System.out.println(res);
		
		ss=ss.substring(ss.indexOf("//")+2);
		System.out.println(ss);
		res =ss.substring(0, ss.indexOf("/"));
		System.out.println(res);	//localhost:8080
		
		ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res=ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());	//지 앞에 공백이 있기때문에 제거해줌
		
		res=ss.substring(ss.indexOf("지")+2);
		System.out.println(res.trim());
		//substring(): 문자열을 자르는 경우
		// 오버로딩
		// substring(int s) => s번째부터 마지막까지 잘라온다
		// substring(int s, int e) => s부터 e-1까지 잘라온다
		// 원형: String substring(int a)
		//		String substring(int s, int e)
		// 사용처: URL주소 제어, 주소 제어, 문자열이 긴 경우...
		
		System.out.println("=============== split ===============");
		ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");				//구분자는 ,
		// 특수문자별로 잘라서 배열에 저장...
		// 원형: String[] split(String regexp)
		// 구분이 되어있는 문자열이 있는 경우 분리 ...
		for(String name:names) {
			System.out.println(name);
		}
		
		ss = "소고기쌀국수"
				+ "9,900원"
				+ "똠얌쌀국수"
				+ "12,000원"
				+ "소이뼈국수"
				+ "12,900원"
				+ "쏨땀"
				+ "12,000원"
				+ "소이 뽀삐아"
				+ "13,000원";
		String[] menu = ss.split("원");
		
		for(String m : menu) {
			System.out.println(m+"원");
		}
		
		ss = "red|blue|green|black|white|yellow";
		String[] color = ss.split("\\|");	// |는 정규식에서 사용하는 기호
		// | , ? , . , + , * , ^ >> 출력하려면 앞에 \\
		for(String c : color) {
			System.out.println(c);
		}
		
		System.out.println("=============== replace() ===============");
		// replace(): 문자/문자열 변경
		// 원형: String replace(char old, char new)	old를 new로 바꿈
		// String replace(String old, String new)
		ss= "https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 오라클에서 scanner 역할 >> &   
		//&를 바꿔줘야함	
		System.out.println(res = ss.replace("&", "#"));
		
	} 

}
