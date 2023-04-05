import java.util.Scanner;

public class 문제9번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char[] arr = new char[10];
		
		System.out.println("문자입력: ");

		for(int i=0; i<arr.length; i++)
		{
			arr[i]= scan.next().charAt(0);
			
			System.out.print(arr[i]);
		}
		
		
	}

}
