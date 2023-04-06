import java.util.Arrays;

public class 배열응용_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("==== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==== 정렬후 =====");
		Arrays.sort(arr);						//ASC
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1; i>=0; i--) 		//DESC
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
