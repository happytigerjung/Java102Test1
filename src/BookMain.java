
public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.title = "연금술사";
		b1.author = "파울로코엘료";
		b1.getinfo();
		
		
		b2.title = "개미";
		b2.author ="베르베르";
		b2.getinfo();
		
		
		Book2 b21 = new Book2();
		b21.setPrice("1000");
		b21.setTitle("정의란 무엇인가");
		b21.setPrice("마이클샌델");
		b21.setPublisher("dd");
		b21.getinfo();
		
		
		

	}

}
