package com.sist.io;

import java.util.*;
import java.io.*;

public class FileOutputStream_1_글쓰기 {

	public static void main(String[] args) {
		

		
			try {				
				//파일지정
				File file = new File("c:\\java_data\\school.txt");
				
				//파일존재여부 확인
				if(!file.exists()) {
					file.createNewFile(); //파일 만들기 명령
				}				
				//파일이 존재할떼 사용
				//true >> 파일이 계속 새로 생성되는게 아닌, 기존내용에 붙여넣기됨.append
				//new FileWriter("파일명", true) => append //기존 기록 남음
				FileOutputStream fos = new FileOutputStream(file, true);	
				
				String msg = "안녕하세요 지금은 파일입출력 하고 있습니다\r\n";
				//System.out.println((int)'안');
				fos.write(msg.getBytes());	//getBytes(): String을 byte[]로 변경
				fos.close();
				System.out.println("저장완료!!");
			} catch(Exception e) {}
			
	}

}
