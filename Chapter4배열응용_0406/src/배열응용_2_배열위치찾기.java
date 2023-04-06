import java.util.Arrays;

//정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값/최소값 ==> 몇번째 위치에 있는지 확인


public class 배열응용_2_배열위치찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
	//최대값
	//최소값
		int max=arr[0];
		int min=arr[0];		
		for(int i:arr)
		{
			if(max < i) { max=i; } //i: 인덱스 번호
			if(min > i) { min=i; }
		}
		System.out.println("최대값: "+ max );
		System.out.println("최소값: "+ min);
		
	///위치 찾기
		int index1=0, index2=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == max) { index1=i; }   //arr[i] 값이 max값과 같다면 i(위치)를 찾아라
			if(arr[i] == min) { index2=i; }
		}
		System.out.println("최대값 위치(index): " + index1 + "," + (index1+1) + "번째 위치");
		System.out.println("최소값 위치(index): " + index2 + "," + (index2+1) + "번째 위치");
	}
	

}
