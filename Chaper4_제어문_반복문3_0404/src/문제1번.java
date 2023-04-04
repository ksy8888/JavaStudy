
public class 문제1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;	
		int sum=0;
		
		int i=100; //초기값
		while(i<=999 ) 
		{
			 if(i%7==0) {
				sum += i;
				count++;
			}			
			 
			i++; //증가식			
		}
		
		System.out.println("7의 배수 갯수: " + count);
		System.out.println("7의 배수 합: " + sum);
		
	}
}
