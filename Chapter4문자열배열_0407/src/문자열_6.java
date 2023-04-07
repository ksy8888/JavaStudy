
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu =  	"슈퍼 슈프림 (L)"
				+ " 21,000원"
				+ "페페로니 (L)"
				+ " 18,000원"
				+ "옥수수&치즈 (L)"
				+ " 20,000원"
				+ "스파이시 치킨 (L)"
				+ " 20,000원"
				+ "감자튀김"
				+ " 5,000원";
		
		System.out.println(menu); //슈퍼 슈프림 (L) 21,000원페페로니 (L) 18,000원옥수수&치즈 (L) 20,000원스파이시 치킨 (L) 20,000원감자튀김 5,000원
		
		String[] menus =menu.split("원");  //"원" 자를 중심으로 잘라내서 배열로 만들어줌
		for(String m:menus)
		{
			System.out.println(m+"원");
		}
	}

}
