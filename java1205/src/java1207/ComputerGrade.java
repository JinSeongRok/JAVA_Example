package java1207;

import java.util.Scanner;

public class ComputerGrade {

	public static void main(String[] args) {
		//한 과목의 평가 요소들의 점수를 저장하는 변수들을 선언한다.
		int attendScore;
		int assigmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		
		
		// 총점을 저장하는 변수를선언한다.
		int total;
		
		//학점을 저장하는 변수를 선언한다.
		int hak;
		
		//키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
				//그리고 입력된 점수를 읽는다.
		
		System.out.println("출석 점수를 입력하세요: \t\t");
		attendScore = scan.nextInt();
		
		System.out.println("과제 점수를 입력하세요: \t\t");
		assigmentScore = scan.nextInt();
		
		System.out.println("수시시험 점수를 입력하세요: \t\t");
		quizScore = scan.nextInt();
		
		System.out.println("중간시험 점수를 입력하세요: \t\t");
		midtermexamScore = scan.nextInt();
		
		System.out.println("기말시험 점수를 입력하세요: \t\t");
		finalexamScore = scan.nextInt();
		
		// 총점을 계산한다
			total = (attendScore + assigmentScore + quizScore + midtermexamScore + finalexamScore)/5;
			
		//학점을 결정한다.
			if(total >=90) {
				System.out.println("학점:\t A ");
			} else if(total >= 80) {
				System.out.println("학점:\t B ");
			} else if(total >= 70) {
				System.out.println("학점:\t C ");
			} else if(total >= 60) {
				System.out.println("학점:\t D ");
			} else 
				System.out.println("학점:\t F ");
			
			
			//총점과 학점을 출력한다.
			
			System.out.println("총점:\t " + total);
			
							
			

	}

}	
