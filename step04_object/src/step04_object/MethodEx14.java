package step04_object;

public class MethodEx14 {
	public static void view1() {
		System.out.println("static method");
	}
	public  void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		
		view1();
		MethodEx14 ob = new MethodEx14();
		ob.view2();
	}
}
