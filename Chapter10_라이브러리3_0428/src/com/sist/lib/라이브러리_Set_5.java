package com.sist.lib;
import java.util.*;

public class 라이브러리_Set_5 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		for(int i=0; i<10; i++) {
			int r =(int)(Math.random()*100)+1;
			set.add(r);
		}
		
		//출력
		System.out.println(set);
		//50보다 작은 수
		for(Object o : set) {
			//System.out.println(o);
			if((int)o < 50 ) {
				System.out.print(o + " ");
			}
			
		}
		
		System.out.println();
		
		//50보다 큰 수
		for(Object o1 : set) {
			//System.out.println(o);
			if((int)o1 > 50 ) {
				System.out.print(o1 + " ");
			}
			
		}
		
		System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//1. 정렬
		//2. 검색이 빠르다
		TreeSet tSet = new TreeSet();
		for(int i=0; i<10; i++) {
			int r =(int)(Math.random()*100)+1;
			tSet.add(r);
		}
		System.out.println(tSet);
		
		System.out.println("50보다 작은 수:" + tSet.headSet(50));
		System.out.println("50보다 큰 수:" + tSet.tailSet(50));
		
		
//검색용이기 때문에 for문 안돌려도됨 >> headSet , tailSet 메소드가 있음
/*		for(Object o3 : tSet) {
			if((int)o3 > 50 ) {
				System.out.print(o3 + " ");
			}
			
		}
		System.out.println();
		for(Object o4 : tSet) {
			if((int)o4 < 50 ) {
				System.out.print(o4 + " ");
			}
			
		}
*/	
	}

}
