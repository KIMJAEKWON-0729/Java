package constructorex;

public class ConstructorEx7 {
	public static void main(String[] args) {
		// �ڹ�������, ���ڹ�, 150�� setter�� ����, toString���� ���
		// [���] �ڹ��������� ���ڴ� ���ڹ��̰� 150�������� ������
		Book bk1=new Book();
		bk1.setTitle("�ڹ�������");
		bk1.setAuthor("���ڹ�");
		bk1.setPage(150);
		System.out.println(bk1.toString());
		
		//�����ڿ�  JSP�����ǵ����ϱ�, ��JP, 200������ getter�̿��ؼ� ���
		// [���]
		// å�̸� : JSP�����ǵ����ϱ�
		// å���� : ��JP
		// ������ : 200������
		Book bk2=new Book("JSP�����ǵ����ϱ�","��JP", 200);
		System.out.println("å�̸� : " + bk2.getTitle());
		System.out.println("å���� : " + bk2.getAuthor());
		System.out.println("������ : " + bk2.getPage()+"������") ;
	}
}
