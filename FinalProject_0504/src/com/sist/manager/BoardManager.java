package com.sist.manager;
import java.util.*;

import com.sist.inter.BoardInterface;

import java.io.*;

public class BoardManager implements BoardInterface {
	// 게시물 전체를 가지고 있다 => List => 접속한 모든 사람이 공유
	private static List<BoardVO> list = new ArrayList<BoardVO>();
	
	/*
	 	Collection
	 		|
	 	-------------
	 	|			|
	   List		   Set 			Map ==> 인터페이스
	    |			|			 |
	   ArrayList	HashSet		HashMap
	   => List: 순서가 존재 (인덱스) ,데이터 중복 허용
	   		_게시판...
	   => Set: 순서가 없다 , 데이터 중복을 허용하지 않는다
	   		_회원가입
	   => Map: 순서가 없다 , 두개를 동시에 저장
	   					  key,value ==> key는 중복이 없다
	   					  				value는 중복이 가능
	   		_데이터 송신/수신 => 웹에서 지원하는 대부분의 클래스가 Map 형식으로 되어 있다
	   		------------웹(C/S)
		
	 */
	
	//BoardVO에 초기값 주기
	static 
	{
		//초기화
		/*
		 멤버변수에 대한 초기화
		 -----
		 	인스턴스 변수 : new를 이용해서 메모리 저장시마다 따로 저장된다
		 				(heap공간에 저장)
		 	정적변수 (static) : 컴파일시 자동 저장
		 	
		 	1) 명시적인 초기화
		 	2) 생성자
		 	3) 초기화블럭
		 		= 인스턴스 변수를 초기화
		 		  {
		 		  }
		 		= static 변수를 초기화
		 		static  { }
		 		
		 	명시적 초기화 = static{} = {} = 생성자
		 	---------------------------------
		 	명시적초기화는 선언과 동시에 값을 부여
		 	-------구현이 필요할 경우에는 사용할 수 없다
		 		   파일 읽기, 데이터 읽기, 메소드를 호출...
		 		   -----------------------------
		 		   클래스영역에서는 구현이 불가능하다
		 	
		 */
		
		FileInputStream fis =null;
		try {
			fis = new FileInputStream("c:\\java_data\\board.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<BoardVO>)ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			}catch (Exception e) {}
		}

	}
////////////////////////기능 설정
	//1. 목록 출력
	@Override
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> bList = new ArrayList<BoardVO>();
		
		int j=0;
		int rowSize=10; 
		int start = (page-1)*rowSize; //한페이지에 10개씩
		for(int i=0; i<list.size(); i++) {
			if(j<10 && i>= start) {
				bList.add(list.get(i));
				j++;
			}
		}
		return bList;
	}
	// 1-1. 총페이지
	public int boardTotalPage() {
		return (int)(Math.ceil(list.size()/10.0));
	}
	//2. 상세보기
	@Override
	public BoardVO boardDetailData(int no) {
		//하나의 데이터를 가져옴
		BoardVO vo = new BoardVO();
		//조회수 증가
		for(BoardVO bvo : list) {
			if(no==bvo.getNo()) {
				bvo.setHit(bvo.getHit()+1);	//조회수 증가
			}
		}
		//상세볼 내용
		for(BoardVO bvo : list) {
			if(no == bvo.getNo())
				vo = bvo;
		}
		return vo;
	}
	
	//3. 글쓰기 INSERT
	@Override
	public void boardInsert(BoardVO vo) {
		int no = noIncrement();
		vo.setNo(no);
		vo.setRegdate(new Date());
		list.add(vo);
		
		//작성한거 list에 저장하고 파일에 저장해둠
		//다른 사람이 들어와도 작성한글 유지되게
		try
		{
			FileOutputStream fos = new FileOutputStream("c:\\java_data\\board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);	
			fos.close();
			oos.close();
		} catch(Exception ex) {}
	}
	
	// 수정할 데이터 읽기
	@Override
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		for(BoardVO bvo : list) {
			if(bvo.getNo() == no)
				vo = bvo;
		}
		return vo;
	}

	// 수정
	@Override
	public String boardUpdate(BoardVO vo) {
		return null;
	}
	
	// 삭제
	@Override
	public String boardDelete(int no, String pwd) {
		return null;
	}

	// 자동 증가번호
	@Override
	public int noIncrement() {
		int max =0;
		for(BoardVO vo : list) {
			if(vo.getNo() > max)
				max = vo.getNo();
		}
		return max+1;
	}
	
}
