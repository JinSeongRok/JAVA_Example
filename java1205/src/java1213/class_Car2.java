package java1213;

class Car1 {
	//속성 : 변수
	boolean powerOn; //시동
	String color;  //차량 색상
	int wheel;	//바퀴수
	int speed;	//속력
	boolean wiperOn; // 와이퍼
	
	// 메서드 : 기능
	void power() { powerOn = !powerOn;}  //시동 메서드
	void speedUp() {speed++;}  			// 엑셀 메서드
	void speedDown() {speed--;}  			// 브레이크 메서드
	void wiper() {wiperOn = !wiperOn;}  // 와이퍼 메서드 
	
	
}

public class class_Car2 {

	public static void main(String[] args) {
		Car mycar1 = new Car();		//my car1 인스턴스 생성
		Car mycar2 = new Car();		//my car2 인스턴스 생성
		
		mycar1.color = "red";		//mycar1은 빨강
		mycar2.color = "black";		//mycar2은 블랙
		
		mycar1.speedUp();			//mycar1은 엑셀 메서드 호출
		mycar2.wiper();			//mycar2는 와이퍼 메서드
		
		System.out.println("mycar1의 색: " + mycar1.color);
		System.out.println("mycar2의 색: " + mycar2.color);
		
		System.out.println("mycar1의 속도: " + mycar1.speed);
		System.out.println("mycar2의 속도: " + mycar2.speed);
		
		System.out.println("mycar1의 와이퍼작동 여부: " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼작동 여부: " + mycar2.wiperOn);
		
	}

}
