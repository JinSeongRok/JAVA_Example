package java1206;

import java.util.Scanner;			// Scanner 라는 입력 클래스 호출

public class scan2 {

	public static void main(String[] args) {
	
		
		int num1;
		int num2;
		int hap;
		int ca;
		int gub;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		
		hap = num1 + num2;
		ca = num1 - num2;
		gub = num1 * num2;
		
		System.out.print("합 = " + hap + "\n");
		System.out.print("차 = " + ca + "\n");
		System.out.print("곱 = " + gub);
		
	}

}
