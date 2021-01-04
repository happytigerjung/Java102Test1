
public class PersonMain {

	public static void main(String[] args) {
//		클래스를 사용하기 위해서는 객체를 생성해야 함
//		객체 생성 하고자 할 경우 원하는 클래스 타입의 변수를 생성하고 new 키워드와 생성자를 이용하여 객체를 생성함
		//Person 클래스 타입의 변수 p1생성, Person() 생성자를 이용하여 객체를 생성하고 new 키워드를 통해서 메모리에 등록함
//		등록된 메모리의 주소를 =(대입연산자) 를 통해서 Person 클래스 타입의 변수 p1에 저장
		Person p1 = new Person(); 
		
		Person p2;   // Person 클래스 타입의 변수 p2를 먼저 생성
		p2 = new Person();  //필요한 경우 new 키워드와 Person() 생성자를 이용하여 객체 생성 후 메모리에 등록하고 해당 메모리의 주소를
//		미리 생성해둔 person 클래스 타입의 변수 P2에 저장
		
//		생성된 객체의 맴버를 사용할 경우 . 을 사용하여 해당 객체의 맴버에 접근함
		p1.name = "아이유";
		p1.height = 161;
		p1.weight = 45.6;
		p1.gender = 'f';
		p1.married = false;
		
		personInfoPrint(p1.name, p1.gender, p1.height, p1.weight, p1.married);
		
//		System.out.println(p1.name+" 의 정보입니다.\n 성별 : "+p1.gender+"\n키 :"+p1.height+"\n몸무게 :"+p1.weight+"\n성별 :"+p1.gender);
		
		p2.name = "하늘보리";
		p2.height = 35;
		p2.weight = 1.5;
		p2.gender = 'm';
		p2.married = false;
		
		personInfoPrint(p2.name, p2.gender, p2.height, p2.weight, p2.married);
		
//		String p1Name = "정현조";
//		int p1Height = 175;
//		char P1Gender = 'm';
//		double p2Weight = 89.5;
//		boolean p1Married = false;
		
		Student s1 = new Student();
		
		s1.name = "정현조";
		s1.grade = "1";
		s1.height = 175;
		s1.weight = 89.5;
		s1.gender = 'm';
		
		s1.getSinfo();
		s1.setSinfo("바보",	1 , 160, 50, 'f');
		s1.getSinfo();
//		System.out.println(s1.name+" 의 정보입니다.\n학년 : "+s1.grade+"\n키 :"+s1.height+"\n몸무게 :"+s1.weight+"\n성별 :"+s1.gender);
		
		Student s2 = new Student();
		
		s2.name = "유인나";
		s2.grade = "1";
		s2.height = 165;
		s2.weight = 45.5;
		s2.gender = 'f';
		
		s2.getSinfo();
		
		
//		System.out.println(s2.name+" 의 정보입니다.\n학년 : "+s2.grade+"\n키 :"+s2.height+"\n몸무게 :"+s2.weight+"\n성별 :"+s2.gender);

	}
	
	public static void personInfoPrint(String name, char gender, int height, double weight, boolean marride) {
		
	}
	
//	문제1) person 클래스를 참고하여 Student 클래스를 생성하고 personmain 클래스에 객체 2개 생성 후 정보를 출력하는 프로그램 생성하세요
//	파일며이20201224_1번_이름.zip
	
//	문제2) 사각형 클래스를 생성하고 가로의 길이, 새로의 길이를 저장할 수 있는 맴버 변수를 선언 후 해당 사각형의 넓이를 구하는 매서드와
//	가로 및 세로의 길이의 합을 구하는 메서드를 선언 후 실행 클래스에서 객체를 생성하여 넓이와 길이의 합을 구하는 프로그램을 작성하시요
	
//	문제3) 반지름과 이름을 가진  circle 클래스를 작성하고 circle 클래스의 객체를 생성하시오
//	조건1) 객체 2개 생성 ,pizza, dounut
//	조건2) 원의 넓이 공식, 3.14*반지름*반지름 (math.pi=3.14)
	
//	파일명 20201224_2번_이름.zip
	
	


}















