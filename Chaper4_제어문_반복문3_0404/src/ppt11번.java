
public class ppt11번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		
		for(int i=1; i<=10; i++) 
		{
			int num = (int)(Math.random()*100)+1;
			System.out.println(num + " ");
			if(num%2==0) 
			{
				cnt++;
			}
		}
		System.out.println("짝수의 갯수는: " + cnt + "개");
	}

}
