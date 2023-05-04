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