package java1212;

import java.util.Scanner;

public class method4_1 {
      
      public static void sum(int num1, int num2) {
         int sum = num1 + num2;
         System.out.println("두 수에 합: "+ sum);
      }
      public static void sum(int num1, int num2, int num3) {
         int sum = num1 + num2 + num3;
         System.out.println("세 수에 합: "+ sum);         
      }
      
      public static void cha(int num1, int num2) {
         int sum = num1 - num2;
         System.out.println("두 수에 차: "+ sum);         
      }
      public static void cha(int num1, int num2, int num3) {
         int sum = num1 - num2 - num3;
         System.out.println("세 수에 차: "+ sum);         
      }
      
      public static void gub(int num1, int num2) {
         int sum = num1 * num2;
         System.out.println("두 수에 곱: "+ sum);
      }
      public static void gub(int num1, int num2, int num3) {
         int sum = num1 * num2 * num3;
         System.out.println("세 수에 곱: "+ sum);         
      }
      
      public static void na(int num1, int num2) {
         double sum = num1 / (double) num2;
         System.out.println("두 수에 나누기: "+ sum);         
      }
      public static void na(int num1, int num2, int num3) {
         double sum = num1 / (double) num2 / (double) num3;
         System.out.println("세 수에 나누기: "+ sum);         
      }

      public static void main(String[] args) {
         // 2~3개 를 입력 받으면 사칙연산 결과 출력
         Scanner scan = new Scanner(System.in);
         
         int count;
         int num1;
         int num2;
         int num3;
         
         System.out.print("2개의 정수 또는 3개의 정수를 입력 할 것인지를 선택해주세요.(2 or 3) : ");
         count = scan.nextInt();
         if(count == 2 ) {
            System.out.print("두 수를 입력하세요 : ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
         
            sum(num1, num2);
            cha(num1, num2);
            gub(num1, num2);
            na(num1, num2);
         } else if(count == 3) {
            System.out.print("세 수를 입력하세요 : ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            num3 = scan.nextInt();
            
            sum(num1, num2, num3);
            cha(num1, num2, num3);
            gub(num1, num2, num3);
            na(num1, num2, num3);
            
         }
         

      }
   

}
   
	
