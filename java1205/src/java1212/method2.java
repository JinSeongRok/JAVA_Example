package java1212;

public class method2 {
	
	public static int findSum(int N) {
		//합을 저장하는 변수
		int sum;
		
		
		// N이 1이라면 합은 1
		if (N == 1)
			sum = 1;
		else  //N이 2이상이라면
			sum = findSum(N-1) + N;
	
		//합을 리턴한다.
		return sum;
	
	}
	

	public static void main(String[] args) {
		int number = 100;
		System.out.println("1부터" + number + "사이의 모든 정수들의 합은" + findSum(number) + "이다.");
		
		
	}

}
