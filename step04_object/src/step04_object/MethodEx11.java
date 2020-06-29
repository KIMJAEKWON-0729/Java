package step04_object;

public class MethodEx11 {
	public static void draw1() {
		System.out.println("Hello World");
		return; //제어권만 반환 생략가능
	}
	public static int draw2() {
		return 100;
	}
	public static float  draw3() {
		return 50.3f;
	}
	public static String draw4() {
		return "Good";
	}
	public static void main(String[] args) {
		draw1();
		int a = draw2(); System.out.println(a);
		//float b = draw3(); System.out.println(b);
		System.out.println(draw3());
		System.out.println(draw4());
	}

}
