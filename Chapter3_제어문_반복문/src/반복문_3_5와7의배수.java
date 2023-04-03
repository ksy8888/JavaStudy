//3의 배수의 합 , 갯수 확인 (1~100)
public class 반복문_3_5와7의배수 {

	public static void main(String[] args) {
		int count=0;
		int count2=0;
		
		int sum=0;
		int sum2=0;
		
		for(int i=1; i<=100; i++) {
			if(i%5==0)
			{
				sum += i;		//합계
				count++;		//갯수 확인
			}
			if(i%7==0) {
				sum2 += i;		//합계
				count2++;
			}
		}
		
		System.out.println("1~100까지 5의배수 합계: " + sum);
		System.out.println("1~100까지 5의배수 갯수: " + count);
		System.out.println("");
		System.out.println("1~100까지 7의배수 합계: " + sum2);	
		System.out.println("1~100까지 7의배수 갯수: " + count2);
	}

}
