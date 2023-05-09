package com.sist.manager;



import java.io.*;

import java.util.*;



public class TravelSystem {

	private static List<TravelVO> list = new ArrayList<TravelVO>();

	static {

		FileInputStream fis = null;

		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream("c:\\java_data\\Travel.txt");

			ois = new ObjectInputStream(fis);

			list = (List<TravelVO>)ois.readObject();

		}catch (Exception ex) {

			ex.printStackTrace();

		}finally {

			try {

				fis.close();

				ois.close();

			} catch (Exception ex) {}

		}

	}

	public  List<TravelVO> travelListData(int page) {	//뮤직데이터 20개씩 나눠서 전송하는 메소드. 사용자가 page누른거에 따라
		List<TravelVO> gList = new ArrayList<TravelVO>();
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
	
	public int travelTotalPage() {
		return (int)(Math.ceil(list.size()/20.0));	//한 페이지 20개씩
	}
	
/////////////////////////////////////////////////////////////////	

	public  List<TravelVO> travelCategoryData(int cno) {
		List<TravelVO> mList = new ArrayList<TravelVO>();	//장르별 출력
		for(TravelVO vo : list) {
			if(vo.getCno() == cno) {
				//System.out.println(vo.getNo() + "." + vo.getTitle());
				mList.add(vo);
			}
		}
		return mList;
	}
	
	public List<TravelVO> travelFindData(String title) {
		List<TravelVO> mList = new ArrayList<TravelVO>();
		for(TravelVO vo : list) {		//검색해서 찾아옴
			if(vo.getTitle().contains(title)) {
				mList.add(vo);
			}
		}
		return mList;
	}
/////////////////////////////////////////////////////////////////////
	
	public TravelVO travelDetailData(String title) {
		TravelVO vo = new TravelVO();
		for(TravelVO gvo : list) {
			if(gvo.getTitle().equals(title)) { //같은 이름을 갖고 있는거 찾아옴
				vo = gvo;
				break;	
			}
		}
		return vo;
	}
	
	
	public static void main(String[] args) {
		TravelSystem ms = new TravelSystem();
		
		//Scanner
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6): ");
			String cno = in.readLine();
			ms.travelCategoryData(Integer.parseInt(cno));
		} catch (Exception e) {
			
		}
	} 
	}