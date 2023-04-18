package com.sist.main2;

//사용자 정의 데이터형 => ~VO
//사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다

class sutdaCard {
	private int num;
	private boolean isKwang;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}

class Sutdent {
	private String name;
	private int ban;
	private int no;
	private int kor,eng,math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
/*
 	인스턴스 변수: 데이터를 각각 저장시에 사용
 	지역변수(매개변수) : 메소드 안에서 사용
 	
 	-------------------------
 	this
 		1) 모든 클래스는 this를 가지고 있다
 		2) 객체 자신을 가리키는 참조변수 
 			=> this는 생성자 , 인스턴스 메소드에서 사용 가능
 		3) 클래스 내에서는 어디든지 사용 가능 (X)
 		4) 지역벼수와 인스턴스변수를 구분할 때 사용한다
 		5) 클래스메소드(static)내에서는 사용할 수 없다
 	--------------------------
 	오버로딩 조건
 	1) 메소드명이 동일 (한개의 이름으로 여러개의 새로운 기능을 추가)
 	2) 매개변수의 갯수나 데이터형이 달라야한다
 	3) 리턴형은 관계없다
 	4) 매개변수의 이름이 달라야한다
 	--------------------------
 	- 지역변수는 자동 초기화가 안된다 (반드시 초기화 후에 사용)
 	- 명시적초기화 => 초기화 블럭 => 생성자 => 클래스 변수 => 인스턴스 변수
 	- 클래스 변수는 컴파일시에, 인스턴스변수는 new 할 때 초기화
 */

/*
 	문3
 	인스턴스변수: kind,num
 	정적변수(공유변수): width,height
 	지역변수: k,n
 	-----------------------------
 	b c e
 	-------
 	c,d
 	-----
 	c,d
 	------
 	1.메소드 2. 매개변수 3. "리턴형"
 	-----------------
 	b,c,d
 	--------------
 	a,c e
 	-----------
 	a
 	---------
 	a d e
 	----------
 	a
 	-----------
 	private / default / protected / public
 	--------------
 	c
 	지역변수는 static, 접근지정어, abstract는 사용이 불가능
 	지역변수 중에 유일하게 사용 : final
 	
 */
public class 문제 {

}
