import ch06.hakook.Tire;
import ch06.hakook.SnowTire;

//해당 클래스에 있는 클래스를 한번에 다 로딩해서 사용하는 방법
//import ch06.kumho.*;

public class Car {
	
	public static void main(String[] args) {
//		해당 패키지명 및 클래스 명을 모두 입력해야 클래스를 사용할 수 있음
//		ch06.hakook.Tire tire = new ch06.hakook.Tire();
		
		
		Tire tire = new Tire();
		
		
		Tire tire2 = new Tire();
		
		SnowTire snow1 = new SnowTire();
	}

}
