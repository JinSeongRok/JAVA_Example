package java1207;

import java.util.Scanner;

public class TestScore6 {

	public static void main(String[] args) {

		//  제품수량 
		// 총 가격
		//10개 이상 사는 고객에게 10% 할인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제품의 수량을 입력하세요: ");
		int i = scan.nextInt();

		int p = 100000;
		int p2 = 1;
		
		p2 = p * i;
		if(i >= 10) {
			p2=p2-(p2/10);
		}
		
		System.out.println("총 가격은" + p2 + "원 입니다.");
	}

}
