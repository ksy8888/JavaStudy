import java.util.Arrays;

/*
 		정렬 : ASC(올림차순)/DESC(내림차순)
 		-------------------------------
 		선택정렬 / 버블정렬
 		선택정렬 (select sort)
 		
 		10 30 50 20 40 => 10 20 30 40 50 , 50 40 30 20 10  //** i가 10, j는 30 50 20 40
 		-- --
 		30 10
 		--    --
 		50    30
 		--       --
 		50		 20
 		--		    --
 		50 			40 ------- 1round(1바퀴) => 0 일 때 비교4번 => 0 - 4바퀴
 		------------------
 		50 10 30 20 40
 		   -- --
 		   30 10
 		   --    --
 		   30    20
 		   -- 		--
 		   40       30 ------- 2round => 1 - 3
 		-------------------
 		50 40 10 20 30
 			  -- --
 			  20 10
 			  --    --
 			  30    20 ------- 3round => 2 - 2
 		-------------------
 		50 40 30 10 20
 				 -- --
 				 20 10 ------- 4round => 3 - 1
 		-------------------
 		50 40 30 20 10 
 		
 	  i      j
 	start	횟수
 	  0	     4
 	  1		 3
 	  2      2
 	  3      1
 	  -------------- i+j=4 => j=4-i
 	  							- :4는 length-1
 */
public class 배열응용_DESC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("==== 정렬전 ====");
		System.out.println(Arrays.toString(arr));
		
		////////////////////////// 정렬 ////////////////////////////////////
		System.out.println("==== 정렬후 ====");
		for(int i=0; i<arr.length-1; i++) 		//맨마지막엔 비교 안해서 4번도니까 -1함
		{
			for(int j=i+1; j<arr.length; j++)		//j 본인꺼는 비교 안해도 됨. 따라서 j=i+1 //A B C D E 
//																					   - - J+1 : A A(자기자신) 비교할 필요XX
			{
				if(arr[i]<arr[j]) {			////////// < 를 >로 바꿔주면 ASC됨
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("=== for "+(i+1)+"회차 ===");
			System.out.println(Arrays.toString(arr));
			
		}
		//System.out.println(Arrays.toString(arr));
	}

}
