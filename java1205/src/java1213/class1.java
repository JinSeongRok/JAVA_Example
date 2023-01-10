package java1213;

public class class1 {

	public String name;
	public int phone;
	public int age;
	
	public class1( ) {
	}
	public String getName( ) {
		return name;
	}
	public int getNumber( ) {
		return phone;
	}
	public int getAge( ) {
		return age;
	}
	
	public String toString( ) {
		String information = " ";
		information += "이름 : " + name + "\n";
		information += "번호 : " + phone + "\n";
		information += "나이 : " + age + "\n";
		return information;
	}
	
	
	public void setName(String Name) {
		name = Name;		
	}
	public void setPhone(int Phone) {
		phone = Phone;
	}
	public void setAge(int Age) {
		age = Age;
	}
}
