package java1208;

import java.util.Scanner;

public class exam_1 {

	public static void main(String[] args) {
		//90이상 A. 80 이상 B. 70이상 C 60이상 D, 60미만 F
		//점수를 입력하세요 (종료하려면 -1을 입력): 
		
		int score;			// 입력받는 점수
		int totalCount = 0; //몇번 입력
		int Acount = 0;		// A학점 수
		int Bcount = 0;		// B학점 수
		int Ccount = 0;		// C학점 수
		int Dcount = 0;		// D학점 수
		int Fcount = 0;		// F학점 수
		
		//Scanner 객체를 가리키는 참조 변수
		Scanner scan = new Scanner(System.in);
		
		//첫번쨰 점수를 입력받는다.
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
		score = scan.nextInt();
		
		// 점수가 양수인 동안 다음 반복문을 계속한다.
		while (score >= 0) {
			// 입력한 점수들을 누적
			totalCount++;
			
			//점수에 해당하는 학점 수를 1만큼 증가.
			if(score >= 90) Acount++;
			else if(score >=80) Bcount++;
			else if(score >=70) Ccount++;
			else if(score >=60) Dcount++;
			else Fcount++;
			
			//다음 점수를 다시 입력 받는다.
			System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
			score = scan.nextInt();
			
			
		}
			//점수들을 총 수, A,B,C,D,F학점수
		System.out.println("점수들의 총수 = " + totalCount);
		System.out.println("A 학점 수 = " + Acount);
		System.out.println("B 학점 수 = " + Bcount);
		System.out.println("C 학점 수 = " + Ccount);
		System.out.println("D 학점 수 = " + Dcount);
		System.out.println("F 학점 수 = " + Fcount);
		
	}

}
