package java1212;

import java.util.Scanner;

public class methodTest2 {
	
		/*재귀 메소드
			1~100까지의 합을 구하는 메소드 프로그램 작성. */
		
				
			
		public static void main(String[] args) {
				findSum(100);
		}
			
			public static void findSum(int n) {
				
				
				if(n == 0) {
					return;
				} else {
					System.out.println("");
					findSum(n - 1);
					
			
		}		
	}
					
}


