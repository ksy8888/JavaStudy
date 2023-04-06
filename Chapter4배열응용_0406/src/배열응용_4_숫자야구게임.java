import java.util.Arrays;
import java.util.Scanner;

/*
 *  숫자 야구게임
   	1. 컴퓨터 => 임의의 숫자 3개 발생 (1~9까지 중복없는 난수)
   	  3 6 9
   	2. 사용자 숫자를 입력해서 발생된 난수를 맞추는 게임
   	3. 힌트
   		2 9 6
   		---> 0S-2B  : 다른 위치(S)에 같은숫자(B) 두개가 있음
   		3 7 8
   		---> 1S-0B
   		3 9 8
   		---> 1S-1B
   		3 6 9
   		---> 3S 종료
 */
public class 배열응용_4_숫자야구게임 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] com = new int[3];		//난수 = > 저장
		int[] user = new int[3]; //입력
		
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;	//난수 생성
			for(int j=0; j<i; j++) 			 //중복제거
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		//사용자가 입력
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();
					
			if(input<100 || input>999) { 	//세자리 정수 입력안했을 때 예외처리
				System.out.println("잘못된 입력입니다.");
				continue; //처음부터 다시 수행(while로)
			}
			
			//세자리 정수 입력했다면
			user[0]=input/100;	//백의자리
			user[1]=(input%100)/10;	//10의자리
			user[2]=input%10;		//1의 자리
			
			//1. 같은 정수를 입력하면 안된다.	
			 if(user[0]==user[1] || user[1]==user[2] || user[2]== user[0]) {
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			//2. 0을 포함 할 수 없다.
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 포함할 수 없다");
				continue;
			}
		
		//user[0]!=user[1]  user[1]!=user[2] user[2]!=user[0]
			/*
			  for(int q=0; q<user.length; q++)
			  {
			  	for(int w=0; w<q; w++)
			  	{
			  		if(user[q]==user[w]) {
			  			if(q==0 || w==0) {
			  			w--;
			  			break;
			  			}
			  		}		  		
			  	}			  	
			  }
			 */

			//힌트 준비
				int s=0, b=0;
				for(int i=0; i<com.length; i++) 
				{
					for(int j=0; j<i; j++) 
					{
						if(com[i]==user[j])	//같은 숫자가 있는가
						{
							if(i==j) { s++; }	//같은 자리에 있는가
							else { b++; }
							}
						}
				}
			///힌트 제공
		//	System.out.printf("Input: %d, Result:%dS-%dB\n", input, s, b);
			System.out.println("============");
			System.out.print("S: ");
			for(int i=0; i<s; i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB: ");
			for(int i=0; i<b; i++)
			{
				System.out.print("○");
			}
			System.out.println("\n============");
			
			//종료 시점 ==> S가 3이면 종료
				if(s==3) {
					System.out.println("Game Over!!");
					break;
				}
			
			}
			
			
		}
	}


