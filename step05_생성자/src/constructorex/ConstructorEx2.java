package constructorex;

public class ConstructorEx2 {
	public ConstructorEx2() {
		this("xyz",10);  //3
		System.out.println("default constructor"); //5
	}
	public ConstructorEx2(String str) {
		this();  //2
		System.out.println(str+ " constructor"); //6
	}
	public ConstructorEx2(String str, int n) {
		System.out.println(str+ "  " + n+ " constructor");  //4
	}
	public static void main(String[] args) {
		new ConstructorEx2("xyz"); //1, 7
	}
}
//-----------------------------------------------------------------------
/*
public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");  // 4
	}
	public ConstructorEx2(String str) {
		this();                        // 3
		System.out.println(str+ " constructor");    // 5
	}
	public ConstructorEx2(String str, int n) {
		this(str);                      // 2
		System.out.println(str+ "  " + n+ " constructor");  // 6
	}
	public static void main(String[] args) {
		new ConstructorEx2("ABC", 10);  // 1, 7
	}
}
*/





