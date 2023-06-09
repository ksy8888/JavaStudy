package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class ControlPanel extends JPanel {
	
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;	
	BoardDetailPanel bdp;
	
	CardLayout card = new CardLayout();
	BoardInsertPanel ip;
	
	public ControlPanel() {
		
		//@RequestMapping("main/main.do")
		
		hp = new HomePanel(this);
		dp = new DetailPanel(this);
		bp = new BoardListPanel(this);
		ip = new BoardInsertPanel(this);
		bdp = new BoardDetailPanel(this);
		
		setLayout(card);
		add("home", hp);
		add("news", np);
		add("chat", cp);
		add("find", fp);
		add("detail", dp);
		add("board", bp);	
		add("insert", ip);
		add("bdp", bdp);
		
	}
}
