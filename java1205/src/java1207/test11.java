package java1207;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {

	    double fh;     	// 여성의 신장
	    double mh;			// 남성의 신장
	    double fw = 37.8; 		//여성의 이상적인 체중
	    double mw = 40; 		//남성의 이상적인 체중
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("여성의 신장을 입력하세요:  ");
		fh = scan.nextDouble();
		
		System.out.print("남성의 신장을 입력하세요:  ");
		mh = scan.nextDouble();
		
	
		
		if(fh > 150 && mh > 150) {
			fw =(37.8 + 0.75 * (fh-150));
			mw = (mw + 0.89*(mh - 150));
		} else if(fh <= 150 && mh <= 150 ) {	
			fw =(37.8 + 0.75 * (fh-150));
			mw = (mw + 0.89*(mh - 150));
		} else 
			System.out.println("잘못 입력하셨습니다.");
		
		System.out.println("여성의 이상적인 체중은" + fw + "이다.");
		System.out.println("남성의 이상적인 체중은" + mw + "이다.");
		
	}
		

}
