package java1213;



public class Test2 {

	public static void main(String[] args) {
		Student0 s = new Student0();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		
		System.out.println("이름: "+ s.name);
		System.out.println("총점: "+ s.getTotal());
		System.out.println("평균: "+ s.getAverage());
	}
}

	class Student0 {
		
		String name;					//학생이름
		int ban;						//반
		int no;							//번호
		int kor;						//국어 점수
		int eng;						//영어 점수
		int math;						//수학 점수
		
		public int getTotal() {
			int getTotal;
			getTotal = kor + eng + math;
			return getTotal;
		}
		
		public float getAverage() {
			float getAverage;
			getAverage = (int)(getTotal()/3f*10+.5f)/10f;
			return getAverage;
			
			
		}
	
}
