package com.sist.manager;



import java.io.Serializable;



public class TravelVO implements Serializable{

	private int no;

	private int cno;

	private String title;

	private String contents;

	private String poster;

	public int getNo() {

		return no;

	}

	public void setNo(int no) {

		this.no = no;

	}

	public int getCno() {

		return cno;

	}

	public void setCno(int cno) {

		this.cno = cno;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getContents() {

		return contents;

	}

	public void setContents(String contents) {

		this.contents = contents;

	}

	public String getPoster() {

		return poster;

	}

	public void setPoster(String poster) {

		this.poster = poster;

	}

	

	

}

