
public class Circle2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(10,"자바 피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle2 dounut = new Circle2();
		dounut.name = "도넛";
		area = dounut.getArea()
;
		System.out.println(dounut.name+"의 면적은 "+ area);
	}

}
