
public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.title = "���ݼ���";
		b1.author = "�Ŀ���ڿ���";
		b1.getinfo();
		
		
		b2.title = "����";
		b2.author ="��������";
		b2.getinfo();
		
		
		Book2 b21 = new Book2();
		b21.setPrice("1000");
		b21.setTitle("���Ƕ� �����ΰ�");
		b21.setPrice("����Ŭ����");
		b21.setPublisher("dd");
		b21.getinfo();
		
		
		

	}

}
