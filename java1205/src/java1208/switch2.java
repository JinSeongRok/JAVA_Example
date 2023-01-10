package java1208;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		//Yes/yes/No/no
		Scanner scan = new Scanner(System.in);
		
		System.out.println("YES/yes 또는 NO/no를 입력하세요: ");
		
			
		 String yn = scan.nextLine();
		
		switch(yn) {
			case "YES":
			case "yes":
			case "예":
			case "예스":
				System.out.println("Yes를 선택하셨습니다.");
				break;
			case "NO":
			case "no":
			case "노":
			case "아니요":
				System.out.println("No를 선택하셨습니다.");
				break;
			default :
				System.out.println("입력이 잘못 되었습니다.");
				
		}

	}

}
