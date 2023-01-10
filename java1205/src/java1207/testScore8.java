package java1207;

import java.util.Scanner;

public class testScore8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요: ");
		int a = scan.nextInt();
		
		if(a >= 25) {
			System.out.print("수영하기 좋은 날씨입니다.");
		} else if(a >= 15) {
			System.out.print("테니스하기 좋은 날씨입니다.");
		} else if(a >= 5) {
			System.out.print("골프하기 좋은 날씨입니다.");
		}	else
			System.out.print("스키타기 좋은 날씨입니다.");

	}

}
