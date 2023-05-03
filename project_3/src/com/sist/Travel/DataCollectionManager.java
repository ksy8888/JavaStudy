package com.sist.Travel;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class DataCollectionManager {
	 public static void main(String[] args) {
		List <TravelVO> list = new ArrayList<>();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos= new FileOutputStream("C:\\java_data\\travel.txt");
			oos = new ObjectOutputStream(fos);
			int c =1;
			 String [] urls2 = {"attractions","nature","entertainment","shopping","restaurants","hotels","seoul-stay"};
			 
			for(int i =0 ; i < urls2.length;i++) {
				String pages = "https://korean.visitseoul.net/"+urls2[i]+"?curPage=";
				for(int j = 1 ; j <= 5; j++) {
					Document doc = Jsoup.connect(pages+String.valueOf(j)).get();
					Elements title = doc.select("div.article-list-slide span.title");	
					Elements contents = doc.select("div.infor-element-inner span.small-text");
					Elements poster = doc.select("div.article-list div.thumb img");
				//	System.out.println(title.size());
					
					for(int k=0; k<title.size(); k++) {
						System.out.println("고유번호"+c);
						
						System.out.println("카테고리번호:"+(i+1));
						System.out.println(title.get(k).text());
						System.out.println(poster.get(k).attr("src"));
						
						TravelVO vo = new TravelVO();
						vo.setNo(c);
						vo.setCno(k);
						vo.setTitle(title.get(k).text());
						vo.setPoster(poster.get(k).text());
						
						list.add(vo);
						c++;
						
						}
					
					
					
					}
				}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	 
	 
	 
}
