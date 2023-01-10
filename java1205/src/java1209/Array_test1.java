package java1209;

public class Array_test1 {

	public static void main(String[] args) {


		
		
		
		int[][] scores = {
				{80, 90, 96},      // a 반 학생 점수
				{76, 88}			// b 반 학생 점수
		};
		
		
		
	
		
		// 출력
		// 총 반 수 : 2							scores.length <- 반수
		// a반의 학생수 : 3							scores[0].length < a반 학생수
		// b반의 학생수 : 2							scores[1].length < b반 학생수
		// 각반의 마지막 학생의 점수 : 출력				
		// a반의 평균 점수 ; 88.666666667				
		// b반의 평균 점수 : 82.0					
		// 전체 학생의 평균 점수 : 86.0
		int sum = 0;
		int i;
		int j;
		double sumA=0;
		double sumB=0;
		int count=0;
		double avg = 0.0;
		
		 for(i = 0; i < scores.length; i++) {
			 for(j=0; j < scores[i].length; j++) {
				 sum += scores[i][j];
				 count++;
		
				 
			 }
		 }
		 

		for(i =0; i<scores[0].length; i++) {
			sumA += scores[0][i];
			
		}//a반 총점
		
		for(j=0; j<scores[1].length; j++) {	
			
			sumB += scores[1][j];	
			
		}
		avg = (double)sum/count;
		
	
		
		
		System.out.println("총 반 수 : " + scores.length);
		System.out.println("A반의 학생 수 : " + scores[0].length);
		System.out.println("B반의 학생 수 : " + scores[1].length);
		System.out.println("각 반의 마지막 학생의 점수 : " + scores[0][2] +","+ scores[1][1]);
		System.out.println("A반의 평균 점수 : " + sumA/(float)scores[0].length );
		System.out.println("B반의 평균 점수: " + sumB/(float)scores[1].length );
		System.out.println("전체 학생의 평균 점수: "+ avg);
		
	}

}
