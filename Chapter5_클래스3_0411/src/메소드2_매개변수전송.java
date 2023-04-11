// 매개변수 전송법
/*
 		= Call By Value : 일반 기본형 데이터 전송 (String) //복사. 메모리주소가 다르기 때문에 원본은 바뀌지않음. 
 		= Call By Reference : 주소값을 넘겨주는 방식 (배열, 클래스)
 		
 */
public class 메소드2_매개변수전송 {
	
	
	static void swap(int x, int y)
	{
		System.out.println("교환전: x=" + x+",y= "+ y);
		int temp= x;
		x=y;
		y= temp;
		System.out.println("교환후: x=" + x+",y= "+ y);
	
	}
	
	static void swap2(int[] arr2)
	{
		System.out.println("arr2= " + arr2);
		System.out.println("교환전:arr2[0]="+arr2[0]+",arr2[1]="+ arr2[1]);
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		System.out.println("교환후:arr2[0]="+arr2[0]+",arr2[1]="+ arr2[1]);
	}
	
	static void swap3(String id, String pwd)
	{
		System.out.println("교환전:id="+id+",pwd="+pwd);
		String temp=id;
		id=pwd;
		pwd=temp;
		System.out.println("교환후:id="+id+",pwd="+pwd);
	}
	
	public static void main(String[] args) {
		
		//값만 전송 => Call By Value => 기본형
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("종료: a=" + a +",b= "+ b);
	
		//Call By Reference
		// 배열, 클래스 => 메소드 자체에서 변경이 가능
		int[] arr = {10,20};
		System.out.println("arr= "+arr);
		swap2(arr); //int[] arr2=arr
		System.out.println("종료:arr[0]="+arr[0]+",arr[1]="+ arr[1]);
		
		//String은 안바뀜
		String id = "admin";
		String pwd = "1234";
		swap3(id,pwd);
		System.out.println("종료:id="+id+",pwd="+pwd);
	}

}
