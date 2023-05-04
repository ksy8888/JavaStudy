package com.sist.manager;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;

public class DataCollectionManager {

	public static void main(String[] args) {
		List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
		FileOutputStream fos = null; //파일출력
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:\\java_data\\genie_music.txt");
			//저장
			oos = new ObjectOutputStream(fos);
			
			//사이트 연결
			String[] urls = { 
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
			};
			
			int k=1; //고유번호
			for(int i=0; i<urls.length; i++) {
				Document doc = Jsoup.connect(urls[i]).get();
				Elements title = doc.select("table.list-wrap td.info a.title");
				Elements singer = doc.select("table.list-wrap td.info a.artist");
				Elements album = doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster = doc.select("table.list-wrap a.cover img");
				Elements etc = doc.select("table.list-wrap span.rank");
				
				/*
				 	<a>값</a> => text()
				 	<img src="이미지주소">
				 */
				for(int j=0; j<title.size(); j++) {
					System.out.println("고유번호"+k);
					System.out.println("카테고리번호:"+(i+1));
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));
					String ss =etc.get(j).text();
				//	System.out.println(ss);
					String state ="";
					String id=""; //등폭
					if(ss.contains("유지")) {
						state= "유지";
						id="0";
					}
					
					else if(ss.contains("new")) {
						state= "NEW";
						id="0";
					}
					// 4상승
					else {
						state = ss.replaceAll("[0-9]", "");	//상승
						id = ss.replaceAll("[가-힣]", "");	//4
					}
							
					System.out.println("상태:" +state);					
					System.out.println("등폭:" + id);
					System.out.println("동영상:");
					System.out.println("===============================");
					
					GenieMusicVO vo = new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcreament(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					list.add(vo);
					k++;
				}
			}
			
			oos.writeObject(list);
			System.out.println("저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				fos.close();
				oos.close();
			} catch(Exception e) {}
			
		}
	}
	
	
	
	public static String youtubeKeyData(String title) {
		String key = "";
		try {
			String url ="https://www.youtube.com/results?search_query="+URLEncoder.encode(title, "UTF-8");
			Document doc = Jsoup.connect(url).get();
			String data = doc.toString();
			
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m = p.matcher(data);
			while(m.find()) {
				String s = m.group();
				///watch?v=0m4lzxulFpM\u0026pp=ygUJ7JWE7J2067iM"
				// v= 뒤부터 "전까지 잘라라 (동영상키가 _ 0m4lzxulFpM\u0026pp=ygUJ7JWE7J2067iM)
				s=s.substring(s.indexOf("=")+1 , s.indexOf("\""));
				key = s;
				break;
			}
					
		} catch(Exception e) {}
		return key;
	}

}
