/*
 		반복문 : 유사한 내용이 여러번 반복할 때 주로 사용
 				영화목록 , 맛집목록 , 메인 화면.. 상세보기(if)
 				페이징
 				
 		종류 : 
 			반복횟수가 정해져 있는 경우  : for
 			반복횟수가 정해지지 않은 경우 : while
 			한번 이상 수행이 가능 : do~while
 			-------------------------------------
 			자바 : 출력,제어 => for(2차, 중첩)
 				데이터베이스 , 네트워크 => while(1차)
 				
 		형식)
 			for		 1		2    4
 				for(초기값; 조건식; 증감식) {  => 2번 false면 종료/ 2번 true면 반복수행
 					반복 수행 문장   3
 				}
 				
 			while -------------------
 			초기값					1
 			while(조건문) { 			2	===> 조건이 false이면 수행을 못할 수도 있다
 				반복문장 수행문장			3
 				증가식				4	=> 2번이동 (true수행, false면 종료)
 			}
 			-------------------------
 			do~while
 			초기값					1
 			do {
 				반복 수행문장			2
 				증가식				3
 			} while(조건문);			4
 			
 			for => 2차
 				
 				
 */
public class 반복문_1_dowhile10ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] food = {
//			"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
//			"아삭아삭한 고추된장박이",
//			"누텔라 견과류 토스트 만들기",
//			"새송이버섯버터굴소스볶음 간단반찬",
//			"비엔나 만두 강정"
//		};
//		
//		String[] chef = {
//				"즐거운날랄라",
//				"라피네",
//				"레노아",
//				"비바스밥",
//				"해피레시피류이"
//			};
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(food[i] + "(" + chef[i]+ ")" );							
//		}
		
		/*
		 * 	for(초기값; 조건식; 증감식) {
		 		반복 수행문장
		 	} 	
		 */
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i + " ");
//		}
		
		//A~Z 출력	
//		for(char c='A'; c<='Z'; c++) {
//			System.out.print(c);
//		}
				
		// A를 26개 출력
		//int count=0;
		//int b;
		char c='A';
		for(int i=0; i<26; i++) {
			  // char c='A'; 루프안에 있으면 A가 26번 반복되어서 26번 출력됨
			System.out.print(c++ + " ");
			//b= count++;
			
		}
		System.out.println("\n=======while문========");
		/*
		 	while문
		 		=> 무한루프(네트워크 서버, DB 값 읽기, 파일 읽기)
		 		=> 파일읽기 => -1(EOF)
		 */
		//1~10까지 출력
		int i=1;
		while(i<=10) {
			System.out.print(i + " ");
			i++; // 제어_ 1에서 10까지 ==> 증가 (종료시까지 제어점)
		}
		System.out.println("\n=======while문========");
		
		//알파벳 출력
		c = 'A';	//전역변수로 위에 선언해둔 c 갖다쓰기
		i=0;
		while(i<26) {
			System.out.print(c++ + " ");
			i++;
		}
		
		System.out.println("\n=========do while문===========");
		
		/*
		 * do~while : 후조건 => 무조건 1번은 수행한다
		 * 형식)
		 * 		초기값	==> 1
		 * 	do {
		 		반복실행문장	==> 2
		 		증감식		==> 3
		 			while(조건식); 	==> 4 => true이면 2번 이동
		 									false => 종료	 			
				}
				
			int i=1;
			do {
				System.out.print(i+"");
				i++;			====> 증가 먼저 하고
			} while(i<=10);			==> 반복			
		 */
		/// 1부터 10까지 출력
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=10); 
		
		System.out.println("\n=========do while문===========");
		
		/// A~Z 출력
		c='A';
		i=0;
		do {
			System.out.print(c++ + " ");
			i++;
		} while(i<26);

	}
}
