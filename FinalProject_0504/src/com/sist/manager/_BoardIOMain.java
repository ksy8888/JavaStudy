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

public class _BoardIOMain {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream("c:\\java_data\\board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			List<BoardVO> list = new ArrayList<BoardVO>();
			BoardVO vo = new BoardVO();
			vo.setNo(1);
			vo.setName("홍길동");
			vo.setSubject("파일 입출력을 이용한 게시판 만들기");
			vo.setContent("파일 입출력을 이용한 게시판 만들기");
			vo.setRegdate(new Date());
			vo.setPwd("1234");
			vo.setHit(0);
			list.add(vo);
			oos.writeObject(list);															
			System.out.println("저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
