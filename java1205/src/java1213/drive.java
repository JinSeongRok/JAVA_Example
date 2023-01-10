package java1213;

public class drive {

	public static void main(String[] args) {
	
		class1 ep1;
		class1 ep2;
		
		ep1 = new class1( );
		
		ep1.setName("이도령");
		ep1.setPhone(100);
		ep1.setAge(25);
		System.out.println(ep1);
		
		ep2 = new class1( );
		
		ep2.setName("성춘향");
		ep2.setPhone(200);
		ep2.setAge(18);
		System.out.println(ep2);
		
		ep2.setPhone(300);
		System.out.println(ep2);
		
		
	}
}
