package shape;

public class ShapeMain {
	public static void main(String[] args) {
		 Rectangle rr=new Rectangle(4,5);
			System.out.println("�簢���� ����: " + rr.getSize());  // 20
			
			Triangle tt=new Triangle(3,7);
			System.out.println("�ﰢ���� ����: " + tt.getSize());  // 10.5
	}
}
/* 
 * �簢���� ���� :20
 * �ﰢ���� ���� :10.5
 */
