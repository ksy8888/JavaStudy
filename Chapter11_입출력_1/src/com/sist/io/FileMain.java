package com.sist.io;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
        
		
		try {
			/*
			 //File설정
			File file = new File("C:\\javaDev\\school.txt");
			//File 존재여부 확인
			if(!file.exists()) { 	//파일이 존재하지 않은 경우
				
				file.createNewFile();
			}
			System.out.println("파일 만들기 성공...");
			*/
			
	/*		File dir = new File("C:\\java_data");
			if(!dir.exists()) {
				dir.mkdir();
				System.out.println("폴더 만들기 성공");
			}
	*/		
			File dir = new File("C:\\javaDev");
			File[] files =dir.listFiles();
			
			for(File f:files) {
				if(f.isFile()) {	//파일이면
					System.out.println(f.getName()+" "+ f.length());
				} else if(f.isDirectory()) {	//dir이면
					System.out.println(f.getName()+" DIR");
				}
			}
					
		} catch(Exception e) {}
		
	}

}
