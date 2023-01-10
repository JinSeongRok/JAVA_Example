package java1212;

import java.util.Scanner;

public class methodTest3 {

	public static void main(String[] args) {
		int num; //양의 정수
		Scanner scan = new Scanner(System.in);
		

		// 양의 정수를 입력 받는다.
		System.out.print("양의 정수를 입력하세요: ");
		num = scan.nextInt();
		
		
		
		//getNumberOfZerosIter 메소드를 호출하여 양의 정수 내에 있는 숫자 0의 개수를 구한다.
		System.out.println("반복 결과: " + getNumberOfZerosIter(num) + "개");
		
		//getNumberOfZerosRecur 메소드를 호출하여 양의 정수 내에 있는 숫자 0의 개수를 구한다.
		System.out.println("재귀 결과: " + getNumberOfZerosRecur(num) + "개");
		
	}
	/* 
	 * (N > 0) 내에 잇는 숫자 0의 개수를 반환한다.
	 * 매개변수 : N - 넘겨 받은 양의 정수
	 * 반환 값 : (N>0) 내에 있는 숫자 0의 개수
	 * 지역 변수 : count - 숫자 0의 개수
	 * */
	
	
	public static int getNumberOfZerosIter(int N) {
		int count = 0; // 숫자 0의 개수
		
		//N이 두자리 이상의 숫자인 동안 다음을 반복한다.
		while(N >= 10) {
			// 마지막 숫자가 0이면 0의 개수를 1만큼 증가시킨다.
			if(N % 10 == 0) count++;
			
			//마지막 숫자를 제거한 나머지 정수를 구한다.
			N = N /10;
			
		}
		return count;
	}
	
	/* 
	 * (N > 0) 내에 잇는 숫자 0의 개수를 반환한다.
	 * 매개변수 : N - 넘겨 받은 양의 정수
	 * 반환 값 : (N>0) 내에 있는 숫자 0의 개수
	 * 지역 변수 : count - 숫자 0의 개수
	 * */
	public static int getNumberOfZerosRecur(int N) {
		if(N < 10)
			return 0; 		//마지막 숫자가 0이 아니다
		else if (N % 10 == 0)
			// 마지막 숫자가 0이면 마지막 숫자를 제거한 나머지 정수내의 숫자 0의 개수에 1을 더한다. count++와 같은 효과
			return getNumberOfZerosRecur(N / 10)+ 1;
		else
			// 마지막 숫자가 0이 아니면 마지막 숫자를 제거한 나머지 정수내의 숫자 0의 개수를 구한다.
			return getNumberOfZerosRecur(N / 10);
			// 코드
		
	}
}
