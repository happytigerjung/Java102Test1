
public class OveroadEx {
	
//	오버로딩의 활용
	public int getSum(int a, int b) {
		return a+b;
	}
	
	public int getSum(int a, int b, int c) {
		return a+b+c;
	}
	
	public void getSum(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public double getSum(int a, double b) {
		return a+b;
	}
	
	public double getSum(double a, int b) {
		return a+b;
	}

}
