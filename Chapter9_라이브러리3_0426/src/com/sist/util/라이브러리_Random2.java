package com.sist.util;

import java.util.*;
public class 라이브러리_Random2 {

	public static void main(String[] args) {
	
		char[] alpha = new char[10];		
		Random r = new Random();
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)(r.nextInt(5)+65);	//a~e >> 5	//65~ 알파벳
			if(alpha[i] == 'E')
				alpha[i]='F';
			
			System.out.println((i+1) + "번 학생 성적: " + alpha[i]);
		}
		System.out.println(Arrays.toString(alpha));
		
		//정렬
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
	}

}
