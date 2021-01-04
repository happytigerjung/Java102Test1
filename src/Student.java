
public class Student {
	String name;
	int grade;
	int height;
	double weight;
	char gender;
	
//	화면 출력을 위한 메서드
	public void getSinfo() {
		System.out.println("이름 :"+name+"\n학년 :"+grade+"\n키 :"+height+"\n몸무게 :"+weight+"\n성별 :"+gender);
	}
	
	//데이터 저장을 위한 메서드 선언
	public void setSinfo(String name, int grade, int height, double weight, char gender) {
		this.name = name;
		this.grade = grade;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	

}
