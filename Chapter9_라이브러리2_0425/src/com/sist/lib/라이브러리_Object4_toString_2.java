package com.sist.lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 라이브러리_Object4_toString_2 extends JFrame implements ItemListener {	
	JComboBox box;
	JLabel la;
	
	public 라이브러리_Object4_toString_2() {
		box = new JComboBox();
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		la = new JLabel();
		
		//배치
		add("North", box);
		add("Center", la);
		
		setSize(300,300);
		setVisible(true);
		
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		new 라이브러리_Object4_toString_2();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {		//콤보박스 선택 바꼈을때
		// TODO Auto-generated method stub
		if(e.getSource() == box) {
			String name = String.valueOf(box.getSelectedItem());	//가장 많이 나옴
			//String name = box.getSelectedItem().toString();	//리턴형이 Object이기 때문에 문자열로 변경해줘야함 .toString()
			//String name = (String) box.getSelectedItem();	//혹은 (String)
			
			la.setText(name);
			
		}
	}
}
