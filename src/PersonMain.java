
public class PersonMain {

	public static void main(String[] args) {
//		Ŭ������ ����ϱ� ���ؼ��� ��ü�� �����ؾ� ��
//		��ü ���� �ϰ��� �� ��� ���ϴ� Ŭ���� Ÿ���� ������ �����ϰ� new Ű����� �����ڸ� �̿��Ͽ� ��ü�� ������
		//Person Ŭ���� Ÿ���� ���� p1����, Person() �����ڸ� �̿��Ͽ� ��ü�� �����ϰ� new Ű���带 ���ؼ� �޸𸮿� �����
//		��ϵ� �޸��� �ּҸ� =(���Կ�����) �� ���ؼ� Person Ŭ���� Ÿ���� ���� p1�� ����
		Person p1 = new Person(); 
		
		Person p2;   // Person Ŭ���� Ÿ���� ���� p2�� ���� ����
		p2 = new Person();  //�ʿ��� ��� new Ű����� Person() �����ڸ� �̿��Ͽ� ��ü ���� �� �޸𸮿� ����ϰ� �ش� �޸��� �ּҸ�
//		�̸� �����ص� person Ŭ���� Ÿ���� ���� P2�� ����
		
//		������ ��ü�� �ɹ��� ����� ��� . �� ����Ͽ� �ش� ��ü�� �ɹ��� ������
		p1.name = "������";
		p1.height = 161;
		p1.weight = 45.6;
		p1.gender = 'f';
		p1.married = false;
		
		personInfoPrint(p1.name, p1.gender, p1.height, p1.weight, p1.married);
		
//		System.out.println(p1.name+" �� �����Դϴ�.\n ���� : "+p1.gender+"\nŰ :"+p1.height+"\n������ :"+p1.weight+"\n���� :"+p1.gender);
		
		p2.name = "�ϴú���";
		p2.height = 35;
		p2.weight = 1.5;
		p2.gender = 'm';
		p2.married = false;
		
		personInfoPrint(p2.name, p2.gender, p2.height, p2.weight, p2.married);
		
//		String p1Name = "������";
//		int p1Height = 175;
//		char P1Gender = 'm';
//		double p2Weight = 89.5;
//		boolean p1Married = false;
		
		Student s1 = new Student();
		
		s1.name = "������";
		s1.grade = 1;
		s1.height = 175;
		s1.weight = 89.5;
		s1.gender = 'm';
		
		s1.getSinfo();
		s1.setSinfo("�ٺ�",	1 , 160, 50, 'f');
		s1.getSinfo();
//		System.out.println(s1.name+" �� �����Դϴ�.\n�г� : "+s1.grade+"\nŰ :"+s1.height+"\n������ :"+s1.weight+"\n���� :"+s1.gender);
		
		Student s2 = new Student();
		
		s2.name = "���γ�";
		s2.grade = 1;
		s2.height = 165;
		s2.weight = 45.5;
		s2.gender = 'f';
		
		s2.getSinfo();
		
		
//		System.out.println(s2.name+" �� �����Դϴ�.\n�г� : "+s2.grade+"\nŰ :"+s2.height+"\n������ :"+s2.weight+"\n���� :"+s2.gender);

	}
	
	public static void personInfoPrint(String name, char gender, int height, double weight, boolean marride) {
		
	}
	
//	����1) person Ŭ������ �����Ͽ� Student Ŭ������ �����ϰ� personmain Ŭ������ ��ü 2�� ���� �� ������ ����ϴ� ���α׷� �����ϼ���
//	���ϸ���20201224_1��_�̸�.zip
	
//	����2) �簢�� Ŭ������ �����ϰ� ������ ����, ������ ���̸� ������ �� �ִ� �ɹ� ������ ���� �� �ش� �簢���� ���̸� ���ϴ� �ż����
//	���� �� ������ ������ ���� ���ϴ� �޼��带 ���� �� ���� Ŭ�������� ��ü�� �����Ͽ� ���̿� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
	
//	����3) �������� �̸��� ����  circle Ŭ������ �ۼ��ϰ� circle Ŭ������ ��ü�� �����Ͻÿ�
//	����1) ��ü 2�� ���� ,pizza, dounut
//	����2) ���� ���� ����, 3.14*������*������ (math.pi=3.14)
	
//	���ϸ� 20201224_2��_�̸�.zip
	
	


}















