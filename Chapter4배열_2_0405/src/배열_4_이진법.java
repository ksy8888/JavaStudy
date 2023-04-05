//16비트 => 0,1

import java.util.Scanner;

public class 배열_4_이진법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int input = scan.nextInt();
		
		System.out.println(Integer.toBinaryString(input));	//라이브러리
		
		//저장 공간(0,1)
		int[] binary = new int[16];
		
		int index=15; //뒤부터 채워서 15로 초기값 설정
		while(true) 
		{
			binary[index] = input%2;
			input = input/2;
			if(input==0) break;
			index--; 	//뒤에서부터 채워나간다
		}
		
		for(int i=0; i<binary.length; i++) 
		{
			if(i%4==0 && i!=0) //4자리씩 끊어서 출력. 
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
