package java1209;


public class testt {

	public static void main(String[] args) {

		int[] score = {100, 80, 85, 94};
		
		int sum = 0;
		for (int i=0; i<4; i++) {
			sum += score[i];
			
		}
		
		System.out.println("총합 : "+ sum);
		double avg = (double)sum /4;
		System.out.println("평균: "+ avg);
		
	}

}
