import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100)+1;
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		
		for(;;) {
			System.out.println("숫자를 입력하세요: ");
			int user = scan.nextInt();
			
			if(user>1 && user<=100) {
				count ++;	//if 안에 count를 넣어야 잘못된 입력 횟수가 안들어감
				///힌트
				if(com > user ) {
					System.out.println("UP");
				} else if(com < user) {
					System.out.println("DOWN");
				} else if(com == user) {
					System.out.println("정답");
					System.out.println("입력횟수: " + count);
					System.exit(0);
				}
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}
		
		
	}

}
