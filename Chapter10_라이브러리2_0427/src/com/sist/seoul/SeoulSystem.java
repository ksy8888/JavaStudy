package com.sist.seoul;

import java.util.*;
import java.io.*;

public class SeoulSystem {
	
	private static ArrayList list = new ArrayList();
	static 
	{
		
		try {
			//파일 읽기
			FileReader fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0; //한글자 읽기	=> A => 65
			
			StringBuffer sb = new StringBuffer();
			while((i=fr.read()) != -1) {	//-1 End Of File
				sb.append((char)i);
			}
			fr.close();
		//	System.out.println(sb.toString());
			String[] seouls = sb.toString().split("\n");	//한줄씩 저장
			for(String m : seouls) {
				StringTokenizer st = new StringTokenizer(m,"|");
			
				SeoulLocationVO vo = new SeoulLocationVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				
				list.add(vo); 
			}
		} catch(Exception ex) {}
	} 
/*	public static void main(String[] args) {
		seoulSystem ms = new seoulSystem();
	}
*/
	//menu
	public int seoulMenu() {
		System.out.println("===== 명소 메뉴 =====");
		System.out.println("1. 목록 출력");	//
		System.out.println("2. 상세 보기");	//
		System.out.println("9. 시스템 종료");
		System.out.println("===================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택: ");
		return scan.nextInt();
		
	}
	//목록 출력(페이지)
	public ArrayList seoulListData(int page) {
	
		//size()=1938	1939/10.0	193.8 ==> 194
		int totalpage = (int)(Math.ceil(list.size()/10.0));
	
		//1페이지 0, 2페이지 10, 3페이지 20...
		int start = (page-1)*10;
		
		//0~10 (0부터9까지 가져옴) , 10~20 , 20~30 ... subList(s, e-1)
		int end = page*10;
		
		if(page==totalpage) {
			//맨마지막 페이지는 10개가 안됨
			//194 ==> 194*10 => 1940-(10-8) ==> 1938
			end =list.size();
		}
		
		ArrayList seoulList = new ArrayList(list.subList(start, end));
		return seoulList;
	}
	
	//상세보기
	public SeoulLocationVO seoulDetailData(int no) {
		return (SeoulLocationVO)list.get(no-1);	// 기본 리턴형이 object이기 때문에, 가져온 list를 (SeoulLocationVO) 형변환 해야함. 
	}
	//영화검색
	//조립
	public void process() {
		while(true) {
			int menu=seoulMenu();
			if(menu==9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("페이지 입력:");
				int page = scan.nextInt();
				
				ArrayList mList = seoulListData(page);
				for(int i=0; i<mList.size(); i++) {
					SeoulLocationVO vo = (SeoulLocationVO)mList.get(i);
					System.out.println(vo.getNo()+ "." + vo.getName());
				}
						
			}
			else if(menu==2) {
				Scanner scan = new Scanner(System.in);
				System.out.print("상세 볼 영화번호 입력(1~1938): ");
				int no = scan.nextInt();
				
				SeoulLocationVO vo = seoulDetailData(no);
				System.out.println("순위:" + vo.getNo());
				System.out.println("영화명: " + vo.getName());
				System.out.println("감독: "+vo.getContent());
				System.out.println("출연: "+vo.getAddress());
	
			}
		}
	}
}
