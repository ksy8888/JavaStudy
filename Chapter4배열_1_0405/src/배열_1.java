/*
 		배열 : 관련된 데이터를 여러개 모아서 한개의 이름으로 관리
 			  --------				------
 			  데이터형이 동일
 			 1) 데이터를 배열로 모아서 관리 => 연속적인 메모리 공간을 만든다
 			 						  ------------
 			 2) 고정적이다 (한번 지정되면 추가,삭제가 불가능하다)
 			 	------ 가변형으로 바꿔준게 있음 >> (컬렉션 프레임워크 제공)
 			 3) 한개의 이름으로 사용 (구분자:인덱스) => 0, 1, 2...번
 			 예)
 			 	int a=10, b=20, c=30, d=40, e=50;
 			 	
 			 	-------------------------------
 			 	10  |  20  |  30  |  40  |  50
 			 	-------------------------------
 			 	|    |     |	  |  	  |
 		번지	   100  104   108    112     116 		//int니까 4바이트씩
 													//char는 2번지씩 이동, double은 8번지씩 이동
 			================================
 			index 번호는 0~갯수만큼
 			** 갯수확인 => length
 			
 			1. 배열 선언
 				데이터형[] 배열명; => 권장 사항
 				데이터형 배열명[]; => C언어 파생
 			2. 배열 초기화
 				1) 선언과 동시에 초기화
 					데이터형[] 배열명 = {10,20,30,40,50} => 5개를 동시에 저장하는 공간
 					데이터형[] 배열명 = new 데이터형[10]; 
 								   ---- new를 사용하면 자동으로 기본 디폴트값으로 채운다
 								   byte,short,int => 0
 								   long => 0L
 								   char => '\0'
 								   float => 0.0F
 								   double => 0.0
 								   boolean => false
 			3. 데이터 읽기
 			 	int a=10;
 			 	System.out.println(a);
 			 	int[] arr = {10,20,30,40,50};
 			 	System.out.println(arr[1]);    >> 20 출력
 			 	
 			 4. 변경
 			 	int a=10;
 			 	a=20;	//a가 20으로 바뀜
 			 	
 			 	int[] arr = {10,20,30,40,50};
 			 	arr[3] = 200;		//{10,20,30,200,50}; 으로 바뀜
 			 
 			 
 */
public class 배열_1 {

	public static void main(String[] args) {
		
		//정수 5개 연속적으로 배치 ==> 배열
	//	int[] arr=new int[5];	//0 0 0 0 0
		
//		for(int i=0; i<=5; i++) {
//			System.out.println("arr[" + i + "]" + arr[i]);
//		}
		int a1= (int)(Math.random()+100)+1;
		int a2= (int)(Math.random()+100)+1;
		int a3= (int)(Math.random()+100)+1;
		int a4= (int)(Math.random()+100)+1;
		int a5= (int)(Math.random()+100)+1;
		
		int a6= (int)(Math.random()+100)+1;
		int a7= (int)(Math.random()+100)+1;
		int a8= (int)(Math.random()+100)+1;
		int a9= (int)(Math.random()+100)+1;
		int a10= (int)(Math.random()+100)+1;
		
		System.out.println("a1= " + a1);
		System.out.println("a1= " + a2);
		System.out.println("a1= " + a3);
		System.out.println("a1= " + a4);
		System.out.println("a1= " + a5);
		System.out.println("a1= " + a6);
		System.out.println("a1= " + a7);
		System.out.println("a1= " + a8);
		System.out.println("a1= " + a9);
		System.out.println("a1= " + a10);
		
		int max=a1;
		if(max<a2) 
			max=a2; //...~a10 까지 반복해야함
	}

}
