/*
 * ---------------------------------------------
 * 1. 변수 , 2. 연산자 , 3. 제어문 , 4. 메소드, 5. 클래스
 * ---------------------------------------------
 *  이항 연산자
 *  피연산자가 2개 
 *  ---------------------
 *  ***	1) 산술 연산자 ( + , - , * , / , %)
 *  	2) 쉬프트 연산자 (비트이동연산자) ( << , >> )
 *  	3) 비트 연산자 ( % , | , ^ )
 *  ***	4) 비교 연산자 ( == , != , < , > , <= , => )
 *  ***	5) 논리 연산자 ( &&(직렬) , ||(병렬) ) : 효율적인 연산
 *  		&& => true
 *  		(조건) && (조건)
 *  		----
 *  		false 일 때 뒤에 조건 안봄. &&가 true 이기 때문
 *  
 *  		|| => true(1)
 *  		(조건)  (조건)
 *  		----
 *  		true
 *  ***	6) 대입 연산자 ( = , += , -= , op= )
 *  
 *  page 38>
 *  	+, -, * => 형변환 >>> 자바에서 모든 연산은 같은 데이터형끼리만 연산이 된다 
 *  				ex) 10 + 20.5 => 10.0 + 20.5 = 30.5
 *  				자동으로 큰 데이터형으로 변경 후에 연산을 한다
 *  				'A' + 10 => 65 + 10 = 75
 *  				*** char는 모든 연산자를 이용해서 연산처리하면 => 자동으로 Int 변경
 *  				'A' < 60  => False
 *  				*** Int 이하 (byte, short, char)는 연산 시 결과 값 Int
 *  				int + long  => long
 *  				int + double  => double
 *  				char + long => int
 *  				byte + int => int
 *  				char + char => int
 *  				byte + byte => int
 *  
 *  	/ : 정수/정수= 정수
 *  		5/2 = 2
 *  		10/3 = 3
 *  		=> 평균: 정수/실수
 *  		0으로 나누면 에러 발생
 *  	
 *  	% : 결과 값은 왼쪽 부호가 남는다
 *  		5 % 2 = 1
 *  		-5 % 2 = -1
 *  		5 % -2 = 1
 *  		-5 % -2 = -1
 */

//사용자가 정수 세 개를 입력해서 결과 값 (1.총점, 2.평균)
import java.util.Scanner; //외부에서 클래스를 불러온다
//키보드로부터 값 받아오는 클래스: Scanner (scanf())
//BufferedReader => 예외처리
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //클래스 선언 
//									--------키보드 입력값
		System.out.println("국어점수 입력: ");
		int kor = scan.nextInt();
		System.out.println("수학점수 입력: ");		
		int mat = scan.nextInt();
		System.out.println("영어점수 입력: ");
		int eng = scan.nextInt();
		
		//총점
		int total = kor+mat+eng;
		//평균(소숫점)
		double avg = total/3.0;
		//결과값 출력
		System.out.println("총점 = " + total);
		System.out.printf("평균:%.2f" , avg); //소숫점 아래 2자리까지 출력. printf , %.2f
		
//		System.out.println();
//		System.out.println("국어점수 = "+ kor);
		
//		System.out.println("수학점수 입력: ");		
//		int mat = scan.nextInt();
//		System.out.println("수학점수= "+ mat);
		
//		System.out.println("영어점수 입력: ");
//		int eng = scan.nextInt();
//		System.out.println("영어점수= "+ eng);
	}

}
