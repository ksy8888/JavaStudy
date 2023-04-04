//while 주로 사용되는 곳

import java.io.*;

public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i;
			
			FileReader fr = 
					new FileReader("C:\\javaDev\\javaStudy\\Chaper3_제어문_반복문2_0404\\src\\반복문_3_while357배수갯수최대최소.java");
			while((i=fr.read()) != -1) {	//-1 파일 종료
				System.out.print((char)i);
			}
		} catch(Exception ex) {} {
			
		}
	}

}
