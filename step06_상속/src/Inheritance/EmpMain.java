package Inheritance;

public class EmpMain {
	public static void main(String[] args) {
		Emp ob1 = new Emp("�̼���","010-1111-1111");
		System.out.println(ob1.toString());
		EmpScore ob2 = new EmpScore("�����","010311144",54.2,'A');
		System.out.println(ob2.toString());
		
	}
}
/*
���� �̸��� �̼����̰� ����ó�� 010-1111-1111�Դϴ�

���� �̸��� ��ȣ���̰� ����ó�� 010-1234-5678�Դϴ�
���� ������ 75.3�� �̰� ������ C�Դϴ�

*/