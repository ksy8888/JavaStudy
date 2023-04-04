////// while을 써서 원하는 만큼 가위바위보 게임 
import java.util.Scanner;

/*
 * 컴퓨터		사용자		컴-사			win?
 * 	가위(0)		
 * 			가위(0)		0			Same		비기는 경우  0
 * 			바위(1) 		-1			사용자		이기는 경우  사용자(-1,2) 컴(-2, 1)
 * 			보(2) 		-2			컴퓨터		
 * 	바위(1)
 * 			가위(0)		1			컴퓨터
 * 			바위(1)		0			Same
 * 			보(2)		-1			사용자
 * 	보(2)
 * 			가위(0) 		2			사용자
 * 			바위(1)		1			컴퓨터
 * 			보(2)		0			Same
 */
public class 반복문_5_while가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int win=0, lose=0, same=0;
		
		while(true) {	//무한루프
			
			System.out.print("가위(0) 바위(1) 보(2) 종료(9): ");
			//컴퓨터 난수 발생
			int com = (int)(Math.random()*3); //0,1,2
			// 사용자 입력
			int user = scan.nextInt();
			
			///////////////***
			if(user==9) {
				System.out.println("게임 종료!!");
				//System.exit(0);
				break;
			}
			
			// 컴퓨터가 뭘 냈는지
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else if(com==2)
				System.out.println("컴퓨터:보");
			
			// 사용자가 뭘 냈는지
			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else if(user==2)
				System.out.println("사용자:보");
			
			//결과값 출력
			switch(com-user)			//이기는 경우  사용자(-1,2) 컴(-2, 1)
			{
			case -1: case 2:
				System.out.println("사용자 Win!!");
				win++;
				break;
			case 1: case -2:
				System.out.println("컴퓨터 Win!!");
				lose++;
				break;
			case 0:
				System.out.println("비겼다!!");
				same++;
				break;
					
			}
		}
		System.out.println("==== 결과값 ====");
		int total = win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무\n", total, win, lose, same);
		
	}

}
