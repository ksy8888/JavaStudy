import java.util.Arrays;
import java.util.Scanner;

/*
 		1) 메소드 형식 => 기능처리
 			
 		리터형 메소드명(매개변수...) => 선언부
 		{
 			구현부
 		}
 		
 			= 리턴타입 (리턴형)
 				처리 후 결과값 한개만 전송이 가능하다
 				*** 여러개인 경우 :배열, 클래스
 				*** 한개인 경우 : 일반 기본형, String
 				1) 결과값이 있는 경우
 					리턴형 메소드명(매개변수...)
 					----
 					{
 						return 값;
 							   -- >> 리턴형과 일치 . 리턴형이 클수도 있다
 					}
 					예)
 						int method()
 						{
 							return 10.5; ==> 오류발생
 						}
 						
 						int[] method()
 						{
 							int[] arr = {1,2,3,4,5};
 							return arr; //배열 주소만 넘겨준다
 						}
 						==> int[] a = method();
 						
 				2) 결과값이 없는 경우
 					void method()
 					{
 						return; //메소드종료
 					}
 					==> method()
 					
 					void method1()
 					{
 						return 생략 시 => 컴파일러가 자동으로 return
 					}
 					==> method()
 				
 			= 메소드명 => 식별자와 동일
 						길이에 제한이 없다 => 의미를 부여
 			= 매개변수 : 사용자 요청값
 			
 			
 */

public class 문제1번 {
	static void process1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = scan.nextInt();
		
		int[] binary= new int[16];
		
		int index=15;
		while(true) 
		{
			binary[index] = num%2;
			num =num/2;
			if(num==0) break;							
				index--;
		}
			for(int i=0; i<binary.length; i++)
			{
				if(i%4==0 && i!=0) {
					System.out.print(" ");				
				}
				System.out.print(binary[i]);
			}
		
	}
	
	static void process2(int[] arr,int n) {
		Scanner scan = new Scanner(System.in);
		//int[] arr = new int[5];
												
		
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				boolean bCheck = false;
				
					if(n==1) 
						bCheck = arr[i] > arr[j];
					else
						bCheck = arr[i] < arr[j];
						
					if(bCheck) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;				
							
					}		
				
																						
			}
		}
	
//			for(n=1; n<=2; n++) {
//				if(n==1)
//					System.out.println("(ASC): " + Arrays.toString(arr)); 
//				if(n==2)
//					System.out.println("(DESC): " + Arrays.toString(arr));
//			}
		
		
		
		
	}
		
		
		
	
	
	static void process3() {
		Scanner scan= new Scanner(System.in);
		System.out.println("년도 입력: ");
		int year = scan.nextInt();
		
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+"년도는 윤년 입니다");
		} else {
			System.out.println(year +"년도는 윤년이 아닙니다");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		process1();
		

		int[] arr = new int[5];		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}	
		process2(arr, 1);
		process2(arr, 2);		
		
	//	process3();
		
	}

}
