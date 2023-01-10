package java1207;

import java.util.Scanner;

public class testScore9 {

	public static void main(String[] args) {
		// a 연봉 입력
		// b 근무 평가등급  우수, 보통, 불량
		int raise=0;  //연봉 인상액
		
		Scanner scan = new Scanner(System.in);

		System.out.print("현 연봉을 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("근무 평가등급을 입력하세요: ");
		int b = scan.nextInt();
		
		// 연봉 인상액 =연봉 * (퍼센트 *100) 
		// 평가 등급 받으면 연봉이 X% 인상.
		
		
		
		if(b == 1) {
				
			System.out.println("연봉 인상액: " + (a*0.06));
			raise = (int)(a*0.06);
		} else if (b == 2) {
			
			System.out.println("연봉 인상액: " + (a*0.04));
			raise = (int)(a*0.04);
		} else if(b==3) {
			
			System.out.println("연봉 인상액: " + (a*0.02));
			raise = (int)(a*0.02);
		} else {
			System.out.println("잘 못 입력하였습니다. ");
		}
		
		System.out.println("새 연봉: " + (raise+a));
		
	}

}
