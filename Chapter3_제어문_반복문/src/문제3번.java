import java.util.Scanner;

public class 문제3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력: ");
		int b = scan.nextInt();
		
		if(b<0) {
			int a = b * -1; 
			System.out.println("a=" + a);
		}
		
		///양수일때 해야함.
		System.out.println(Math.abs(b)); //절댓값 라이브러리
	}

}
