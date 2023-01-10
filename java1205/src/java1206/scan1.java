package java1206;

import java.util.Scanner;			// Scanner 라는 입력 클래스 호출

public class scan1 {

	public static void main(String[] args) {
	
		
		double eng;
		double pro;
		double math;
		double comp;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영작문 점수를 입력하세요 : ");
		eng = scan.nextDouble();
		System.out.print("프로그래밍 점수를 입력하세요 : ");
		pro = scan.nextDouble();
		System.out.print("이산수학 점수를 입력하세요 : ");
		math = scan.nextDouble();
		System.out.print("컴퓨터구조 점수를 입력하세요 : ");
		comp = scan.nextDouble();
		avg = (eng + pro + math + comp)/ 4;
		System.out.print("평균점수는: " + avg + "점 이다." );
		
	}

}
