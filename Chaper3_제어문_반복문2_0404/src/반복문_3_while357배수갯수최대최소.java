//3의 배수, 5의 배수, 7의 배수의 합 => 갯수
public class 반복문_3_while357배수갯수최대최소 {
	
//갯수가 가장 많은 수와 가장 작은 수 갯수의 최대최소값
	public static void main(String[] args) {
		
		int a3=0, a5=0, a7=0;	//합
		int c3=0, c5=0, c7=0;	//갯수
		
		int i=1; //초기값
		while(i<=100) 
		{
			//중복적으로 수행할 때 단일 if문씀 (3,5,7의 공통 배수가 있기 때문에 else if 쓰면 안됨.)
			if(i%3==0) {
				a3 += i;
				c3++;
			} if(i%5==0) {
				a5 += i;
				c5++;
			} if(i%7==0) {
				a7 += i;
				c7++;
			}
			
			i++; //증가식
			
		}
		
		
		//갯수가 가장 많은 수와 가장 작은 수 갯수의 최대최소값
		int max = c3;
		if(max < c5) {
			max = c5;
		} if(max < c7) {
			 max = c7;
		 }
			 
		 
		int min = c3;
		if(min > c5) {
			min = c5;
		} if(min > c7) {
			min = c7; 
		}
			
		
		
			System.out.println("===== 결과값 =====");
			System.out.println("1~100까지 3의 배수 합:" + a3 + ", 갯수:" + c3 );
			System.out.println("1~100까지 5의 배수 합:" + a5 + ", 갯수:" + c5 );
			System.out.println("1~100까지 7의 배수 합:" + a7 + ", 갯수:" + c7 );
			System.out.println("가장 많은 갯수는: "+ max + "개");
			System.out.println("가장 적은 갯수는: "+ min + "개");
			
		
	}	
}
