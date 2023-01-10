package java1208;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("값" + "\t" +"합");
		
		for(i=1; i <=5; i++) {
			
		sum+=i;
		
		System.out.println(i + "\t" + sum);
		}
		
	}

}
