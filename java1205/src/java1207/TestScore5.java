package java1207;

import java.util.Scanner;

public class TestScore5 {

	public static void main(String[] args) {
		// int a;  연간 근로소득
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연간 근로소득을 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a <= 2000) {
			System.out.println("소득세는 5% 입니다.");
		}	else if(a <= 4000) {
			System.out.println("소득세는 15% 입니다.");
		}	else if(a <= 8000) {
			System.out.println("소득세는 25% 입니다.");
		}	else
			System.out.println("소득세는 40% 입니다.");
	
	}

}
