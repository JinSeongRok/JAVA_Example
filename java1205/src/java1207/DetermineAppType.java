package java1207;

import java.util.Scanner;

public class DetermineAppType {

	public static void main(String[] args) {
		
		double grade;   //평점
		
		// 토익 점수를 지정하는 변수를 선언한다.
		double Toeic;
		
		// Scanner 객체를 생성하고 scan이 가리키게 한다.
		Scanner scan = new Scanner(System.in);
		
		//평점을 입력받는다
		System.out.println("평점을 입력하세요 : ");
		grade = scan.nextDouble();
		
		// 토익점수를 입력받는다.
		System.out.println("TOEIC 점수를 입력하세요 : ");
		Toeic = scan.nextDouble();
		
		// 평점과 토익 점수에 따라 적절한 메세지를 출력한다.
		if(grade >= 4.0 ) {
			if(Toeic >= 700)
				System.out.println("면접 대상자입니다.");
		} else if(grade >= 3.5) {
			System.out.println("서류 전형 대상자입니다.");
		} else if(grade >= 3.0) {
			System.out.println("필기시험 대상자 입니다.");
		} else 
			System.out.println("지원할 수 없습니다.");
		
	}

}
