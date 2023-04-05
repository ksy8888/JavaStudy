import java.util.Arrays;
import java.util.Scanner;

public class 문제7번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			 arr[i] = (int)(Math.random()*10)+1;
			 sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
	}

}
