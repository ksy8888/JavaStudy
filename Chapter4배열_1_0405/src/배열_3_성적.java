/*
 		3명의 학생 국어,영어,수학 => 총점,평균,학점,등수
 		[3][7]  ==> 학생3명이 배열 7개씩 갖고 있다(국,영,수,총점,평균,학점,등수)
 */

import java.util.Scanner;

public class 배열_3_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언
		int[] kor = new int[3];	//0 1 2
		int[] eng = new int[3]; //0 1 2 
		int[] math = new int[3];  //0 1 2
		
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];	//학점
		int[] rank = new int[3];	//등수
		
		//Object[][] student = new Object[3][7]; Object는 모든 데이터 통합
		
		Scanner scan = new Scanner(System.in);
////////////////////성적//////////////////////
		for(int i=0; i<kor.length; i++) 
		{
			System.out.println((i+1)+"번째 국어 점수");
			kor[i] = scan.nextInt();
			System.out.println((i+1)+"번째 영어 점수");
			eng[i] = scan.nextInt();
			System.out.println((i+1)+"번째 수학 점수");
			math[i] = scan.nextInt();
			
			total[i] = kor[i]+math[i]+eng[i];
			avg[i] = total[i]/3.0;
					
		}
		
		
////////////////////학점//////////////////////	==>89 88 => 8 이 들어오면 B
		for(int i=0; i<kor.length; i++)
		{
			switch((int)avg[i]/10)
			{
			case 10:
			case 9:   // avg >= 90
				score[i]='A';
				break;
			case 8:   
				score[i]='B';
				break;
			case 7:   
				score[i]='C';
				break;
			case 6:   
				score[i]='D';
				break;
			default:
				score[i]='F';
				break;
			}
		}
////////////////////등수//////////////////////		
		for(int i=0; i<kor.length; i++) 
		{
			rank[i]=1; //일단 1등 가져다두기
			
			for(int j=0; j<kor.length; j++) //지정해둔 1등보다 큰수가 나오면 하나씩 증가해서 등수 +1 >> 2등,3등...
			{
				if(total[i] < total[j]) 
				{
					rank[i]++;
				}
			}
		}
		
		System.out.println("======= 성적표 =======");
		
		for(int i=0; i<kor.length; i++) 
		{
			System.out.printf("%-5d%-5d%-5d%-7d%7.2f %-3c%-5d\n", kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}
	}

}
