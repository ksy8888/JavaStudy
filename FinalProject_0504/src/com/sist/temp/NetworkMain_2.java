package com.sist.temp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sist.common.ImageChange;

public class NetworkMain_2 extends JFrame implements ActionListener {
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	JLabel logo;
	Login login = new Login();
	
	public NetworkMain_2() {
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("c:\\javaDev\\travel.jpg"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		//logo.setIcon(new ImageIcon("c:\\javaDev\\travel.jpg"));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); //Layout 없이 직접 배치
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(220, 15, 600, 50);
		cp.setBounds(220, 150, 960, 730);
		tp.setBounds(980, 75, 200, 730);
		
		/*
		mp.setBounds(10, 15, 600, 50);
		cp.setBounds(10, 75, 960 , 730);
		tp.setBounds(980, 75, 200, 730);
		 */
		
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		b1 = new JButton("홈");
		b2 = new JButton("뮤직검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스검색");
		b5 = new JButton("뮤직추천");
		//추가
		mp.setLayout(new GridLayout(1, 5, 5, 5)); //1줄에 5개씩
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		
		//윈도우 크기
		setSize(1200,800);
		//setVisible(true);
		
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		//로그인
		login.b1.addActionListener(this);	//리스너처리메소드 어디있는지
		login.b2.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");	//이거
		} catch (Exception e) { }
		new NetworkMain_2();
				
	}

	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			cp.card.show(cp, "home");
		} else if(e.getSource()==b2) {
			cp.card.show(cp, "find");
		} else if(e.getSource()==b3) {
			cp.card.show(cp, "chat");
		} else if(e.getSource()==b4) {
			cp.card.show(cp, "news");
		} else if(e.getSource()==b5) {
			cp.card.show(cp, "recomm");
		} 
		
		else if(e.getSource()== login.b1) {
			login.setVisible(false);
			setVisible(true);
		} else if(e.getSource()== login.b2) {
			System.exit(0);
		}
	}

}
