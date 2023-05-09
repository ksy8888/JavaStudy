package com.sist.client;
import java.util.*;
import com.sist.manager.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// 상세보기

//버튼, 메뉴, 텍스트필드 => ActionListener
//JLabel, Table => MouseListener
public class DetailPanel extends JPanel implements ActionListener {
	
	JLabel imgLa;
	JLabel la1, la2;
	JButton b1;
	JLabel titleLa, contentLa, keyLa;
	ControlPanel cp;
	public DetailPanel(ControlPanel cp) {
		
		this.cp = cp;
		//초기화, 시작과 동시에 구현
		//웹 => 데이터베이스 설정, 자동로그인...
		imgLa = new JLabel();
		la1 = new JLabel("제목");
		la2 = new JLabel("설명");
		
		b1 = new JButton("목록");
		
		titleLa = new JLabel("");
		contentLa = new JLabel("");
//		singerLa = new JLabel("");
//		albumLa = new JLabel("");
//		stateLa = new JLabel("");
//		crementLa = new JLabel("");
		//keyLa = new JLabel("");
		
		//배치
		setLayout(null);
		imgLa.setBounds(100, 15, 530, 350);	//제목
		
		la1.setBounds(100, 375, 60, 40);	
		titleLa.setBounds(165, 375, 300, 40);	//가수명
		
		la2.setBounds(100, 425, 60, 40);	
		contentLa.setBounds(165, 425, 300, 40);
		
		/*		la3.setBounds(100, 475, 60, 40);	
		albumLa.setBounds(165, 475, 300, 40);
		
		la4.setBounds(100, 525, 60, 40);	
		stateLa.setBounds(165, 525, 300, 40);
		
		la5.setBounds(100, 575, 60, 40);	
		crementLa.setBounds(165, 575, 300, 40);
*/		
		//keyLa.setBounds(100, 625, 300, 40);
		//keyLa.setVisible(false);	//동영상 버튼 눌렀을때 키 안보이게
		
		JPanel p = new JPanel();
		
		p.add(b1);	//목록
		p.setBounds(100, 670, 365, 40);
		
		//윈도우에 추가
		add(imgLa);
		//add(keyLa);
		add(la1); add(titleLa); 
		add(la2); add(contentLa);
		add(p);
		
		
		b1.addActionListener(this);
		
	}
	//"C:\Program Files\Google\Chrome\Application\chrome.exe"
	@Override
	public void actionPerformed(ActionEvent e) {
/*		if(e.getSource() == b1) {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
									+"http://youtube.com/embed/"
									+ keyLa.getText());
				
			}catch (Exception ex) {}
		}
		*/
		 if(e.getSource() == b1) {
			cp.card.show(cp, "home");	//목록버튼 눌렀을때 cp에 home으로
		}
	}
	
	

}
