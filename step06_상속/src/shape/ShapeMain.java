package shape;

public class ShapeMain {
	public static void main(String[] args) {
		 Rectangle rr=new Rectangle(4,5);
			System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ: " + rr.getSize());  // 20
			
			Triangle tt=new Triangle(3,7);
			System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: " + tt.getSize());  // 10.5
	}
}
/* 
 * »ç°¢ÇüÀÇ ³ĞÀÌ :20
 * »ï°¢ÇüÀÇ ³ĞÀÌ :10.5
 */
