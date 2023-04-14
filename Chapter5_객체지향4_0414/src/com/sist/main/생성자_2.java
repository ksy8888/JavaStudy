package com.sist.main;

/*
 * 클래스는 선언,값만 넣어줄수있음. try-catch 같은 구현못함.>> 생성자를 쓰면 생성자 블록안에 구현가능
 * 
 		초기화
 		1. 디폴트 값	
 			int => 0, String => null, boolean => false...
 			class A
 			{
 				int a;
 			}
 		2. 명시적 초기화 : 직접 값을 설정
 			class A
 			{
 				int a = 10;
 			}
 		3. 생성자 초기화
 			class A
 			{
 				int a;
 				A() {
 					a=100;
 				}
 			}
 			
 		4. 초기화 블록 
 			class A
 			{
 				int a;
 				//a=1000; 사용못함
 				 {
 				 	a=1000; 	//사용 가능
 				 }
 			}
 			
 			디폴트 => 명시적 => 초기블록 => 생성자
 			int a=0 int a= 10 
 */

//class Student {
//	int hakbun=10;
//	String name;
//	{
//		hakbun=100; //연산처리 , 제어문 , 파일 읽기 ...
//	}
//	
//	Student() {
//		hakbun=1000;
//	}
//}

class Student {
	int hakbun;
	String name;
	
	Student() {		//초기값을 같은 값을 갖고 갈 때는 default 생성자 사용
		System.out.println("Studnet() Call...");
		hakbun=1;
		name="홍길동";
	}
	Student(int h, String n) {		//다르게 가져갈 때
		hakbun = h;
		name =n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student  s = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		//생성자 호출 new를 앞에 붙여서 호출하다
		//new Student();
		
		Student s2 = new Student(2,"심청이");
		System.out.println(s2.name);
		
		Student s3 = new Student(3,"강감찬");
		System.out.println(s3.name);
		
	}

}
