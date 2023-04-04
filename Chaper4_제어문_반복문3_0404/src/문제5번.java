
public class 문제5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int sum2=0;
		
		int i=1;
		while(i<=1000) 
		{			
			if(i%7==0)
			{ 
				sum += i;
			} 
			if(i%9==0)
			{
				sum2 += i;
			}			
			i++;
		}	
		
		System.out.println("7의배수: " + sum);
		System.out.println("9의배수: " + sum2);
		System.out.println("9의배수: " + (sum+sum2));
		
	}

}
