
public class ppt5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//눈의 합이 6
/*
 * 		i  j
		1  5
		2  4
		3  3
		4  2
		5  1
 */
		
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(i + "," +  j);
				}
			}
		}
	}

}
