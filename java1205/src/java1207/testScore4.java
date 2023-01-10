package java1207;

import java.util.Scanner;

public class testScore4 {

	public static void main(String[] args) {
		
		
		int b ;	//청구금액
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구매 금액을 입력하세요: ");
		int a = scan.nextInt();
		
		
		
		
		if(a >= 300000) {
			b = a - 30000;
			System.out.println("3만원 할인");	//3만원 할인
		} else if (a >= 100000) {
			b = a - 5000;
			System.out.println("5천원 할인");	//5천원 할인
		} else {
			b = a - 0;
			System.out.println("할인없음");//할인 없음
		}
		System.out.println("구매금액 : "+ a);
		System.out.println("청구금액 : "+ b);
		
	}

}
