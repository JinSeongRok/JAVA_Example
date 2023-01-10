package java1212;

import java.util.Scanner;

public class methodTest6 {

	public static void main(String[] args) {
		int num; 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("양의 정수를 입력하세요: ");
		num = scan.nextInt();
		
		System.out.println("반복 결과: " + getNumberOfZerosIter(num) + "개");
		
		System.out.println("재귀 결과: " + getNumberOfZerosRecur(num) + "개");
	}
	
	
	public static int getNumberOfZerosIter(int N) {
		int count = 0; 
		while(N > 0)  {
			if(N % 2 == 0)  {
				count++;
			}
			N = N/10;
		}
		return count;
	}
	
	public static int getNumberOfZerosRecur(int N) {
		/*if(N <= 10) {
			return 0;
		} else if(N % 2 == 1) { 
			return getNumberOfZerosRecur(N/10)+1;
		} else 
			return getNumberOfZerosRecur(N/10);*/
		if(N>0) {
			if(N%2==0) return 1+getNumberOfZerosRecur(N/10);
			else return getNumberOfZerosRecur(N/10);
		} else return 0;

			
	}
}	
	
	
