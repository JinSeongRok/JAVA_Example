package java1214;

public class Test6_22 {
	
	boolean inNumber;
	
	
	
	static boolean isNumber(String str) {
		boolean check = true;
		if("".equals(str) || str == null) check = false;
		else{
			for(int i = 0; i < str.length(); i++) {
				char thisCharater = str.charAt(i);
				if(thisCharater < 48 || thisCharater > 57) {
					check = false;
					break;
				}
			}
		}
		return check;
	}
	

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?" +isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));

	}

}
