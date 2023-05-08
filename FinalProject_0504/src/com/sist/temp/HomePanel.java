package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.*;
import javax.swing.JPanel;
import java.util.*;
import java.awt.*;
import java.net.*;
import javax.swing.JLabel;

import com.sist.manager.GenieMusicVO;

public class HomePanel extends JPanel {
	PosterCard[] pcs = new PosterCard[20];
	JPanel pan = new JPanel();
	JButton b1,b2;
	JLabel pageLa;
	
	public HomePanel() {
		
		b1= new JButton("이전");
		b2= new JButton("다음");
		pageLa = new JLabel("0 page / 0 pages");
		setLayout(null);
		pan.setLayout(new GridLayout(4,5, 5, 5)); //4줄 5개씩
		
		pan.setBounds(10, 15, 730, 700);
		add(pan);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pageLa);
		p.add(b2);
		p.setBounds(10, 720, 730, 35);
		add(p);
		
	}
	public void cardPrint(List<GenieMusicVO> list) {
		
		int i=0;
		for(GenieMusicVO vo : list) {
			pcs[i] = new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		
	}
	
	public void cardInit(List<GenieMusicVO> list) {
//		for(int i=0; i<list.size(); i++) {
//			pcs[i].poLa.setIcon(null);
//			pcs[i].tLa.setText("");
//			
//		}
		pan.removeAll();	//데이터 제거	>> 없으면 화면 넘어가는거 안됨 덮어씌워짐
		pan.validate();		//Panel 재배치
	}
}
