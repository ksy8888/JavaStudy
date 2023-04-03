//조건문 (if)
public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1=(char)((Math.random()*26)+65); //대문자
		char c2=(char)((Math.random()*26)+65); //대문자
//		char c2=(char)((Math.random()*26)+97);	//소문자
		//char는 정수로 변경하고 연산해야함
		
		System.out.println("c1= " + c1 );
		System.out.println("c2= " + c2 );
		
		boolean b1= c1==c2;
		System.out.println("b1= " + b1);
		
		b1= c1!=c2;
		System.out.println("b1= " + b1);
		
		b1= c1<c2;
		System.out.println("b1= " + b1);
		
		b1= c1>c2;
		System.out.println("b1= " + b1);
		
		b1= c1<=c2;
		System.out.println("b1= " + b1);
		
		b1= c1>=c2;
		System.out.println("b1= " + b1);
		
		
	}

}
