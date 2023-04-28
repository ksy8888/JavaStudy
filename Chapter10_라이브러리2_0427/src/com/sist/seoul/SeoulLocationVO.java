package com.sist.seoul;

//VO => DAO => 전송 => 관련된 데이터는 무조건 묶어서 보낸다 (VO)
//VO => JSP => Bean (핵심기능)
//서울 명소 => 데이터형 (읽기/쓰기)
public class SeoulLocationVO {
	private int no;
	private String name;
	private String content;
	private String address;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	

}
