package com.sist.inter;

import java.util.List;

import com.sist.manager.TravelVO;

/*
  
  1) 환경설정
  2) 인터페이스 구현 => 조원별로 (인터페이스 설계)
  3) 애플리케이션 테스트 (단위 테스트 => JUnit)
  4) 네트워크 구현
  -------------------------------------
  인터페이스 => 기능 설계
  => 미완성 클래스 (메모리 할당을 할 수 없다)
  => 변수 => 상수형 변수
  => 메소드 => 추상 메소드
  => 다중 상속
  => JDK 1.8
  	=> 구현 메소드가 가능하다
  		default , static
  	=> 인터페이스는 추상 클래스 (단일 상속/ 다중 상속 구분)
  	=> 상속: extends , 구현 : implements
  => 목적 (기술면접)
  	표준화가 가능하다 (메소드 구현은 다를 수 있다, 메소드명이 동일)
  	--- 분석 
  	관련된 클래스 여러개를 모아서 관리할 목적
  	독립적으로 사용 가능
  	
  => 형식
  	public interface Interface명
  	{
  		(public static final) int a=10;
  							  --------값을 설정
  		(public static abstract) void display();
  		구현
  		(public) default void aaa()
  		{
  		}
  	}
  	
  	==> 사용하기 위해서는 상속을 내리고 하위 클래스를 통해서 메모리 할당 후 사용
  	interface A
  	class B implements A
  	=> A a = new B();
  	=> Collection
  	   List list = new ArrauList()
  	   Map map = new Hashmap()
  	 
 
 */
public interface HomeInterface {
	public void cardPrint(List<TravelVO> list);
	public void cardInit(List<TravelVO> list);
}