package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.manager.TravelVO;

public class PosterCard extends JPanel {
	JLabel poLa = new JLabel(); //이미지 출력 posterLabel
	JLabel tLa = new JLabel(); //제목 출력	titleLabel
	
	//초기화
	public PosterCard(TravelVO vo) {
		setLayout(null);
		poLa.setBounds(5, 5, 150, 130);
		tLa.setBounds(5, 140, 150, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url = new URL(vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 100, 130);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		} catch(Exception e) {}
	}
}
