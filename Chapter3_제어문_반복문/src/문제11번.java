import java.util.Scanner;

public class 문제11번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = scan.nextInt();		
		int sum=0;
		
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합: "+ sum);
	}

}
