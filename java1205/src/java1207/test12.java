package java1207;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		
		int year = 0; // 입력받은 연도
		//int leap;  윤년 여부를 저장 하는 변수
		
	
		Scanner scan = new Scanner(System.in);
		
		
		 System.out.print("연도를 입력하세요: ");
		 year = scan.nextInt();
		
		if(year % 400 == 0 ) {
			System.out.println(year + " 연도는 윤년입니다");
		} else if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " 연도는 윤년입니다");
		} else
			System.out.println(year + " 연도는 윤년이 아닙니다");
	
	}

}
