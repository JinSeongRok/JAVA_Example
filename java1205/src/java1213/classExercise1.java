package java1213;

public class classExercise1 {

	public static void main(String[] args) {
		
		Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
		
	
		System.out.println(s.info());
	}

}


class Student1{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student1(String Name, int ban, int no, int kor, int eng, int math) {
		this.name = Name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
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
	public String info() {
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal() +", "+getAverage(); 
	}
		
}