import java.util.Arrays;

//선택정렬 => 문자
// 0번 고정해두고 그 뒤로 비교. i고정 j회전
/*
 		i=0;
 		B C A E D => ASC(ABCDE)/ DESC(EDCBA)
 		- -
 		B C
 		-   -
 		A   B
 		-     -
 		A     E
 		-       -
 		A       D
 		-------------
 		i=1; >> i[1]번째인 C부터 비교
 		A C B E D
 		  - -
 		  B C
 		  -   -
 		  B   E
 		  -     -
 		  B     D
 		-------------
 		i=2;
 		A B C E D
 		    - -
 		    C E
 		    -   -
 		    C   D
 		--------------
 		i=3;
 		A B C E D
 		      - -
 		      D E
 		--------------- 종료
 		i=4
 		A B C D E
 				- >> 비교할 대상이 없음. 한바퀴 덜 들어감. >> length-1
 */
public class 배열응용_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (char)((int)(Math.random()*26)+65);
		}
		
		System.out.println("=== 정렬전 ===");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("=== 정렬후 ===");
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)   //A B C D E : i가 A , j가 B부터 비교하니까 i+1번지가 됨
			{
					if(arr[i] > arr[j]) ///ASC
					{
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
