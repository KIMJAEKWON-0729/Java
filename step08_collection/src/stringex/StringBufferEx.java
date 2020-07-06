package stringex;

public class StringBufferEx {
	public static void main(String[] args) {
/*		String buf ="abc";
		buf += "123";
		buf +="가나다";
		System.out.println(buf.toString());
*/
		StringBuffer buf = new StringBuffer();
		buf.append("abc");
		buf.append("123");
		buf.append("가나다");
		System.out.println(buf);
		System.out.println("용량:"+buf.capacity());
		System.out.println("크기:"+buf.length());
		
		buf.reverse();
		System.out.println("test2:"+buf);
		
		buf.delete(3,6);
		System.out.println("test3:"+buf);
		
		buf.trimToSize();
		System.out.println("용량:"+buf.capacity());
	}
}
