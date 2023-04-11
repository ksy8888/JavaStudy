import java.util.Arrays;

//1. 달력 만들기
/*
 		기능
 			1. 년도/ 월 입력
 			2. 1일차의 요일 ==> 세분화
 			3. 달력 출력
 			-------------
 			===> 재사용할 수 있는 메소드 (윤년)
 			
  2. 숫자 야구게임
  	난수 발생
  	사용자 입력
  	비교
  	힌트
  	종료여부 확인
 			
 */
public class 메소드조립법1_정렬 {

//	static void sort(int[] arr, int n)	//n=1 ASC, n=2 DESC
//	{
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(n==1) {  ///////////////////////////////////////////////////////
//					if(arr[i]>arr[j]) { 	//ASC
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				}
//				else {
//					if(arr[i]<arr[j]) { 	//DESC
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				}
//			}
//		}
//	}
	static void rand(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	static void sort(int[] arr, int n)	//n=1 ASC, n=2 DESC
	{
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				boolean bCheck= false; ///////////////////////////////////////////////////////
					if(n==1)
						bCheck = arr[i]>arr[j]; //ASC
					else
						bCheck = arr[i]<arr[j]; //DESC
					
						if(bCheck) {							 	
								int temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;						
						}
		
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		
		rand(arr);
		
		
		sort(arr,1);
		System.out.println("정렬후(ASC): " + Arrays.toString(arr));
		
		sort(arr,2);
		System.out.println("정렬후(DESC): " + Arrays.toString(arr));
	}

}
