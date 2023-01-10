package java1212;

import java.util.Scanner;

public class methodTest4 {
	
	public static int calculatePrice(double comein, double comeout) {
	// 주차 시간이 주어지면 주차요금을 계산한다.
	//@입력 매개변수들:
		 // ptime 주차시간
	//@반환 값 : 주차요금
		//메소드를 삽입
	
		int ptime;
		ptime = (int)Math.ceil(comeout - comein);
		int price=0;
		if(ptime==1) return 1000;
		else {
			if((ptime-1)*500+1000>10000) return 10000;
			else return (ptime-1)*500+1000;
		}
		
	}
	public static void main(String[] args) {
		
		// 주차장에 들어온 시간, 나간 시간과  주차요금을 저장하는 변수들을 선언한다.
		double comein;
		double comeout;
		double entrytime;
		
		// 여기에 코드를 삽입하세요

		// 반복문의 계속 수행 여부를 나타내는 변수를 선언한다
		String flag;

		 // 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		Scanner scan = new Scanner(System.in);

		 // 사용자가 계속하기를 원하는 동안 주차장에 들어온 시간과  나간 시간을 입력받아

		
		// 주차요금을 계산한다.
		
		do {
			// 주차장에 들어온 시간과  나간 시간을 입력하라고 요청한다.
			System.out.print("들어온 시간을 입력하세요:\t");
			comein = scan.nextDouble();
			System.out.print("나간 시간을 입력하세요:\t");
			comeout = scan.nextDouble();
			// 여기에 코드를 삽입하세요
	
			// 주차요금을 계산하고 출력한다

			System.out.println(calculatePrice(comein, comeout)+"원");
			// 사용자가 계속하기를 원하는 지를 예(y) 혹은 아니오(n)로 입력하라고
			  // 요청한다. 그리고 입력된 값을 읽는다.
			System.out.print("계속하시려면 y, 아니면 n를 입력하세요 : ");
			scan.nextLine();
			flag = scan.nextLine();
			  // 여기에 코드를 삽입하세요
		
		} while (flag.equals("y"));
	}
		
}