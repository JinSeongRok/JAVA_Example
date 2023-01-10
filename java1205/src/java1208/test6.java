package java1208;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {

		int buyAmount;   //구매금액
		int leftover;		//거스름돈
		int numcoin;		//동전수
		int coinvalue;		//동전가치
		int coin_1;
		int coin_10;
		int coin_100;
		
		
		
		
		//100원짜리 3개, 10원짜리 7개, 1원짜리 8개
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매 금액을 입력하세요[0-500]: ");
		buyAmount = scan.nextInt();
		
		leftover = 500 - buyAmount;
		
		coin_100 = leftover/ 100;
		coin_10 =  (leftover/100) % 10 ;
		coin_1 = leftover%100%10;
		
		
		// leftover / 100 => 315/100 => (int)3.15 => 3
		// 315%100 => 15 => 15/10 => (int)1.5 => 1
		// 315%100%10 => 5
		
		
		System.out.println("100원짜리 동전" + coin_100 + "개");
		System.out.println("10원짜리 동전" + coin_10 + "개");
		System.out.println("1원짜리 동전" + coin_1 + "개");
		
		

	}

}
