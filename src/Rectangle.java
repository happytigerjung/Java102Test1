public class Rectangle {
//	문제2) 사각형 클래스를 생성하고 가로의 길이, 새로의 길이를 저장할 수 있는 맴버 변수를 선언 후 해당 사각형의 넓이를 구하는 매서드와
//	가로 및 세로의 길이의 합을 구하는 메서드를 선언 후 실행 클래스에서 객체를 생성하여 넓이와 길이의 합을 구하는 프로그램을 작성하시요
	int width;
	int rength;
	
//	사각형의 넓이를 구하는 메서드
	public void recArea() {
//		this.width = width;
//		this.rength = rength;
		
		System.out.println("사각형의 넓이는 "+width*rength);
	}
	
//	사각형의 둘레를 구하는 메서드
	public void recLength() {
		System.out.println("사각형의 둘레는"+(width*2+rength*2));
	}
	
	

}
