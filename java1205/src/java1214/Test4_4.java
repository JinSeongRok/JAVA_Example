package java1214;
/*1. 1~10 반복 하되
 *2. 얼마나 더해야 합이 100이상 되는가.
 * */


public class Test4_4 {

	public static void main(String[] args) {
		 int sum = 0;
	       int i = 0;
	       
	       while(sum < 100) {
	          ++i;
	          if(i%2==0)sum -=i;
	          else sum += i;
	         //System.out.println(i + sum);
	       }
	       System.out.println(i + "일 때, 총합이" +sum+ "이 된다");
	      
	   }

	}
