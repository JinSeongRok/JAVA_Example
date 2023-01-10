package java1209;

import java.util.Scanner;

public class array_test7 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int i;
		int flag=0;
		int[] scores=null;
		int sum=0;
		int max=0;
		
		//do while문
		
		//System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		
		while(flag!=5) {
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.print("선택> ");
			flag = scan.nextInt();
		
		
		switch(flag) {
		case 1 :
			System.out.print("학생수> ");
			scores = new int[scan.nextInt()];
			break;
		case 2 :
			System.out.println("점수입력");
			for(i=0; i < scores.length; i++) { // 0부터 scores.length 앞까지
				scores[i] = scan.nextInt(); //scores[i] = scan
			}
			break;
		case 3 : 
			System.out.println("점수리스트");
			for(i=0; i < scores.length; i++) {
				System.out.println(scores[i]);
			}
			break;
		case 4 : 
			System.out.println("분석");
			for(i=0; i < scores.length; i++) {
				sum += scores[i];
				if(scores[i]> max) {
					max = scores[i];
				}
			}
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + sum/(float)scores.length);
				
				break;
		
		default : 
			System.out.println("프로그램 종료");

		}
	}
	}
}
	


