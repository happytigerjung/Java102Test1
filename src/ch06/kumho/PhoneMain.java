
package ch06.kumho;

public class PhoneMain {

	public static void main(String[] args) {
		// phone 클래스는 추상클래스이므로 객체를 생성할 수 없음
//		Phone p1 = new Phone("유제석");
//		Phone p2;  //phone 클래스 타입의 변수 생성은 가능
		
//		phone 클래스 맴버를 사용하려면 phone 클래스를 상속받아 자손 클래스가 phone 클래스의 맴버를 모두 구현하면 사용할수 있음
		SmartPhone sp1 = new SmartPhone("아이유");
		sp1.turnOn();
		sp1.turnOff();
		sp1.internetSearch();
		sp1.sleep();
		sp1.wakeUp();
		sp1.powerON();
		
		

	}

}