package com.sist.exam;

import java.util.Scanner;

public class MemberSystem {
	
	static Member[] members = new Member[10];	//null값. 연결시켜줘야함
	static int index = 0;	//static 안써주면 hong도 0번이고 shim도 0번임		//공유하는 대상 나올 때, static 
	
	//가입
	public void join() {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디,이름,성별 입력(hong 홍길동 남자): ");
		members[index] = new Member();	/////////////////////메모리 만들고 주소값을 넣어줘야함
		members[index].setId(scan.next());		
		members[index].setName(scan.next());
		members[index].setSex(scan.next());
		index++;
	}
	
	public void print() {
		for(Member m :members) {
			if(m!=null) { 		//입력한 갯수만큼 출력할 때. null이 아닐때까지 출력해라
				System.out.println(m.getId()+" "
									+ m.getName()
									+ m.getSex());
			}
		}
	}
}
