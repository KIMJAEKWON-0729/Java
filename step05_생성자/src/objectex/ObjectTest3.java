package objectex;

/*  Ŭ������ : Emp3
-name:String
-dept:String
-salary:int

+setter & getter
+toString():String
*/
class Emp3{
	private String name;
	private String dept;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name+"�� "+dept+"����̸� "+salary+"���� �޿��� �޽��ϴ�";
	}
} 
public class ObjectTest3 {
	public static void main(String[] args) {
		//Emp3�� ��ü ob�� ����� setter�� ���� "��ȣ��","������",1520000�� �����Ѵ�
		//toString()���� ����Ѵ�.
		Emp3 ob=new Emp3();
		ob.setName("��ȣ��");
		ob.setDept("������");
		ob.setSalary(1520000);
		System.out.println(ob);   // .toString()��  ��������

		//getter�� ���� �̸�, �μ�, �޿��� ����Ѵ�.
		System.out.println("�̸�:" + ob.getName());
		System.out.println("�μ�:" + ob.getDept());
		System.out.println("�޿�:" + ob.getSalary());
	}
}
/*  
[���ȭ��]
��ȣ���� �����λ���̸� 1520000���� �޿��� �޽��ϴ�

 �̸� : ��ȣ��
 �μ� : ������
 �޿� : 1200000��
 
 */
