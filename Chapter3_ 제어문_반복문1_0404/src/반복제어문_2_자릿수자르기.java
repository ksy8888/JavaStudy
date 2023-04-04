//break / continue

import java.util.Scanner;

public class 반복제어문_2_자릿수자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세자리 정수를 입력
		// 조건 : 0을 포함 할 수 없다   >> 한자리씩 잘라서 비교해야함
		// 조건: 같은 수를 입력할 수 없다
		Scanner scan = new Scanner(System.in);
		while(true) 
		{
			System.out.print("세자리 정수 입력: ");
			int input = scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다.");
				continue;  //다시 while문으로
			}
			
				//369
				int a = input/100;  	//3
				int b = (input%100)/10;	//6
				int c = input%10;		//9
				
				System.out.println("input= " + input);
				System.out.println("a=" + a + ", b=" + b + ", c=" + c);
				
				//0을 포함 할 수 없다
				if(a==0 || b==0 || c==0) {
					System.out.println("0을 포함할 수 없다");
					continue;
				}
				//같은 숫자 있는 경우
				if(a==b || b==c || c==a) {
					System.out.println("같은 수를 입력할 수 없다");
					continue;
				}
			
			//정상 수행 시
			System.out.println("입력값: " + input);
			break;
		}
	}

}
