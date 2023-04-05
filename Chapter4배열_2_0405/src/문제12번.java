import java.util.Arrays;
import java.util.Scanner;

public class 문제12번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("숫자10개: ");
		
		int total=0;
		double avg=0;
		
		for(int i=0; i<arr.length; i++)
		{
			 arr[i] = (int)(Math.random()*100)+1;
			 total += arr[i];
//			 avg = total/10.0;
		}
		
		
		 
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
		System.out.printf("%.2f\n", total/10.0);   //
		

	}

}
