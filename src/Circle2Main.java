
public class Circle2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(10,"�ڹ� ����");
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle2 dounut = new Circle2();
		dounut.name = "����";
		area = dounut.getArea()
;
		System.out.println(dounut.name+"�� ������ "+ area);
	}

}
