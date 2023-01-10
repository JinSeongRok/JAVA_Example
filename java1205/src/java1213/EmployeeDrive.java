package java1213;

public class EmployeeDrive {

	public static void main(String[] args) {
		
    	Employee emp1;
  		Employee emp2;

	
		emp1 = new Employee( );

	
		emp1.setName("이도령");
		emp1.setNumber(100);
		emp1.setAge(25);

		System.out.println(emp1);

	
  		emp2 = new Employee();

		emp2.setName("성춘향");
		emp2.setNumber(200);
		emp2.setAge(25);
		System.out.println(emp2.toString());

       
  		emp2.setNumber(300);
  		System.out.println(emp2.toString());	
    

	}

}
