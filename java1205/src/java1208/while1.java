package java1208;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// 시험 점수(0~100)를 입력받아 점수를 출력
		int score;   //시험점수

		Scanner scan = new Scanner(System.in);
		
		// 시험 점수를 읽어들인다.
		System.out.println("시험 점수 (0~100사이의) 정수를 입력하세요 : ");
		score = scan.nextInt();
		
		//사용자가 유효한 시험 점수를 입력할 때까지 계속 점수 입력을 요청한다
		while(score < 0 || score > 100) {
			System.out.println("범위를 벗어난 시험 점수가 입력되었습니다. ");
			System.out.println("시험 점수 (0~100사이의) 정수를 입력하세요 : ");
			score = scan.nextInt();
			
		}
		// 시험 점수를 출력한다.
		
		System.out.println("시험점수 : " + score);
		
		
		
		
		
	}

}
