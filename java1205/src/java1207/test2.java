package java1207;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
		System.out.println("시험 점수를 입력하세요 : ");
		int testScore = scan.nextInt();
		System.out.println("면접 점수를 입력하세요: ");
		int interviewScore =scan.nextInt();

		
		if(testScore >= 80) {
			if(interviewScore >= 60) {
				System.out.println("면접 대상 입니다.");
				System.out.println("합격 입니다.");
			}
			else 
				System.out.println("면접에서 탈락입니다.");	
		}
		else
			System.out.println("불합격 입니다."); 	
	}
		 
}