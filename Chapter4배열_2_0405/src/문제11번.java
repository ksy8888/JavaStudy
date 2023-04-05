import java.util.Scanner;

public class 문제11번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
			
		System.out.println("정수10개 입력: ");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]= scan.nextInt();							
		}
		
		int max=arr[0];
		for(int a: arr) 
		{
			if(max < a) max=a;			
		}
		
		System.out.print("최대값:" + max);
	}

}
