package java1207;

import java.util.Scanner;

public class TestScore3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int i = scan.nextInt();
		
			if(i%3 == 0) 
				System.out.println("3의 배수이다.");
			 if(i%5 ==0) 
				System.out.println("5의 배수이다.");
			 if(i%8 ==0)
				System.out.println("8의 배수이다.");
			 if(i%3 !=0 && i%5 !=0 && i%8 !=0)
				System.out.println("어느 배수도 아니다.");

	}

}
