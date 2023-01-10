package java1212;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		//System.out.print("두 수 또는 세개의 수를 입력하세요 : ");
		//num1 = scan.nextInt();
		
		System.out.println(nPlu(30, 20));
		System.out.println(nMin(30, 20));
		System.out.println(ntim(30, 20));
		System.out.println(nDiv(30, 20));
		
		
	}
	public static int nPlu(int a, int b) {
		int sum;
		sum = a + b;
		System.out.print("합 : ");
		return sum;
	}
	public static int nMin(int a, int b) {
		int sum;
		sum = a - b;
		System.out.print("차 : ");
		return sum;
	}
	public static double ntim(double a, double b) {
		double sum;
		sum = a * b;
		System.out.print("곱 : ");
		return sum;
	}	
	public static double nDiv(double a, double b) {
		double sum;
		sum = a / b;
		System.out.print("나누기 : ");
		return sum;
	}
	
	

}
