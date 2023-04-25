package com.sist.lib;

class Sawon2  {
	private int sabun;
	private String name;
	
	//초기화. 값 변경 못함. >> getter/setter로 변경가능
	public Sawon2(int sabun , String name) {
		this.sabun = sabun;
		this.name = name;
	}
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//s2랑 object로 받은 obj랑 비교 못함. >> 형변환 필요 (사원끼리 비교)
		
/*		Sawon2 s =(Sawon2)obj;		
		return name.equals(s.name) && sabun==s.sabun;
		//	   ----s1
*/		
		if(obj instanceof Student2)
		{
			Student2 s = (Student2)obj;
			return name== s.name;
		}
		else 
			return false;
		}


		public void print() {
			System.out.println("이름: "+ name);
		}
	
	
	
}
public class 라이브러리_Object6_equals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Sawon s1 = new Sawon(1, "홍길동");
		System.out.println(s1);
		s1 = new Sawon(1,"박문수"); //값 변경 안됨. new할때마다 메모리 공간이 새로 생성되기 때문
		
		System.out.println(s1);
*/		
		Sawon2 s1 = new Sawon2(1, "홍길동");
		Sawon2 s2 = new Sawon2(1, "홍길동");
		
		//오버라이딩을 하지 않는 경우 => 주소값 비교가 됨
		if(s1.equals(s2)) {
			System.out.println("같은 사원");
		} else {
			System.out.println("다른 사원");
		}
		
		//
		s1.print();
		new Student2("박문수").print();
	}

}
