package ch06.kumho;

public class Phone {	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("휴대폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰 전원을 끕니다.");
	}
	
	public void sleep() {
		System.out.println("휴대폰 잠시 멈춤.");
	}
	
	public void wakeUp() {
		System.out.println("휴대폰 일어남.");
	}

}