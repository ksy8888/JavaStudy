package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class ControlPanel extends JPanel {
	
//	NewsPanel np = new NewsPanel();
//	ChatPanel cp = new ChatPanel();
//	FindPanel fp = new FindPanel();
//	RecommandPanel rp = new RecommandPanel();
//	HomePanel hp = new HomePanel();
//
	
	LocationPanel lp = new LocationPanel();
	FindPanel fp = new FindPanel();
	ChatPanel cp = new ChatPanel();
	NewsPanel np = new NewsPanel();
	BoardListPanel bp;	
	BoardDetailPanel bdp;
	HomePanel hp;
	DetailPanel dp;
	BoardInsertPanel ip;
	
	CardLayout card = new CardLayout();
	BoardUpdatePanel bup;
	BoardDeletePanel bdelp;
	
	
	public ControlPanel() {
		hp = new HomePanel(this);
		dp = new DetailPanel(this);
		ip = new BoardInsertPanel(this);
		bp = new BoardListPanel(this);		
		bdp = new BoardDetailPanel(this);
		bup=new BoardUpdatePanel(this);
    	bdelp=new BoardDeletePanel(this);
		setLayout(card);
		add("home", hp);
		add("location", lp);
		
		add("board", bp);
		add("find", fp);
		add("chat", cp);
		add("news", np);
		add("detail", dp);
		add("insert", ip);
		add("bdp", bdp);
		add("bup",bup);
    	add("delete",bdelp);
		
//		add("recomm", rp);
		
		
	}
}
