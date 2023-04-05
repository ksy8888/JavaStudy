import java.lang.reflect.Array;
import java.util.Arrays;

// 0이면 대문자 1이면 소문자

public class 배열_5_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[20];
		
		for(int i=0; i<arr.length; i++) 	//대소문자 섞어서 출력
		{
			int n = (int)(Math.random()*2); //0, 1
			if(n==0) arr[i] =(char)(Math.random()*26+65); 	//// 대문자   랜덤숫자를 문자형으로 바꿔주기위해 (char)
			else arr[i] =(char)(Math.random()*26+97); 		///소문자
					
		}
		System.out.println(Arrays.toString(arr));
		
		int count1=0, count2=0;
		for(char c : arr)
		{
			if(c>='A' && c<='Z')
				count1++;
			else
				count2++;
		}
		System.out.println("대문자 갯수: " + count1);
		System.out.println("소문자 갯수: " + count2);
		
	}

}
