package com.sist.io;

//파일쓰기
import java.io.*;

public class 입출력_3_파일쓰기 {

	public static void main(String[] args) {
		
		FileWriter out = null;
		//BufferedWriter //속도빠르게
		FileReader in = null;
		////BufferedReader 
		
		try {
			//1. 파일 만들기
			File file = new File("c:\\java_data\\movie.txt");
			if(!file.exists()) { //파일 존재여부 확인
				//파일 생성
				file.createNewFile();
			}
			
			//파일 읽기
			in = new FileReader("c:\\javaDev\\movie.txt");
			out = new FileWriter(file);
					
			//생성된 파일 쓰기
			int i=0;
			while((i=in.read()) != -1) {
				out.write(i);
			}
			
			System.out.println("파일 읽기/쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}

}
