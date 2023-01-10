package java1213;


public class StudentDrive {

	public static void main(String[] args) {

		// 첫 번쨰 학생을 나타내는 객체를 만든다.
		Student stud1 = new Student();
		//첫번째 학생의 이름을 정한다.
		stud1.name = "선남";
		//첫번째 학생의 과제점수
		stud1.assignmentScore = 91;
		//첫번째 학생의 시험점수
		stud1.examScore = 84;
		//첫번째 학생의 이름, 점수들과 학점을 출력한다.
		System.out.println(stud1.toString());


		// 두 번째 학생을 나타내는 객체를 만든다.
		Student stud2 = new Student();
		//두 번째 학생의 이름을 정한다.
		stud2.name = "선녀";
		//두 번째 학생의 과제점수
		stud2.assignmentScore = 86;
		//두 번째 학생의 시험점수
		stud2.examScore = 95;
		//두 번째 학생의 이름, 점수들과 학점을 출력한다.
		System.out.println(stud2.toString());

		
	}


}
