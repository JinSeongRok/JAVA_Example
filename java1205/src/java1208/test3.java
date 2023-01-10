package java1208;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
	
		int count = 0;
		
		System.out.print("한 줄의 문장을 입력하세요 : ");
		String inputStr = scan.nextLine();
		
		for(int i = 0; i < inputStr.length();i++) {
			
			if(inputStr.charAt(i) == ' ' && inputStr.charAt(i)== '\n'&& inputStr.charAt(i) == '\t') {
				count++;
			}
	
		}
		
		System.out.print("글자들의 수 = " + count);
		
	}
	
	
}	
