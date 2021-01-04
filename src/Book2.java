
public class Book2 {
//	제목 저자 출판사 가격
	private String title;
	private String author;
	private String publisher;
	private String price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void getinfo() {
		System.out.println("책의 제목은 "+title+"이며 작가는 "+author+"입니다.");
	}
	
//	Getter/Setter 을 사용하는 이유는 객체의 맴버에 함부로 접근을 허가하지 않기 위해
	
	
	

}
