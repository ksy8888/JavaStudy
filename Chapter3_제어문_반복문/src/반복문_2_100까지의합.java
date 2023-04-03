//1~100까지의 합
public class 반복문_2_100까지의합 {

	public static void main(String[] args) {

			
			
//짝수의합		
		int sum=0;
			for(int i=0; i<=100; i+=2) {			
				sum += i;
			//	System.out.println("sum"+ sum + ", i="+ i);
			}
			System.out.println("1부터 100까지 짝수의 합: " + sum);
			
//짝수의합			
		int sum4=0;
			for(int i=0; i<=100; i++) {
				if(i%2==0) {
					sum4 += i;
				}				
			}
			System.out.println("sum4 1~100 짝수의 합: " + sum4);

//홀수의합
//			int sum1=0;
//			for(int i=1; i<=100; i+=2) {
//				sum1 += i;
//			//	System.out.println("sum"+ sum + ", i="+ i);
//			}
//			System.out.println("1부터 100까지 홀수의 합: " + sum1);
		

//3의배수 합			
			int sum2=0;
			for(int i=3; i<=100; i+=3) {
				sum2 += i;
			//	System.out.println("sum"+ sum + ", i="+ i);
			}
			System.out.println("1부터 100까지 3의배수 합: " + sum2);
	
		}
	}
			
	


