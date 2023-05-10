package com.sist.client;

import javax.swing.JPanel;

import com.sist.manager.NaverNewsManager;
import com.sist.manager.NewsVO;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

public class NewsPanel extends JPanel implements ActionListener {
	
	
	NewsCard[] cards = new NewsCard[5];
	JTextField tf;
	JButton b;
	JPanel pan;
	
	
	public NewsPanel() {
		//초기화
		tf = new JTextField();
		b= new JButton("검색");
		
		for(int i=0; i<cards.length; i++) {
			cards[i] = new NewsCard();
		}
		pan = new JPanel();
		pan.setLayout(new GridLayout(5,1,5,3));
		setLayout(null);
		
		//배치
		tf.setBounds(10, 15, 300, 30);
		b.setBounds(320, 15, 100, 30);
		pan.setBounds(10, 55, 720, 650);
		add(tf);
		add(b);
		add(pan);
		
		//등록
		tf.addActionListener(this);
		b.addActionListener(this);
		
		//
		newsPrint("뮤직");
	}
	
	public void newsPrint(String fd) {	//디폴트연결
		List<NewsVO> list = NaverNewsManager.newsSerarchData(fd);
		int i=0;
		for(NewsVO vo : list) {
			cards[i].titleLa.setText(vo.getTitle());
			cards[i].contentTa.setText(vo.getContent());
			cards[i].dateLa.setText(vo.getDate());
			pan.add(cards[i]);
			i++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==tf || e.getSource()==b) {
			String fd = tf.getText();
			//웹 => 유효성 검사
			if(fd.length() < 1) {	//입력이 안됐으면
				JOptionPane.showMessageDialog(this, "검색어를입력");
				tf.requestFocus();
				return;
			}
			newsPrint(fd);
		}
	}
}
