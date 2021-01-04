
public class Book {
//	문제1) 제목과 저자를 나타내는 title과 author 맴벌 변수를 가진 Book 클래스를 작성하고 생성자를 작성하여 뱀버 변수를 초기화 하고 화면에 출력하세요
//	조건 1. 책 2권 정보를 출력하시요
	
	String title;
	String author;
	
//	public Book(String title, String author) {
//		
//	}
	
	
//	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//	}
	
	

	public void getinfo() {
		System.out.println("책의 제목은 "+title+"이며 작가는 "+author+"입니다.");
	}
//	this는 객체 자기 자신을 가르키는 키워드
//	this()는 생성자 내에서 또 다른 생성자를 호출하기 위한 명령어

}
