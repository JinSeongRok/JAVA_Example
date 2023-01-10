package java1207;

import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		
		int score;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		String tmp = scan.nextLine();
		score =Integer.parseInt(tmp);
		
		if(score >= 90) {
			System.out.println("합격입니다..");
			System.out.println("A+ 입니다.");
		}
		else if(score >= 80) {
			System.out.println("합격 입니다.");
			System.out.println("B+ 입니다.");
		}
		else if(score >= 70) {
			System.out.println("합격 입니다.");
			System.out.println("C+ 입니다.");
		}
		else{
			System.out.println("불합격 입니다.");
			System.out.println("F 입니다.");
		}
		System.out.println("수고하셨습니다.");

	}

}
