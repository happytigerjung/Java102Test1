package ch06.kumho;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "���缮";
		p1.age = 50;
		p1.gender = 'M';
		p1.email = "wo@gg.com";
		p1.getInfo();
		
		Student s1 = new Student();
		s1.studentNumber = "00001";
		s1.name = "������";
		s1.age = 28;
		s1.gender = 'f';
		s1.email = "you@ggg.com";
		s1.classNumber = "c001";
		s1.getInfo();
		s1.getStudentInfo();
		
		

		System.out.println("=============�ڵ� Ÿ�Ժ�ȯ==================");
//		Ŭ������ ������, �θ� Ŭ������ person Ŭ���� ������ �ڼ� Ŭ���� studentŬ������ ��ü s1�� �־���
//		�̰��� �ڵ�Ÿ�� ��ȯ�̴�
		Person p2 = s1;
		p2.getInfo();
//		p2.getStudentInfo(); �ڼ� Ŭ���� Ÿ���� ��ü�� s1�� �θ� Ŭ���� Ÿ���� ���� p2�� �����ϸ� �θ� Ŭ���� Ÿ���� �ɹ��� ��밡����
//		�ڼ� Ŭ���� Ÿ���� ��ü�� ������ �ִ� �����ʹ� �״�� ����
		
		
		System.out.println("=============���� Ÿ�Ժ�ȯ==================");
		Student s2 = (Student)p2;
		s2.getInfo();
		s2.getStudentInfo();

	}

}












