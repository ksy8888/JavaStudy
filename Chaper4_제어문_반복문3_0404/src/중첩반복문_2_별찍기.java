/*
		*
		**
		***
		****
		
		****
		***
		**
		*
	
		A
		BC
		DEF
		GHIJ
 */
public class 중첩반복문_2_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		
//		for(int i=1; i<=4; i++) {		
//			for(int j=1; j<=i; j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
	
		///////////////////////////////////////////////////////////
/*
A
AB
ABC
ABCD	
 */
//		char i,j;
//		for( i='A'; i<='D'; i++) {		
//			for( j='A'; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//				
//		for(int i=1; i<=4; i++) {		
//			for(int j=1; j<=5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		///////////////////////////////////////////////////////////
/* #234
   1#34
   12#4
   123#
*/
		
//		for(int i=1; i<=4; i++) {		
//			for(int j=1; j<=4; j++) {
//				if(i==j) 
//					System.out.print("#");
//				else
//					System.out.print(j);
//			}
//			System.out.println();
//		}
		///////////////////////////////////////////////////////////
/*		 			i   k   j
	   *****		줄수 공백 별표
         ***		1   3   1		i+k=4 => k=4-i   j=i
           *		2	2	2
           			3	1	3
           			4   0   4
 */
		for(int i=1; i<=4; i++) 
		{	
			System.out.print("");
			for(int j=1; j< i; j++) 
			{	
				System.out.print(" ");					
			}
			for(int k=4; k>=i; k--) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

		
		
		
	}
}
