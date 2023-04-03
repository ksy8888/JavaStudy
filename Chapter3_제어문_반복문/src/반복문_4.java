// 1-2+3-4+5-6+7-8+9-10 ==> 결과값은?
// for => 반드시 숫자의 패턴

public class 반복문_4 {

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
		System.out.println(sum);
	}

}
