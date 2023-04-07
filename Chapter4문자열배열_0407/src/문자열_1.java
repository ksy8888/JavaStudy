/*
 	문자열 데이터형 : 참조형
 	=> String : 문자열 저장
 	문자 
 	-- 
 	' ' => 한글자 저장(char) 
 	문자열
 	----
 	" " => 여러개의 문자를 동시에 저장
 	
 	String => char[]
 	-----     ------
 	"홍길동"    {'홍','길','동'}
 	
 	String: => java.lang.String에 존재 => 라이브러리
 	------
 	  일반데이터 (문자열 저장), 클래스형 => 지원하는 기능 (메소드)
 	  => 가장 많이 사용되는 데이터형 (기본형처럼 사용)
 	  => 웹, 윈도우 => 무조건 문자열 통신
 	  => 가장 많이 사용되는 데이터형: int, String
 	 => 사용법 
 	 	String name = "홍길동";
 	 	//String name = new String("")
 	 => String에서 지원하는 메소드 (변경할 수 없다) = 표준화
 	 	Math.random() , Math.ceil(): 올림함수_총 페이지 , Math.round(): 반올림함수...
 	 	------- 임의로 숫자추출
		중요시 => 메소드는 결과값 => 받아서 처리
		1) 대문자 변환 toUpperCase()
			String s = "hello java";
			String result = s.toUpperCase()
			=> result = "HELLO JAVA"
		2) 소문자 변환 toLowerCase()
			String s = "Hello Java";
			String result = s.toLowerCase()
			=> result = "hello java"
		3) 찾기
		------------------
			startsWich => 시작 문자열이 같은가 => 결과값 true/false => if문
			endsWich => 끝나는 문자열이 같은가 => 결과값 true/false => if문
		------------------ 서제스트(자동 완성기)
		***	contains => 포함 문자 (검색) => 추천 => 결과값 true/false
			
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] msg = {'H','e','l','l','o','J','a','v','a'};
		System.out.println("====대문자 변환====");
		for(char c:msg)
		{
			if(c>='a' && c<='z') //소문자라면
			{
				System.out.print((char)(c-32));
				// 'A' = 'a'-32
			}
			if(c>= 'A' && c<='Z') //대문자라면
			{
				System.out.print(c);
			}
		}
		 System.out.println("\n====== 소문자 변환 ======");
		 for(char c:msg)
			{
				if(c>='a' && c<='z') //소문자라면
				{
					System.out.print(c);
					// 'A' = 'a'-32
				}
				if(c>= 'A' && c<='Z') //대문자라면
				{
					System.out.print((char)(c+32));
				}
			}
		 
		 System.out.println("\n====== 문자열 ======");
		 String s = "Hello Java";
		 System.out.println("====== 문자열에서 대문자 변환 ======");
		 System.out.println(s.toUpperCase());
		 System.out.println("====== 문자열에서 소문자 변환 ======");
		 System.out.println(s.toLowerCase());
		 /*
		  * 	String toUpperCase()
		  * 	{
		  * 	}
		  *
		  * 	==
		  * 
		  * for(char c:msg)
			{
				if(c>='a' && c<='z') //소문자라면
				{
					System.out.print((char)(c-32));
					// 'A' = 'a'-32
				}
				if(c>= 'A' && c<='Z') //대문자라면
				{
					System.out.print(c);
				}
			}
		  */
		 	
	}

}
