package java1209;

public class array_test2 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.print(max);

	}

}
