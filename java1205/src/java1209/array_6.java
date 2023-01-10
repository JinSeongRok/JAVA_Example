package java1209;



public class array_6 {

	public static void main(String[] args) {
		
		
	
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total=0;
		double avg = 0.0;
		int count=0;
		
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
			total += array[i][j];
			count++;
			}
		}
	
			avg = (double)total/count;
			
			
			System.out.println("합은 : "+ total);
			System.out.println("평균은 : "+ avg);
			
		}

	}


