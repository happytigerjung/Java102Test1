
public class Student {
	String name;
	int grade;
	int height;
	double weight;
	char gender;
	
//	ȭ�� ����� ���� �޼���
	public void getSinfo() {
		System.out.println("�̸� :"+name+"\n�г� :"+grade+"\nŰ :"+height+"\n������ :"+weight+"\n���� :"+gender);
	}
	
	//������ ������ ���� �޼��� ����
	public void setSinfo(String name, int grade, int height, double weight, char gender) {
		this.name = name;
		this.grade = grade;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	

}
