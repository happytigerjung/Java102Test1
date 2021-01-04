package ch06.kumho;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "유재석";
		p1.age = 50;
		p1.gender = 'M';
		p1.email = "wo@gg.com";
		p1.getInfo();
		
		Student s1 = new Student();
		s1.studentNumber = "00001";
		s1.name = "아이유";
		s1.age = 28;
		s1.gender = 'f';
		s1.email = "you@ggg.com";
		s1.classNumber = "c001";
		s1.getInfo();
		s1.getStudentInfo();
		
		

		System.out.println("=============자동 타입변환==================");
//		클래스의 다형성, 부모 클래스인 person 클래스 변수에 자손 클래스 student클래스의 객체 s1을 넣었다
//		이것이 자동타입 변환이다
		Person p2 = s1;
		p2.getInfo();
//		p2.getStudentInfo(); 자손 클래스 타입의 객체인 s1을 부모 클래스 타입의 변수 p2에 대입하면 부모 클래스 타입의 맴버만 사용가능함
//		자손 클래스 타입의 객체가 가지고 있는 데이터는 그대로 유지
		
		
		System.out.println("=============강제 타입변환==================");
		Student s2 = (Student)p2;
		s2.getInfo();
		s2.getStudentInfo();

	}

}












