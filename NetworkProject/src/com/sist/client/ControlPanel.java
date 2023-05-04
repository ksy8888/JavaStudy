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
	HomePanel hp = new HomePanel();
	LocationPanel lp = new LocationPanel();
	EnterPanel ep = new EnterPanel();
	AcommPanel ap = new AcommPanel(); //숙박
	FindPanel fp = new FindPanel();
	ChatPanel cp = new ChatPanel();
	NewsPanel np = new NewsPanel();
	
	CardLayout card = new CardLayout();
	
	public ControlPanel() {
		setLayout(card);
		add("home", hp);
		add("location", lp);
		add("enter", ep);
		add("acomm", ap);		
		add("find", fp);
		add("chat", cp);
		add("news", np);
		
	}
}
