// << , >> 2진법으로 숫자저장
/*
 *  10 << 2
 *  --    --
 *  1010   0을 뒤에 2개 채운다
 *  1010(0)(0)
 *  	 -  - => 101000 : 40
 *  
 *  7 << 3
 *  111000 : 56
 *  
 *  8 << 2
 *  100000 : 32
 *  
 * *** x << y ==> x + 2^y
 *  
 *  9 << 3 ==> 72
 *  ----------------------------------------------------
 *  
 *  10 >> 2
 *  1010
 *    -- 제거 => 2
 *    
 *   10 >> 3 => 1
 *   
 *   15 >> 3
 *   1111 => 1	
 *   
 *   27 >> 3 => 3
 *   100 >> 3 => 12
 *   
 *   x >> y ==> x / 2^y
 *   
 *   	
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 << 2);
		System.out.println(7 << 3);
		System.out.println(8 << 2);
		System.out.println(15 >> 3);
		System.out.println(10 >> 2);
		System.out.println(27 >> 3);
	}

}
