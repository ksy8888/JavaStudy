//do~while => 후조건. 무조건 1번 수행
/*
  		1. 초기화 
  		2. 게임
  		3. 형식)
  				초기값	(1)
	  			do {
	  				반복 실행문장	(2)
	  				증감식		(3)
	  			} while(조건식);	=> 증가된 변수로 조건검색

 */

import java.util.Scanner;

public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10
		int i=1;
		do {
			System.out.print(i + " ");
			i++;    //i=11일 떄 종료. 이후 i 값은 11
		} while(i<=10); 
			
		System.out.println("\n===================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = scan.nextInt();
		i=1;
		do {
			System.out.printf("%2d * %2d = %2d\n", dan, i, dan*i);
			i++;
			
		} while(i<=9);
		
		System.out.println("\n===================");
		i = 10;
		System.out.println("\n======== for =========");
		for(i=10; i<10; i++) {
			System.out.print("i= "+i);
		}
		
		i = 10;
		System.out.println("\n======== while =========");
		while(i<10) {
			System.out.print("i= " + i);
			i++;
		}
		
		i = 10;
		System.out.println("\n======== do while =========");
		do {
			System.out.print("i= " + i);
			i++;
			
		} while(i<10);	//do먼저 후 조건을 나중에 실행하기 때문에 i=10이 찍힘
	}

}
