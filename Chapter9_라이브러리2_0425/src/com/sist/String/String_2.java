package com.sist.String;

import java.io.*;

public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			
			int i=0;	//문자읽기 => int로 읽는다
			StringBuffer data= new StringBuffer();
			
			while((i=fr.read())!=-1) {	//-1(EOF) end of file 파일의 끝

					data.append((char)i);
			}
			
			long end = System.currentTimeMillis();
			fr.close();
			System.out.println(data);
			System.out.println("걸린 시간:" + (end-start));
		} catch(IOException ex) {
			ex.printStackTrace();  //에러 위치 확인
			//에러만 확인: getMessage
		}
	}

}
