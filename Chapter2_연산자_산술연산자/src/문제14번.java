import java.util.Scanner;

public class 문제14번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력1: ");
		int num1 = scan.nextInt();
		System.out.println("숫자입력2: ");
		int num2 = scan.nextInt();
		
		System.out.println("첫째 수를 둘째 수로 나눈 나머지는: "+ (num1%num2));

//	//값을 랜덤으로 가져와서 실행 + printf로 한번에 쓰기
//		int a,b;
//		a=(int)(Math.random()*100)+1;
//		b=(int)(Math.random()*100)+1;
//		
//		//System.out.println("a는 " + a +" b는 " + b);
//		System.out.printf("a=%d, b=%d, a%%b=%d", a,b,a%b);
	
	}

}
