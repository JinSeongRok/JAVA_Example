package java1213;

class Car {
	//속성
	boolean powerOn; //시동
	String color;  //차량 색상
	int wheel;	//바퀴수
	int speed;	//속력
	boolean wiperOn; // 와이퍼
	
	void power() { powerOn = !powerOn;}  //시동 메서드
	void speedUp() {speed++;}  			// 엑셀 메서드
	void speedDown() {speed--;}  			// 브레이크 메서드
	void wiper() {wiperOn = !wiperOn;}  // 와이퍼 메서드 
	
	
}

public class class_Car1 {

	
	public static void main(String[] args) {
		Car mycar = new Car();
		
		
		
		System.out.println("시동 처음 초기화" + mycar.powerOn);
		System.out.println("차의 색상 초기화" + mycar.color);
		System.out.println("바퀴의 수 초기화" + mycar.wheel);
		System.out.println("속력 초기화" + mycar.speed);
		System.out.println("와이퍼 작동 초기화" + mycar.wiperOn);

		//메서드(기능) 실행
		mycar.power();  //시동 메서드 실행
		System.out.println("시동 메서드" + mycar.powerOn);
		
		
		mycar.power();  //시동 메서드 실행
		System.out.println("시동 메서드" + mycar.powerOn);
				
		mycar.color = "black";
		System.out.println("현재 차의 색상: " + mycar.color);
		
				
		
	}

}
