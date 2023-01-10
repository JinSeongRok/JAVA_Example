package java1208;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 60점이상인 학생  60점 미만인 학생
		int grade;  //한 학생의 점수
		int numS = 0;	//학생들의 수
		int numP = 0;	//통과 학생 수
		int numF = 0;	//낙제 학생 수
		
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		
		//첫번쨰 점수를 읽어 들인다.
		System.out.print("첫번째 점수(종료하려면 음수)를 입력하세요: ");
		grade = scan.nextInt();
		
		// 점수가 음수가 아닌 동안 다음을 반복한다.
		while (grade >= 0) {
			// 학생들의 수를 1만큼 증가 시킨다.
			numS++;
			
			
			//점수가 60이상이면 통과 학생들의 수를 1만큼 증가
			// 아니면 낙제 학생들의 수를 1만큼 증가.
			if(grade >= 60) numP++;
			else numF++;
			
			
			//다음 점수를 읽어 들인다.
			System.out.print("다음 점수(종료하려면 음수)를 입력하세요: ");
			grade = scan.nextInt();
						
			
		}
		System.out.println("학생들의 수 : " + numS);
		System.out.println("통과 학생 수 : " + numP);
		System.out.println("낙제 학생 수 : " + numF);
	}

}
