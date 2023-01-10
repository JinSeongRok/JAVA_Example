package java1207;

import java.util.Scanner;

public class testScore7 {

	public static void main(String[] args) {

		// 19세 이상이면 "영화를 볼 수 있습니다."
		// 19세 미만이고 15세 이상이면 "성인이 동반한 경우에만 영화를 볼 수 있습니다."
		// 15세 미만이면 " 영화를 볼 수 없습니다."
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");
		int a = scan.nextInt();
		
		if(a >= 19) {
			System.out.println("영화를 볼 수 있습니다.");
		} else if(a >= 15) {
			System.out.println("성인이 동반한 경우에만 영화를 볼 수 있습니다.");
		} else 
			System.out.println("영화를 볼 수 없습니다.");

	}

}
