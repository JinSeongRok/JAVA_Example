package java1207;

import java.util.Scanner;

public class TestScore1 {

	public static void main(String[] args) {
		boolean ct;   //부정행위 여부
		int chc;  //출석
		int total;  // 총점
		int hak;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("부정행위 여부를 입력하세요 : ");
		ct = scan.nextBoolean();
		System.out.println("출석일 수 를 입력하세요 : ");
		chc = scan.nextInt();
		System.out.println("총점을 입력하세요 : ");
		total = scan.nextInt();
		
		System.out.println("부정행위 여부: " + ct );
		System.out.println("출석률: " + chc );
		System.out.println("총점: " + total );
		
		if(ct==false || ct != true) {	
		 System.out.println("학점 = F");
			if(chc >= 80) {
				if(total >=90) {
					System.out.println("학점 = A");
				} else if(total >=80) {
					System.out.println("학점 = B");
				} else if(total >=70) {
					System.out.println("학점 = C");
				} else if(total >=60) {
					System.out.println("학점 = D");
				} else 
					System.out.println("학점 = F");
			}
		}
		System.out.println("학점 = F");

	}
	
}
