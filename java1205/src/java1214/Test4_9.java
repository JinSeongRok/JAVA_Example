package java1214;

public class Test4_9 {


		// 숫자로 이루어진 문자열 Str
		//각 자리 더한 합을 출력
		//문자열이 12345 면 1+2+3+4+5  결과 15를 출력
		//String charAt(int i) 사용 
    public static void main(String[] args) {
       String str = "12345";
       int sum = 0;
       
       for(int i= 0; i<str.length(); i++) {
          sum += str.charAt(i)-'0';
       }
       System.out.println("sum="+sum);
    }
}