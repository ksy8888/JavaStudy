package com.sist.io;

//BufferedReader / BufferedWriter => 필터스트림
import java.io.*;

public class 입출력_4_파일쓰기Buffer {

	public static void main(String[] args) throws Exception {
		
		FileWriter out = new FileWriter("c:\\java_data\\movie_1.txt");	//단독 생성가능 //기반스트림
		//filewriter는 파일이 없으면 자동 생성, 파일이 이미 존재하면 덮어쓰기
		// 밑에 추가하고 싶다면 =new FileWriter("c:\\java_data\\movie_1.txt", true); >> append
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");		
		BufferedWriter bw = new BufferedWriter(out);	//단독생성 불가능 //기반스트림 생성 후 인자로 받아와야함
		BufferedReader br = new BufferedReader(in);
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			bw.write(data + "\n");
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
