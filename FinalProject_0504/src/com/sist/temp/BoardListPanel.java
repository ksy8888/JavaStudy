package com.sist.temp;

import java.util.*;
import java.util.List;

import com.sist.manager.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
import java.text.SimpleDateFormat;

public class BoardListPanel extends JPanel implements ActionListener , MouseListener {
	
	JTable table;
	DefaultTableModel model;
	JLabel pageLa, titleLa;
	JButton b1,b2,b3;
	
	//전체 사용 변수
	int curpage=1; //현재페이지
	int totalpage = 0; 
	
	TableColumn column;
	BoardManager bm = new BoardManager();
	
	ControlPanel cp; //화면 변경(이동)
	public BoardListPanel(ControlPanel cp) {
		
		this.cp = cp; //(ControlPanel에서 이미 생성된걸 받아옴)
		b1 = new JButton("새글");
		b2 = new JButton("이전");
		b3 = new JButton("다음");
		titleLa = new JLabel("자유게시판");
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		pageLa = new JLabel("0 page / 0 pages");
		
		String[] col = {"번호" , "제목" , "이름" , "작성일" , "조회수"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false; //편집 방지 => 오버라이딩
				//상속없이 오버라이딩이 가능 -> 익명의 클래스
				//윈도우 / 빅데이터 분석 => 웹에서는 거의 없다
			}
			
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		
		//배치
		setLayout(null);
		titleLa.setBounds(10, 15, 720, 60);
		add(titleLa);
		
		b1.setBounds(10, 100, 100, 30);
		add(b1);
		
		js.setBounds(10, 140, 720, 500);
		add(js);
		
		JPanel p = new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		p.setBounds(10, 650, 720, 35);
		add(p);
		
		// 컬럼 간격 조절
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(45);
		
		//글씨 가운데 정렬
		for(int i=0; i<col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
			if(i!=1) {
				dt.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(dt);
			
		}
		
		boardPrint();
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		table.addMouseListener(this);
	}
	public void boardPrint() {
		//테이블에 출력된 내용 지우기
		for(int i=model.getRowCount()-1; i>=0; i--) {
			model.removeRow(i);
		}
		//다시 출력
		//1. 데이터 읽기
		List<BoardVO> list = bm.boardListData(curpage);
		totalpage = bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalpage + " pages");	//페이지설정
		
		//설정한 페이지 출력	//최신페이지가 가장 위로가게 역순출력
		for(int i=list.size()-1; i>=0; i--) {	
			BoardVO vo = list.get(i);
			String[] data = {
				String.valueOf(vo.getNo()),
							vo.getSubject(),
							vo.getName(),
							new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
							String.valueOf(vo.getHit())
			};
			model.addRow(data);
			
		}
		
	}
	
	//테이블 더블 클릭시 => 상세보기 이동
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == table) {
			//몇번째줄을 선택했는지
			int row = table.getSelectedRow();
			String no = table.getValueAt(row, 0).toString();
			
			BoardVO vo = bm.boardDetailData(Integer.parseInt(no));
			cp.bdp.noLa.setText(String.valueOf(vo.getNo()));
			cp.bdp.nameLa.setText(vo.getName());
			cp.bdp.subLa.setText(vo.getSubject());
			cp.bdp.pane.setText(vo.getContent());
			cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
			cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
			
			//detailpanel로 보내서 출력함
			cp.card.show(cp, "bdp");	//화면 이동 //상세보기화면 변경
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) //글쓰기
		{
			cp.ip.tf1.setText("");
			cp.ip.tf2.setText("");
			cp.ip.ta.setText("");
			cp.ip.pf.setText("");
			cp.card.show(cp,  "insert");
		}
	}

}
