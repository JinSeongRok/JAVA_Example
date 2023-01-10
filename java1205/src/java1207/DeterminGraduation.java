package java1207;

import java.util.Scanner;

public class DeterminGraduation {

		public static void main(String[] args) {
			
			int Total; // 총 이수학점
			
			// 토익 점수를 지정하는 변수를 선언한다.
			int Toeic;
			
			// Scanner 객체를 생성하고 scan이 가리키게 한다
			Scanner scan = new Scanner(System.in);
			
			// 총 이수학점을 입력받는다.
			System.out.println("총 이수학점을 입력하세요 : ");
			Total = scan.nextInt();
			//토익 점수를 입력받는다
			System.out.println("토익 점수를 입력하세요 : ");
			Toeic = scan.nextInt();
			
			// 총 이수학점과 토익 점수에 따라 졸업/수료/졸업불가 여부를 출력
				if(Total >= 140) {
					if(Toeic >= 700) {
						System.out.println("졸업을 축하합니다.");
					} else {
						System.out.println("아쉽지만 수료하셨습니다.");
					}
				} else { 
					System.out.println("졸업이 불가합니다.");			
				}
		}
	}
