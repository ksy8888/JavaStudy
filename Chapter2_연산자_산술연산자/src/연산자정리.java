/*
 * 	연산자
 * 	38 page => 산술 연산자
 * 	41 page => 증감 연산자
 * 	44 page => 비교 연산자
 * 	45 page => 논리 연산자
 * 	48 page => 조건 연산자 (삼항연산자)
 * 	=> 대입 연산자 
 * ------------------------------------------------------
 * 		자바에서 지원하는 연산자
 * ------------------------------------------------------
 *  1. 단항연산자
 *  	= 증감 연산자 (++, --) => 한개증가, 한개감소시에 사용
 *  						=> 주로 사용처는 반복문(for, while, do~while)
 *  	1) 전치 연산자 : 먼저 증가한 후에 다른 연산자를 수행
 *  		예)
 *  			int a = 10;
 *  			int b = ++a;  => a=11, b=11
 *  	2) 후치 연산자 : 다른 연산자를 수행. 나중에 증가
 *  		예)
 *  			int a = 10;
 *  			int b = a++  => a=11, b=10	
 *  					--- b에 증가 안 된 a값 대입
 *  			
 *  			char c = 'A';
 *  			System.out.println(c++); ==> A /출력하고 증가
 *  	
 *  	=  부정 연산자  (!) ==> boolean 만 사용 가능
 *  	true => !true = false
 *  			!false = true
 *  
 *  			int a=10;
 *  			a%2==0 ==> true
 *  	= 형변환 연산자 (데이터형)
 *  		= 자동 형변환
 *  			=> 작은 데이터 => 큰 데이터형
 *  			int a = 'A'; ==> 65
 *  			long a = 10 ==> 10L
 *  			double a = 10 ==> 10.0
 *  			int + double
 *  			-----------------
 *  			int a = (int)10.5;
 *  			=> 연산 처리시
 *  		= 강제 형변환 : 큰데이터형을 작은 데이터형으로 변경
 *  			byte < char < int < long < double
 * ------------------------------------------------------
 *  2. 이항연산자
 *  	= 산술 연산자 (+,-,*,/,%)
 *  	= 비교 연산자 (==, !=, <, >, <=, >=) 
 *  	= 논리 연산자 (&&, ||)
 *  	= 대입 연산자 (=, +=, -=)
 * ------------------------------------------------------
 *  3. 삼항연산자
 *  	= 조건?값:값
 * ------------------------------------------------------
 * 	
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ='A';
		System.out.println(c++);
		System.out.println(c);
		
		double d =10.0;
		d++;
		System.out.println(d);
	}

}
