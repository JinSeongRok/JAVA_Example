package java1208;

import java.util.Scanner;

public class test2 {

   public static void main(String[] args) {
            
         Scanner scan = new Scanner(System.in);
         
         String subName;
         int attendanceScore;
         int homeworkScore;
         int occasionalExam;
         int midExam;
         int finalExam;
         double totalScore;
         char grade = 0;
         String str;
         int subCount=0;
         double total =0.0;
         
         
         
         do {
            System.out.print("과목을 입력하세요 : ");
            subName = scan.next();
            System.out.print("출석 점수를 입력하세요 : ");
            attendanceScore = scan.nextInt();
            System.out.print("과제 점수를 입력하세요 : ");
            homeworkScore = scan.nextInt();
            System.out.print("수시시험 점수를 입력하세요 : ");
            occasionalExam = scan.nextInt();
            System.out.print("중간시험 점수를 입력하세요 : ");
            midExam = scan.nextInt();
            System.out.print("기말시험 점수를 입력하세요 : ");
            finalExam = scan.nextInt();
            
            totalScore = totalCalculator(attendanceScore, homeworkScore,
             occasionalExam, midExam, finalExam);
            grade = gradeCalculator(totalScore);
            switch(grade) {
               case 'A':
                  total+=4.0;
                  break;
               case 'B':
                  total+=3.0;
                  break;
               case 'C':
                  total+=2.0;
                  break;
               case 'D':
                  total+=1.0;
                  break;
               case 'F':
                  break;
            }
            System.out.println("과목 " + subName + "의 총점 : " + totalScore);
            System.out.println("과목 " + subName + "의 학점 : " + grade);
            
            System.out.print("계속하기를 원하세요? 그렇다면 y를 아니면 n를 입력하세요: ");
            str = scan.next();
            subCount+=1;
         } while(str.equals("y"));
         
         System.out.println("평점 : " + total/subCount );
      }

      public static double totalCalculator(int attendanceScore, int homeworkScore,
            int occasionalExam, int midExam, int finalExam) {
      
         double totalScore = (attendanceScore*0.1) + (homeworkScore*0.4)+
                (occasionalExam*0.1) + (midExam*0.2) + (finalExam*0.2);
         return totalScore;
      }

      public static char gradeCalculator(double totalScore) {
         char gradeScore;
         if(totalScore >= 90) {
            gradeScore = 'A';
         } else if(totalScore >= 80) {
            gradeScore = 'B';
         } else if(totalScore >= 70) {
            gradeScore = 'C';
         } else if(totalScore >= 60) {
            gradeScore = 'D';
         } else {
            gradeScore = 'F';
         }
         return gradeScore;
      
      }
   }