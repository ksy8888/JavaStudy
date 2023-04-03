import java.util.Scanner;

public class 문제12번 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력1: ");
		int num1 = scan.nextInt();
		System.out.println("숫자입력2: ");	
		int num2 = scan.nextInt();
				
		System.out.println("두 수의 차는: " + (num1-num2) + "입니다.");
		System.out.println("두 수의 곱은: " + (num1*num2) + "입니다.");
		
		//값 한 번에 받기
//		System.out.println("정수 두개를 입력하세요: ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println(a-b);
//		System.out.println(a*b);
	}

}