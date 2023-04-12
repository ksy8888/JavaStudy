/*
 		1. 같은 자바파일에 클래스를 여러개 만들 수 있다
 		   ---------------
 		   public은 한개의 class에서만 사용이 가능
 		
 		2. 권장 사항 => 파일을 따로 만든다
 */

/*
 	 멤버변수 (인스턴스변수)
 	 ------------------
 	 1. 기본형
 	 2. 배열 
 	 3. 클래스 
 */
class Category {
	int no;
	String poster;
	String title;
	String subject;
}

class  FoodHouse {
		
	int no;		//중복이 안된 숫자 => primary key => 상세보기
	int cno;	//참조키 => foreign key
	String[] poster = new String[5];
	
	String storeName;
	double score;
	String address1,address2;
	String food_Kind;
	String price;
	String parking;
	String stime, etime;
	String holiday;
	String menu;
	
	
	
}

public class 사용자정의데이터형3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
