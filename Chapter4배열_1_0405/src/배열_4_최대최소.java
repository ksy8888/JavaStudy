//임의의 정수 10개를 받아서 최대/최소값 구하기
// 배열생성 > 난수받아서 배열에 할당 >> 출력

import java.util.*;

public class 배열_4_최대최소 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];  //공간 10개 생성 >> 정수 10개 받아와야함
		
		//초기화
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		
	// 1. 일반 for 이용해서 출력					//배열에 있는 데이터 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
		System.out.println();
		System.out.println(Arrays.toString(arr));	//배열 출력
		
	// 2. for-each => 배열, 컬렉션 => 데이터가 여러개 모아서 관리할 때 사용
		/*
		 		for(int 변수 : 배열명)
		 */
//****	//출력용으로 사용 => 웹(브라우저)
		for(int a:arr)		//Vue,React
		{
			System.out.print(a+" ");
		}
		
/////////////// 최대값, 최소값/////////////////
		int max = arr[0];
		int min = arr[0];
		
		for(int a1:arr)
		{
			if(max < a1) max=a1;
			if(min > a1) min=a1;
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
