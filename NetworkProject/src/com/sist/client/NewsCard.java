package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewsCard extends JPanel {
	JLabel titleLa;
	JTextPane contentTa;
	JLabel authorLa, dateLa;
	
	public NewsCard() {
		setLayout(null);
		titleLa = new JLabel("");
		contentTa = new JTextPane();
		contentTa.setEnabled(false);	//textarea는 편집 되기 때문에 막아둠
		JScrollPane js = new JScrollPane(contentTa);
//		authorLa = new JLabel("");
		dateLa = new JLabel("");
		
		//배치
		titleLa.setBounds(10, 10, 730, 35);
		js.setBounds(10, 50, 750, 100);
		//contentTa.setBounds(10, 50, 730, 100);
		//authorLa.setBounds(10, 155, 360, 35);
		dateLa.setBounds(380, 155, 360, 35);
		
		//추가
		add(titleLa);
		//add(contentTa);
		add(js);
		add(dateLa);
	}
}
