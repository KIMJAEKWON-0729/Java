package stringex;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = s2;
		String s4 = new String("Hello");
		String s5 = new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	}
}
