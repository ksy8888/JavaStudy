import java.util.Scanner;

public class 문제13번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력1: ");
		int num1 = scan.nextInt();
		System.out.println("숫자입력2: ");
		int num2 = scan.nextInt();
		System.out.println("숫자입력3: ");
		int num3 = scan.nextInt();
		
		System.out.println(num1 + "*" + num2 + "+" + num3);
		System.out.println("곱과합은: "+ (num1*num2+num3));
		
	}

}
