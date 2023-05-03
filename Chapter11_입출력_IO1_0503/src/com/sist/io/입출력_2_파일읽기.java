package com.sist.io;

//파일 읽기
// FileInputStream (1byte) / FileReader (2byte)
// 한글이 포함 ==> 반드시 2byte씩 읽어야 한글깨짐 방지
import java.io.*;

public class 입출력_2_파일읽기 {

	public static void main(String[] args) {
		
		FileReader r = null;
		
		try {
			r = new FileReader("c:\\javaDev\\movie.txt");
			BufferedReader br = new BufferedReader(r);	
			//네트워크 통신시에도 많이 사용
			int i=0; //한글자씩 읽기 => read()
			// int read() => 글자의 ASC코드를 읽어온다 (정수)
			//A => read() => 65
			// int read(byte[], int, int) => 읽은 바이트수
			long start = System.currentTimeMillis();
			
		/*	while((i=br.read()) != -1) {
				//-1 => 읽을 데이터가 없는 경우 => 전체 데이터 읽은 경우
				// EOF
				System.out.print((char)i);		//한글자씩 읽기
			} */
			
			while(true) {
				String data = br.readLine();	//한줄씩 읽기 >> 파일 읽어서 buffer에 넘겨서 출력
				if(data == null) break;
				System.out.println(data);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간: " + (end-start));
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				r.close();
			} catch (Exception e) {
				
			}
			
		}
		
	}
}
