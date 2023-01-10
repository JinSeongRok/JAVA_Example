package java1214;

public class Test4_8 {

	public static void main(String[] args) {
		//방정 식 2x+4y=10의 해를 구하기
		// x y 값은 정수다.
		//각 범위 0~10 사이
       int x;
       int y;
       
       for(x=0; x<=10; x++) {
          for(y=0; y<=10; y++) {
             if(2*x+4*y ==10)
             System.out.println("x="+x +","+ "y="+y);
          }
       }
    }
}