package override;

class Test extends Object{
	public String str = "Hello";

	public Test() {
		super();
	}
	public void view() {
		System.out.println(this.str.toString());
	}
	
	
}

public class ObjectEx {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.view();
	}

}




//import java.lang.System;
//import java.lang.String;
//
//class Test extends Object{
//	public String str = "Hello";
//
//	public Test() {
//		super();
//	}
//	public void view() {
//		System.out.println(this.str.toString());
//	}
//	
//	
//}
//
//public class ObjectEx {
//	public static void main(String[] args) {
//		Test ob = new Test();
//		ob.view();
//	}
//
//}
