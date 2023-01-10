package java1214;
/*
 * 1. 1 ~10 더하는 반복문
 * 2. 반복문 1번더 필요하겠다.
 */
public class Test4_3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
			
		} System.out.println(sum);
	}
		
}
