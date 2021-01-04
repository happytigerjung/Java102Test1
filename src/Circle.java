public class Circle {
//	문제3) 반지름과 이름을 가진  circle 클래스를 작성하고 circle 클래스의 객체를 생성하시오
//	조건1) 객체 2개 생성 ,pizza, dounut
//	조건2) 원의 넓이 공식, 3.14*반지름*반지름 (math.pi=3.14)
	String name;
	int r;
	double constant;
	
	public void area() {
		System.out.println("원의 넓이는 "+Math.PI*r*r);
	}

}