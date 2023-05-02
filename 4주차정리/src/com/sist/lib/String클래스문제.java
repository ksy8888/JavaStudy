package com.sist.lib;

/*
 
 ★☆★☆ 1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)	 >> startsWith()
			boolean startsWith(String s)
			=> 검색기(Search Bar)

2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별) >> endsWith()

  	boolean endsWith(String e)

★☆★☆ 3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)	>> equals()
		boolean equals(String s)
		=> 로그인처리, 아이디중복... 상세보기

★☆★☆ 4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.	>> indexOf()
			String은 char[] => 인덱스번호 0부터 시작
			int indexOf(String s) , int indexOf(char c)


★☆★☆ 5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.	>> lastIndexOf()
			int lastIndexOf(String s) , int lastIndexOf(char c)

★☆★☆ 6. 문자열의 길이를 반환한다.	>> length()
		---------문자 갯수
		int length()

7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.

8. 정규표현식을 지정한 문자로 바꿔서 출력한다.	>> replaceAll()
   --------- 통계/분석 => 추천
   문자형식(패턴)을 만들어서 변경하는 역할
   String replaceAll(String regex, String s)

★☆★☆ 9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)	>> split()
 			------------
 			String[] split(String regex)
 			=> 패턴
 			[가-힣] 한글전체
 			[A-Za-z] 영문전체
 			[0-9] 숫자 전체
 			==> 파일 입출력(네트워크 프로젝트)
 			---------------크롤링
 
★☆★☆ 10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)	>> replace()
	String replace(String s, String s1)
	String replace(char c1, char c2)

11.  문자열에 대문자를 소문자로 변환한다.
	String toLowerCase() 

12. 문자열에 소문자를 대문자로 변환한다.
	String toUpperCase() 

★☆★☆ 13. 문자열을 그대로 반환해준다.
	String toString()
		
14. 문자열에 공백을 제거해 준다.
 	=> 좌우에 있는 공백만 제거
	String trim()

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
	String valueOf(모든 데이터형)
 	==> static 

★☆★☆ 16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
	boolean contains(String s)
	=> 검색
	
17. 지정한 index번째에 문자를 반환한다.
	char charAt(int index)

18. 문자와 문자를 결합해준다.
	+ , String concat(String s)

19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
	String format("%d%d...")
	==> static 
 */
public class String클래스문제 {

}
