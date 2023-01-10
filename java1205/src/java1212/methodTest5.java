package java1212;

import java.util.Scanner ;

public class methodTest5 {

	public static void main(String[] args) {
		// 사칙 연산 메소드 : 두 수를 입력 받아 사칙 연산 결과 출력
		
		Scanner scan = new Scanner(System.in);
		
	/*	int num1;
		int num2;
		
		System.out.println("두 개의 정수를 입력해주세요(10 20) : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
*/
		
		System.out.println(nPlu(3, 2));		//합
		System.out.println(nPlu(3, 6, 7));
		System.out.println(nPlu(3.0, 6.0, 7.1));
		//nMin(num1, num2);		//차
		//ntim(num1, num2);		//곱
		//nDiv(num1, num2);		//나누기
		
		
	}
	public static int nPlu(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}
	public static int nPlu(int a, int b, int c) {
		int sum;
		sum = a + b + c;
		return sum;
	}
	public static double nPlu(double a, double b, double c) {
		double sum;
		sum = a + b + c;
		return sum;
	}
	
	
/*	public static void nMin(int a, int b) {
		int sum;
		sum = a - b;
		System.out.println("두 수의 차은 : " + sum);
	}
	public static void ntim(int a, int b) {
		int sum;
		sum = a * b;
		System.out.println("두 수의 곱은 : " + sum);
	}
	public static void nDiv(int a, int b) {
		double sum;
		sum = a / b;
		System.out.println("두 수의 나누기는 : " + sum);
	}*/
}
