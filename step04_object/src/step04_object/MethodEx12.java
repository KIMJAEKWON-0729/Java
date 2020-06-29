package step04_object;

public class MethodEx12 {
	public static int sumMethod(int a, int b, int c) {
		return a+b+c;
	}
	public static double avgmethod(int a, int b , int c) {
		return (double)(a+b+c)/3;
	}
	public static void main(String[] args) {
		
		System.out.println(sumMethod(95,88,79));
		System.out.println(avgmethod(95, 88, 79));
	}

}
