package java1214;

public class Test4_6 {

	public static void main(String[] args) {
		// 두 주사위를 던졌을때.
		// 합이 6이 되게하라
		// 모든 경우의수
		// 여러번 던져야하니 반복이 되겠다. 그럼 반복문
		

       int i;   // 주사위 1
       int j ; // 주사위 2
       int sum =0;
       
       
       for(i=1; i<=6; i++) {
          for(j=1; j<=6; j++) {
             if((i + j) == 6) {
                System.out.println(i+"+"+j+"="+(i*j));

             }
          }
       }
       
       
    }
}