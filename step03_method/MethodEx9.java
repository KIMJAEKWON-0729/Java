package step03_method;

// Call by Reference: 값을 전달하는 방식
public class MethodEx9 {
	public static void circle(double a) {
		System.out.println(a*a*3.14);
		
	}	
	public static void trapezoid(double a, double b, double c) {
		System.out.println(((a+b)*c)/2);
	}
	public static void rectangle(double a, double b) {
		System.out.println(a*b);
	}
	
	
	
	public static void main(String[] args) {
	circle(10);
	trapezoid(3, 5, 7);
	rectangle(4, 5);
	
	}

}
