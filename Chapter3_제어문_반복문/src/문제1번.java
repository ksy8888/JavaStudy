import java.util.Scanner;

public class 문제1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력: ");
		int num1 = scan.nextInt();
		
		if(num1 > 0 ) {
			System.out.println(num1+"는(은) 양수입니다");
		} else {
			System.out.println(num1+"는(은) 음수입니다");
		}
	}

}
