import java.util.Scanner;

//끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

public class ppt6번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수 입력(1 5): ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int xx=1;
		
		int i=n1; //초기값
		while(i<=n2) 
		{	
			//System.out.println(i);
			xx *= i;
			i++;
			
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n1부터 n2까지의 곱은: " + xx);
	}

}
