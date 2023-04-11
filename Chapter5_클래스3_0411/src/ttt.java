import java.util.Arrays;
import java.util.Scanner;

/*
 		1. 난수 발생
 		2. 사용자 입력
 		----------------------------
 		3. 비교
 		4. 힌트
 		----------------------------
 		5.종료여부
 */
public class ttt {
	
	static int rand(int[] com, int[] user) {
		
		for(int i=0; i<3; i++) {
			com[i] =(int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {	//중복 없어야함
					i--; //중복시 자신것을 다시 발생시키기위해
					break; 	
				}
			}
		}
		
		Scanner scan = new Scanner(System.in);		
		
		while(true) {
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();
			//예외처리----------------------------------------------------------------
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다!!");
				//while의 조건식으로 이동 => 처음부터 다시 시작
				continue;
			}
			//숫자분리
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] ||user[0]==user[2]) {
				System.out.println("같은 숫자는 사용 불가능!!!");
				continue;
			}
			
			if(user[0] ==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없다!");
				continue;
			}
			///////////////////// compare 부분 추가사항
			int s = compare(com, user); //메서드호출시 받아온 com,user를 compare에서 또 쓰기위해 값 저장해둠
			
			if(isend(s)==1) {
					System.out.println("종료");
					System.exit(0);
			} 
		} 
		
	}
	
	static int compare(int[] com, int[] user) {
		int s=0, b=0;
		
		//s=같은 자리의 수가 동일, b=다른 자리에 있는 수가 동일
		for(int i=0; i<3; i++) {	//com
			for(int j=0; j<3; j++) {	//user
				if(com[i] == user[j]) {	//같은 수가 있는지
					if(i==j)	// 같은 자리수면
						s++;
					else		// 다른 자리수면
						b++;
				}
			}
		}
		//힌트 여기 모담
		/////System.out.printf("Input: %d, Result:%dS- %dB\n", s, b);
		System.out.printf("Input: %d%d%d, Result:%dS- %dB\n", user[0], user[1], user[2], s, b);
		////여기도 모담 ////////// s가 3개면 종료 메서드 가야함. 그래서 s를 리턴해줌.
		return s;
	}
	
	//종료 메서드
	static int isend(int s) {	//비교메서드에서 리턴한 s를 받아옴
		
		if(s==3) {
			System.out.println("Game Over!!");
    		return 1;
		}
    	
		return 0;		//while문이 계속 돌기때문에 while 쪽에서 종료를 시켜줘야함
    	
	}
	
	static void process() {
		int[] com = new int[3];
		int[] user = new int[3];
		rand(com, user);
	}
	public static void main(String[] args) {
		
		process();
						
//		int[] com = new int[3];
//		int[] user = new int[3];
//		
//		for(int i=0; i<3; i++) {
//			com[i] =(int)(Math.random()*9)+1;
//			for(int j=0; j<i; j++) {
//				if(com[i] == com[j]) {	//중복 없어야함
//					i--; //중복시 자신것을 다시 발생시키기위해
//					break; 	
//				}
//			}
//		}
//		// System.out.println(Arrays.toString(com)); //난수발생 확인
//		
//		//사용자 입력
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("세자리 정수 입력: ");
//			int input = scan.nextInt();
//			//예외처리----------------------------------------------------------------
//			if(input<100 || input>999) {
//				System.out.println("잘못된 입력입니다!!");
//				//while의 조건식으로 이동 => 처음부터 다시 시작
//				continue;
//			}
//			//숫자분리
//			user[0]=input/100;
//			user[1]=(input%100)/10;
//			user[2]=input%10;
//			
//			if(user[0]==user[1] || user[1]==user[2] ||user[0]==user[2]) {
//				System.out.println("같은 숫자는 사용 불가능!!!");
//				continue;
//			}
//			
//			if(user[0] ==0 || user[1]==0 || user[2]==0) {
//				System.out.println("0을 입력할 수 없다!");
//				continue;
//			}
//			//----------------------------------------------------------------------
//			//비교
//			int s=0, b=0;
//			//s=같은 자리의 수가 동일, b=다른 자리에 있는 수가 동일
//			for(int i=0; i<3; i++) {	//com
//				for(int j=0; j<3; j++) {	//user
//					if(com[i] == user[j]) {	//같은 수가 있는지
//						if(i==j)	// 같은 자리수면
//							s++;
//						else		// 다른 자리수면
//							b++;
//					}
//				}
//			}
//			
//			// 힌트--------------------------
//			System.out.printf("Input: %d, Result:%dS- %dB\n", input, s, b);
//			
//			//종료 여부
//			if(s==3) {
//				System.out.println("Game Over!!");
//				break;
//			}
//		}
	}

}
