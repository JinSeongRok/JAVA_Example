package java1214;

public class Test4_1 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1; i<=20; i++) {
			if(i % 2 != 0 && i % 3 !=0) {
				System.out.println(i);
				sum += i;	
			}
		} 
					
		
		System.out.println(sum);
		
	}
	
}
