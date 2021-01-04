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

	}

}
