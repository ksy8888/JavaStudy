package com.sist.io;
import java.util.*;
import java.io.*;

public class Object_InputOutput_2_내용읽어오기 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream out = new FileInputStream("c:\\java_data\\사원.txt");
		ObjectInputStream ois = new ObjectInputStream(out);
		
		//객체 단위로 값을 읽어온다
		List<Sawon> list = (List<Sawon>)ois.readObject();
		
		for(Sawon s : list) {
			System.out.println(s.getSabun()+ " "
							+ s.getName()+ " "
							+ s.getDept()+ " "
							+ s.getJob()+ " "
							+ s.getPay()+ " ");
			
		}
		
	}

}
