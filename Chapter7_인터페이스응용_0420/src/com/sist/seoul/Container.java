package com.sist.seoul;

import java.util.*;

public class Container {

	private String[] clsArr = {
			"com.sist.seoul.SeoulLocation",
			"com.sist.seoul.SeoulNature",
			"com.sist.seoul.SeoulShopping",
			"com.sist.seoul.SeoulHotel",
			"com.sist.seoul.SeoulGeustHouse"
	};
	private String[] key = {
			"loc", "nat", "shop", "hotel", "guest"
	};
	private Map clsMap = new HashMap();
	//Map => key,value ==> interface
	public Container()
	{
		try
		{
			for(int i=0; i<key.length; i++)
			{
				Class clsName =Class.forName(clsArr[i]);	//클래스이름 불러오기
				Object obj = clsName.getDeclaredConstructor().newInstance();	//불러온 클래스의 생성자호출
				System.out.println(obj);
				clsMap.put(key[i], obj);
				
			}
		} catch(Exception e) {}
	}
	public Object getBean(String key)
	{
		return clsMap.get(key);
	}
	public static void main(String[] args) {
		Container c = new Container();
	}
}
