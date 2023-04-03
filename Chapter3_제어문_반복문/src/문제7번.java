import java.util.Scanner;

public class 문제7번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력: ");
		int num1 = scan.nextInt();
		
		System.out.println("+,-,*,/ 입력: ");
		char op = scan.next().charAt(0);
		
		System.out.println("정수를 입력: ");
		int num2 = scan.nextInt();
		
		
		switch(op) {
			case '+':
				System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
				break;
			case '-':
				System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
				break;
			case '*':
				System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
				break;
			case '/':
				System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
				break;
		}
		
	}

}
