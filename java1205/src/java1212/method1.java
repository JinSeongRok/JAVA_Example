package java1212;

public class method1 {

	public static int findMin(int num1, int num2) {
		// 과정1. 최소값을 저장하는 변수 minimum 선언
		int minimum;
		
		// 과정2. 최소값은 두 정수들을 비교하여 작은 값으로 한다.
		if (num1 < num2)
			minimum = num1;
		else 
			minimum = num2;
		
		
		// 과정3. 최소값을 반환
		return minimum;		
	}
	
	public static void main(String[] args) {
		//메소드의 반환되는 값을 저장할 변수
			
		int value1 = 65;
		int value2 = 82;
		int minimum1;
		int minimum2;
		minimum1 = findMin(value1, value2);
		minimum2 = findMin(30, 20);
		
		System.out.print("두 개의 정수 중 작은 값은: " + minimum1);
	}

}
