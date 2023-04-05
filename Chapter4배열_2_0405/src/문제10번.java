import java.util.Scanner;

public class 문제10번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
			
		System.out.println("정수10개 입력: ");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]= scan.nextInt();
			
			if(i==2 || i==4 || i==9) {
				System.out.print(arr[i] + " ");
			}			
		}
		
	}

}
