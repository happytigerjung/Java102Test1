package ch06.kumho;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		추상 클래스는 객체화 할수 없음
//		Animal ani = new Animal();
//		추상 클래스인 animal 을 상속받아 추상 매서드인 sound()를 오버라이딩 하여 구현하지 않아서 dog클래스도 추상 클래스가 된다
//		Dog dog = new Dog();
		
		
//		추상 클래스인 animal클래스를 상속받아 추상 매서드인 sound()를 오버라이딩 하여 구현함 일반 클래스로 사용할 수 있어 객체화 가능
		Cat cat = new Cat();
		cat.sound();
//		추상 클래스인 animal클래스를 상속받았으나 추상 메서드인 sound()를 구현하지 않아, 추상 클래스가 된 Dog클래스를 상속받아서
//		추상 메서드인 sound()를 오버라이딩으로 구현하여 일반 클래스로 사용할 수 있게된 Jindo 클래스
		JIndo jin = new JIndo();
		jin.sound();
		jin.breathe();
		

	}

}
