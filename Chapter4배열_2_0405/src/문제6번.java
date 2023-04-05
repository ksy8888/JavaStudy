import java.util.Arrays;
import java.util.Scanner;

public class 문제6번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			 arr[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int a:arr)		
		{
			if(a%3==0) { System.out.print(a+" ");}	
		}
		

	}
}
