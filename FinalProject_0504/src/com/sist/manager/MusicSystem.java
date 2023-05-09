package com.sist.manager;

import java.io.*;
import java.util.*;

public class MusicSystem {
	//데이터 읽기
	private static List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
	
	static {
		//초기화블럭 GenieMusicVO에 값을 채워넣어야함
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		 try {
			 fis = new FileInputStream("c:\\java_data\\genie_music.txt");
			 ois = new ObjectInputStream(fis);
			 list = (List<GenieMusicVO>)ois.readObject();	//읽어온 데이터 넘겨줌_채워주기
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
		 
		 finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
//////////////////////0508
	public  List<GenieMusicVO> musicListData(int page) {	//뮤직데이터 20개씩 나눠서 전송하는 메소드. 사용자가 page누른거에 따라
		List<GenieMusicVO> gList = new ArrayList<GenieMusicVO>();
		int j=0;
		int rowSize=20;
		int start= (page-1)*rowSize;	//시작페이지 설정
		/*
		 	1 page => 0~19
		 	2 page => 20~39
		 */
		
		for(int i=0; i<list.size(); i++) {
			if(j<rowSize && i>=start) {	//20번 이전이면 저장함 >> 1페이지 저장
				gList.add(list.get(i));
				j++;
			}
		}
		return gList;
	}
	
	public int musicTotalPage() {
		return (int)(Math.ceil(list.size()/20.0));	//한 페이지 20개씩
	}
	
/////////////////////////////////////////////////////////////////	0504
	public  List<GenieMusicVO> musicCategoryData(int cno) {
		List<GenieMusicVO> mList = new ArrayList<GenieMusicVO>();	//장르별 출력
		for(GenieMusicVO vo : list) {
			if(vo.getCno() == cno) {
				//System.out.println(vo.getNo() + "." + vo.getTitle());
				mList.add(vo);
			}
		}
		return mList;
	}
	
	public List<GenieMusicVO> musicFindData(String title) {
		List<GenieMusicVO> mList = new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo : list) {		//검색해서 찾아옴
			if(vo.getTitle().contains(title)) {
				mList.add(vo);
			}
		}
		return mList;
	}
//////////////////////////////////////////////////////0509
	public GenieMusicVO musicDetailData(String title) {
		GenieMusicVO vo = new GenieMusicVO();
		for(GenieMusicVO gvo : list) {
			if(gvo.getTitle().equals(title)) { //같은 이름을 갖고 있는거 찾아옴
				vo = gvo;
				break;	
			}
		}
		return vo;
	}
	
	public static void main(String[] args) {
		MusicSystem ms = new MusicSystem();
		
		//Scanner
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6): ");
			String cno = in.readLine();
			ms.musicCategoryData(Integer.parseInt(cno));
		} catch (Exception e) {
			
		}
	}
}
