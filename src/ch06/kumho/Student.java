package ch06.kumho;

public class Student extends Person{
	public String studentNumber;
	public String classNumber;
	
	public void getStudentInfo() {
		System.out.println("�й�: "+studentNumber+"\n�̸� :"+name+"\n���� :"+
	age+"\n���� :"+gender+"\n�й� :"+classNumber+"\n�̸��� :"+email);
	}

}
