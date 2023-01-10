package java1207;

import java.util.Scanner;

public class TestScore2 {

	public static void main(String[] args) {
		
		double score;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("평점을 입력하세요: ");
		score = scan.nextDouble();
		
		if(score >= 4.3) {
			System.out.println("전액 장학금입니다.");
		} else if(score >= 4.0) {
			System.out.println("반액 장학금입니다.");
		} else if(score >= 3.7) {
			System.out.println("모범 장학금입니다.");
		} else
			System.out.println("장학금을 받을수 없습니다.");
		 
	}
	
}
