package com.sist.io;
import java.io.*;
import java.net.*;
/*
 	URLConnection	=> url.openConnection()
 	      |
 	-------------------------
 	|						|
 HttpURLConnection		HttpsURLConnection
 
 */
public class 입출력_5_사이트읽기 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		//연결이 되었다면
		if(conn != null) {
			//브라우저 => 1byte씩 전송
			// 1byte => 2byte로 변환 >> InputStreamReader
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		//																-------------------서버로부터 데이터 모음
		//											--------------------2바이트씩
			while(true) {
				String data = in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
			
		}
	}

}
