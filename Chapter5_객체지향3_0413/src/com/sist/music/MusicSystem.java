package com.sist.music;

import java.util.Scanner;

public class MusicSystem {

	Music[] music = new Music[50];	// 배열만 생성해둠. 안의 데이터는 null.  /////주소값 채워줘야함
	
	// 1. 메소드 => 생성자
	void init() {
		/*
		 	인스턴스 : 객체생성 => 객체명.변수 , 배열...
		 	static : 클래스명.배열명 ..
		 */
		for(int i=0; i<MusicData.title.length; i++) {		//MusicData는 static 변수이기때문에 new없이 바로 호출가능
			//System.out.println("메모리할당전"+ "music["+ i + "]= " + music[i]);
			music[i] = new Music(); //Music 크기의 메모리공간을 50개 생성		//////주소값 채워줌
		//	System.out.println("메모리할당후"+"music["+ i + "]= " + music[i]);
			
			music[i].title = MusicData.title[i];
			music[i].singer = MusicData.singer[i];
			music[i].album = MusicData.album[i];
			music[i].state = MusicData.state[i];
			music[i].modify = MusicData.modify[i];
		}
	}
	
	int menu()
	{
		System.out.println("==============Menu==============");
		System.out.println("1. 목록보기");
		System.out.println("2. 검색");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료");
		System.out.println("================================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택:");
		
		return scan.nextInt();
	}
	
	Music[] musicListData()		//목록이니까 배열 통으로 불러옴
	{
		return music;
		
	}
	
	
	Music musicDetailData(int no) 	//상세보기
	{
		return music[no-1];
	}
	
	Music[] musicFindData(String title)  //검색
	{
		int count=0;
		for(Music mm : music)
		{
			if(mm.title.contains(title))	//사용자가 전해준 title변수가 music의 title에 있는가
			{
				count++;	
			}
		} 	////////////// 갯수를 확인
		
		Music[] m= new Music[count];	//구한 갯수만큼 배열 생성
		
		int i=0;
		for(Music mm : music)	//값 대입
		{
			if(mm.title.contains(title))	//사용자가 전해준 title변수가 music의 title에 있는가
			{
				m[i] = mm;
				i++;
			}
		}
		
		return m;
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms = new MusicSystem();
		ms.init();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력:");
		String title = scan.next();
		Music[] data = ms.musicFindData(title);
		
		int i=0;
		for(Music m : data)
		{
			System.out.println(i + "." + m.title);
			i++;
		}
		
		System.out.println("==================================");
		System.out.print("상세보기(1~50): ");
		int no =scan.nextInt();
		Music mm = ms.musicDetailData(no);
		System.out.println("곡명: " + mm.title);
		System.out.println("가수명: " + mm.singer);
		System.out.println("앨범명: " + mm.album);
		System.out.println("상태: "+ mm.state);
		System.out.println("변등폭: "+ mm.modify);
	}
*/
	
}

