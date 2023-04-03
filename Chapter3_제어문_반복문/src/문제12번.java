public class 문제12번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int count=0;
		
		for(int i=2; i<=30; i+=2) {
			count++;		
			//System.out.print(i+" ");
			System.out.printf("%2d\t", i); //두자리수로 출력
				if(count%3==0) {
					System.out.println();
				}
			
			
		}
		
		
		
	}

}
