package stringex;

public class StringBufferEx {
	public static void main(String[] args) {
/*		String buf ="abc";
		buf += "123";
		buf +="������";
		System.out.println(buf.toString());
*/
		StringBuffer buf = new StringBuffer();
		buf.append("abc");
		buf.append("123");
		buf.append("������");
		System.out.println(buf);
		System.out.println("�뷮:"+buf.capacity());
		System.out.println("ũ��:"+buf.length());
		
		buf.reverse();
		System.out.println("test2:"+buf);
		
		buf.delete(3,6);
		System.out.println("test3:"+buf);
		
		buf.trimToSize();
		System.out.println("�뷮:"+buf.capacity());
	}
}
