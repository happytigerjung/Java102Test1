package ch06.kumho;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다..");
	}
	
//	phone 클래스의 turnon 메서드와 기능이 겹침
	public void powerON() {
		System.out.println("스마트폰 전원을 켭니다.");
	}

	

}