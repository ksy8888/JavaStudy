// && ||
/*
 * (조건) && (조건)  ==> 두 조건 모두 맞아야함 모두 true 가 되어야 true
 * 				  ==> 범위나 기간에 포함 여부 확인
 * 	true true	=> true
 * 	true false	=> false
 * 	false true	=> false
 * 	false false => false
 * 
 * || 	하나만 맞아도 됨
 * 		==> 범위나 기간을 벗어난 경우 : 행사
 * 	true true	=> true
 * 	true false	=> true
 * 	false true	=> true
 * 	false false => false
 * 
 * 	=> 효율적 연산
 * () && ()	
 * () || ()  앞에가 true이면 뒷쪽 실행X
 * 
 * 	int a=10;
 * 	int b=9;
 * 
 * 	(a<b) && ++b==a   ==> false 앞에가 F이기 때문에 뒤연산은 실행X 따라서 b는 9
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int a=10;
//			int b=9;
//			boolean bCheck= (a<b) || ++b==a;
//			System.out.println(bCheck);
//			System.out.println("b=" + b);

		//============================================
//		int a=100;
//		int b=99;
//		boolean bCheck = (a>b) && (b==a);
//		System.out.println(bCheck);
//		bCheck = (a>b) || (b==a);
//		System.out.println(bCheck);
//		//============================================
//		
//		char c = (char)((Math.random()*26)+65);
//		boolean bCheck2 = c>='a' && c<='z';
//		System.out.println("c= " + c);
//		System.out.println(bCheck2);
		
		//============================================
//		char sex='M';
//		int score = 87;
//		boolean bCheck3 = (sex=='M' || score <=80 ); //로그인
//		System.out.println(bCheck3);
		//============================================
		
//		int a=10;
//		boolean bCheck4 = a%2==0 && a<2;
//		System.out.println(bCheck4);
		
		int year=2024;
		boolean bCheck5= ((year%4==0 && year%100!=0) || (year%400==0));
		System.out.println(bCheck5);
		
	}

}
