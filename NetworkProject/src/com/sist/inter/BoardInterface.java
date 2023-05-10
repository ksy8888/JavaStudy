package com.sist.inter;

import java.util.*;
import com.sist.manager.*;

public interface BoardInterface {
	//1.목록출력
	public List<BoardVO> boardListData(int page);
	//2. 상세보기 BoardVO >> 게시판 글 하나에 대한 데이터
	public BoardVO boardDetailData(int no);
	//3. 글쓰기 _저장만 하면 됨
	public void boardInsert(BoardVO vo);
	// 4. 수정하기
	public BoardVO boardUpdateData(int no);
	//5. 실제 수정
	public String boardUpdate(BoardVO vo);	//비밀번호 확인
	//6.삭제
	public String boardDelete(int no, String pwd); //비밀번호 확인
	//7. 자동 증가번호
	public int noIncrement();	//번호 중복없이
	
	
}
