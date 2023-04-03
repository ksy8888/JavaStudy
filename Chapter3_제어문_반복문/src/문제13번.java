
public class 문제13번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum -= i;
			} else {
				sum+=i;
			}
		}
		
		System.out.println("1-2+3..-10까지의 합: "+ sum);
	}

}
