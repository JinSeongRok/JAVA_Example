package java1208;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		final String upw = "codehows";
		
		boolean access = false;
		String pw ="";
		
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <=3; i++) {
		System.out.print("암호를 입력하세요: ");
		pw = scan.next();
		
		
		if(pw.equals(upw)) {
			System.out.println("환영합니다.");
			access = true;
			break;
		} else {
			System.out.println("암호가 틀립니다.");
	}
}
		System.out.println("접속을 거부합니다.");
			scan.close();
			if(access) {
			
		}
	}		
}
