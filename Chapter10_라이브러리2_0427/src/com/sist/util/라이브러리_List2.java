package com.sist.util;
//List의 메소드
/*
 	 add, remove, set, size, clear
 	 ㅔ---------------------------- 기본메소드
 	 
 	 containsAll(): 두개의 list에서 중복 된 테이터를 모아서 관리 => JSON
 	 retainAll(): 두개 list에서 중복됟ㄴ 데이터만 남기기
 	 addAll: 데아터전체복사
 	 sublist: 부분적 데이터를 복사할 경우에 사용
 	 -----------------장바구니, 여권
 	 				  ---- 출력구매;
 	 
 */
import java.util.*;

public class 라이브러리_List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3); //index=0
		list.add(5); //1
		list.add(7); //2
		list.add(6); //3
		list.add(9); //4
		list.add(2); //5
		list.add(1); //6
		list.add(4); //7
		
		//출력
		for(Object i:list) {
			System.out.println(i);
		}
		// 일부만 추가 subList(start, end)
		ArrayList list2  = new ArrayList(list.subList(1, 4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		//end-1 => 1,2,3
		System.out.println("=============");
		for(Object i:list2) {
			System.out.println(i);
		}
		
		System.out.println("=============");
		// sort
		Collections.sort(list);
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("=============");
		//같은 데이터 추출
		System.out.println(list.containsAll(list2));	//list의 값이 list2에 있는가 >> True/False 출력
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		//중복된 데이터만 추출 => 교집합
		System.out.println(list.retainAll(list2));	//list와 list2 교집합을 list에 저장 >> 5,6,7 출력
		for(Object o : list) {		
			
			System.out.println(o);
		}
		
		System.out.println("=============");
		//addAll로 데이터copy
		ArrayList list3 = new ArrayList();
		list3.addAll(list); //list의 값을 list3에 copy
		for(Object o : list3) {
			
			System.out.println(o);
		}
		
		
	}

}
