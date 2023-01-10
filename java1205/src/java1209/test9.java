package java1209;

import java.util.*;

public class test9 {

	public static void main(String[] args) {
		
		int [] num=null; 
		Scanner scan = new Scanner(System.in);
		
		
		int a = 0;    // 입력 받을 숫자.
		int i = 0;
		int temp;
		
	
		
		System.out.print("입력할 점수들의 수를 입력하세요: ");
		num = new int[scan.nextInt()];
	
		for(i=1; i< num.length; i++ ) {
			System.out.print(i+"번째 점수들의 수를 입력하세요: ");
			num[i] = scan.nextInt();
		}
		
		for(i = 0;  i < num.length; i++) {				//입력된값.
			num[i] = scan.nextInt();
		}
		System.out.print(num[i]+" ");
		
		
		for()
		
		
	}



}
