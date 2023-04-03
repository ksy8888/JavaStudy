/*	
 * 	단항 연산자 (++,--)
 * 	a++ + a++ + ++a
 * 	산술 연산자 (쉬프트, 비트)
 * 		순서 *,/ => +,-
 * --------------------------------- ==> 왼쪽에서 오른쪽으로 계산
 * 	
 * 	대입 연산자, 삼항 연산자
 * 		int a= 10
 * 		int a= b+c
 * 	**	(): 최우선 순위
 * --------------------------------- ==> 오른쪽에서 왼쪽
 * 
 * 	비교 연산자 => 결과값 (boolean) => true/false
 *  == 같다
 *  != 같지않다
 *  < 작다  ==> 왼쪽이 기준점
 *  > 크다
 *  <= 작거나 같다
 *  >= 크거나 같다
 *  
 *  7 == 6 false
 *  7 != 6 true
 *  --------------------- byte, short, long, double, float, boolean, char
 *  문자열 비교 >> equals() ***
 *  
 *  'A' < 'B' 65 < 66 ==> true
 *  10 > 5 true
 *  
 *  
 *  
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		/*         ------------(1) (0.0~0.99)
		 * 						-----(2) (0.0~99.0)
		 * 	  ----(3) (0~99)
		 * 							   --(4)	(1~100)
		 */
		
		int b = (int)(Math.random()*100)+1;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//1. ==
		boolean b1 = a==b;
		System.out.println("a==b: " + b1);
		
		//2. !=
		boolean b2 = a!=b;
		System.out.println("a!=b: " + b2);
		
		//3.
		b1 =a<b;
		System.out.println("a<b: " + b1);
		b1 =a>b;
		System.out.println("a>b: " + b1);
		b1 =a<=b;
		System.out.println("a<=b: " + b1);
		b1 =a>=b;
		System.out.println("a>=b: " + b1);
		
		
	}

}
