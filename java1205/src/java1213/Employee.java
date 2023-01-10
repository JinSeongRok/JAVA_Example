package java1213;

public class Employee
{
    public String name;
    public int numPhone;
    public int age;

    public Employee( ){
	}

	public String getName( ){
		return name;
	}

	
	public int getNumber( ){
  		return numPhone;
	}


	public int getAge( ){
  		return age;
	}


    public String toString (){
    	String information = " ";
    	information += "이름 : " + name + "\n";
    	information += "번호 : " + numPhone + "\n";
    	information += "나이 : " + age + "\n";
    	return information;
    }

	
	public void setName(String Name){
		name = Name;
	}

	public void setNumber(int Number){
  		numPhone = Number;
	}

	public void setAge(int Age){
  		age = Age;
	}
}