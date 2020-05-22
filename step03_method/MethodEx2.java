package step03_method;


//Call by name: 이름만 이쓴 함수
public class MethodEx2 {
	public static int view1() {//void 가 int 로 바꼈다 
		return 10;
	}
	public static char view2() {
		return 'A';
	}
	public static float view3() {
		return 50.4f;
	}
	public static double view4() {
		return 75.55;
	}
	public static boolean view5() {
		return true;
	}
	public static String view6() {
		return "Korea";
	}
	public static void main(String[] args) {
		int a = view1(); System.out.println(a);
		char b = view2(); System.out.println(b);
		float c = view3(); System.out.println(c); 
		double d =view4(); System.out.println(d);
		boolean e= view5();System.out.println(e);
		String f = view6(); System.out.println(f);
		}
}

