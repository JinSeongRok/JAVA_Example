package java1209;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// String str;
		String name; //이름
		int fare; // 요금
		int income = 0; // 수입
		
		
		Scanner scan = new Scanner(System.in);
		
	
		
		while(true) {
			
		System.out.print("손님의 이름을 입력하세요: ");
		String i = scan.nextLine();
				
		
			
		System.out.print("요금을 입력하세요: ");
		fare = scan.nextInt();
		income = income + fare;
		
		if(i.equals(" "));
			break;
			
		}
		
		
		//fare += ;;
		
		System.out.print("총 수입은" + income +"이다.");
		}
	}

