
public class ppt문제13번부터18번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+"");
			}
			System.out.println();
		}
		
		System.out.println("\n=============");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		System.out.println("\n=============");
/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 	
 */
		for(int i=1; i<=5; i++) {
			char c = 'A';
			for(int j=1; j<=5; j++) {
				System.out.print(c++ +" ");  //내부for에 c++은 A받고 옆으로 증가
			}
			System.out.println();
		}
		
		System.out.println("\n=============");
/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E		
 */
		char c = 'A';	
		for(int i=1; i<=5; i++) {		
			for(int j=1; j<=5; j++) {
				System.out.print(c +" ");
			}
			c++;
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
