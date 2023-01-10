package java1208;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {
		// 상품이 가격들의 합이 100,000을 초과할 때까지 사움 가격들을 계속 읽어 들이는 프로그램
		
		int price;   // 상품가격
		int total;	// 합계
		
		Scanner scan = new Scanner(System.in);

		//합게를 0으로 초기화
		
		total = 0 ;
		
		// 구매한 상품 가격들의 합게가 100,000원을 초과할 때까지 반복
		
		do {
			System.out.println("구매한 상품의 가격을 입력하세요: ");
			price = scan.nextInt();
			
			//합계를 구한다.
			total += price;
			if(total > 100000) {
				break;
			}
	
		}	
		while(true) ;
		// 합게를 출력
		System.out.println("총 구매가격: " + total);
		scan.close();
		
	}

}
