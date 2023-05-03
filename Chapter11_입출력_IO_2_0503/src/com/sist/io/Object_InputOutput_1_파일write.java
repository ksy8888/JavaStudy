package com.sist.io;
/*
 	메모리 입출력
 	파일 입출력 ===> 객체단위 저장 (프로젝트에서 이용)
 	------- ObjectInputStream / ObjectOutputStream
 			=> 객체 단위로 읽기		=> 객체 단위로 파일에 저장
 	
 	객체 단위로 저장
 	-----------
 */

import java.io.*;
import java.util.*;

public class Object_InputOutput_1_파일write {

	public static void main(String[] args) throws Exception  {
		List<Sawon>  list = new ArrayList<Sawon>();
		list.add(new Sawon(1, "홍길동", "개발부" , "대리" , 4500));
		list.add(new Sawon(2, "박문수", "영업부" , "과장" , 3500));
		list.add(new Sawon(3, "심청이", "기획부" , "사원" , 5500));
		list.add(new Sawon(4, "이순신", "자재부" , "부장" , 6500));
		list.add(new Sawon(5, "강감찬", "총무부" , "대리" , 4500));
		FileOutputStream fos = new FileOutputStream("c:\\java_data\\사원.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//file 단위(문자열) => 객체 단위 저장
		oos.writeObject(list);
		
		fos.close();
		oos.close();
		System.out.println("객체단위 저장 완료@");
	}

}
