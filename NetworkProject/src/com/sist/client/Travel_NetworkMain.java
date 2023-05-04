package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sist.common.ImageChange;

public class Travel_NetworkMain extends JFrame implements ActionListener {
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel logo;
	
	public Travel_NetworkMain() {
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("c:\\javaDev\\travel.jpg"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); //Layout 없이 직접 배치
	/*	mp.setBounds(10, 15, 1160, 50);
		cp.setBounds(10, 75, 960 , 730);
		tp.setBounds(980, 75, 200, 730); */
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(220, 15, 950, 130);
		cp.setBounds(10, 150, 960, 600);
		tp.setBounds(980, 150, 200, 600);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		
		b1 = new JButton("홈");
		b2 = new JButton("관광");
		b3 = new JButton("엔터");
		b4 = new JButton("숙박");
		b5 = new JButton("검색");
		b6 = new JButton("채팅");
		b7 = new JButton("숙소");
		//추가
		mp.setLayout(new GridLayout(1, 5, 15, 15)); //1줄에 5개씩
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		mp.add(b7);
		
		
		//윈도우 크기
		setSize(1200,800);
		setVisible(true);
		
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("네트워크 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");	//이거
		} catch (Exception e) { }
		new Travel_NetworkMain();
				
	}

	//버튼 처리
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			cp.card.show(cp, "home");
		} else if(e.getSource()==b2) {
			cp.card.show(cp, "location");
		} else if(e.getSource()==b3) {
			cp.card.show(cp, "enter");
		} else if(e.getSource()==b4) {
			cp.card.show(cp, "acomm");
		} else if(e.getSource()==b5) {
			cp.card.show(cp, "find");
		} else if(e.getSource()==b6) {
			cp.card.show(cp, "chat");
		} else if(e.getSource()==b7) {
			cp.card.show(cp, "news");
		} 
	}

}
