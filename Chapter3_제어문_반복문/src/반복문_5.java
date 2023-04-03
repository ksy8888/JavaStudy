//// 사용자의 입력을 받아서 (구구단) => 3
//
import java.util.Scanner;

public class 반복문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("숫자를 입력하세요: ");
		int dan = scan.nextInt();
	
	
	for(int i=1; i<=10; i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
	}
	
//	for(int j=0; j<10; j++) {
//		System.out.println(j);
//	}
		
	}
}
