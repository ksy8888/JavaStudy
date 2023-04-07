import java.util.Scanner;

//length() => 문자갯수 =>
//trim() ==> 좌우 공백 제거
//javascript => java 동일 => Jquery / vuejs/ reactjs

public class 문자열_4_문자갯수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan =new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s = scan.next();
		System.out.println("입력된 값: "+ s);
		System.out.println("문자 갯수: "+ s.length());		// 입력변수.length();   */
		
		String s = " Hello Java!! ";
		System.out.println(s.length());
		System.out.println(s.trim().length()); 	//trim()은 좌우공백만 제거
		
	}

}
