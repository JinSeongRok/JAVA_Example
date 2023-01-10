package java1212;

import java.util.Scanner;

public class methodTest1 {

	public static int findMin(int totalPay, int count) {
		/* 문제 
		더치페이
		총 금액 중 일인당 부담해야 할 금액을 계산하는 프로그램을 작성 하시오.
		(메소드 이용 : 메소드 부분에서 더치페이 값을 계산)
				  totalPay : 총금액
				  count : 인원수
				  dutchPay : 더치페이 비용 (반환값)

		"일인당 부담 금액 : " */
			//인원수
		int dutchPay;  //더치페이 비용(반환값)

		
		 dutchPay = totalPay / count;

		// 과정3. 최소값을 반환
			return dutchPay;
	}
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		//메소드의 반환되는 값을 저장할 변수	
		int totalPay;
		int count;
		int dutchPay1;
		
		System.out.print("총 금액을 입력하세요: ");
		totalPay = scan.nextInt();
		System.out.print("인원 수을 입력하세요: ");
		count = scan.nextInt();
		
		dutchPay1 = findMin(totalPay, count);
			System.out.print("일인당 부담 금액: " + dutchPay1);
	}

}
