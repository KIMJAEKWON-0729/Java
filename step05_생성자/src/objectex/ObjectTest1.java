package objectex;

/*  Ŭ������ : Emp
-name:String
-dept:String
-salary:int

+setEmp(name:String, dept:String,  salary:int):void
+printEmp():void
*/

//ObjectTest1.java --> ObjectTest1.class  Emp.class
class Emp{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name,String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void printEmp() {
		System.out.println(name+"�� "+dept+"���̸� "+salary+"���� �޿��� �޽��ϴ�");
	}
}
public class ObjectTest1 {
	public static void main(String[] args) {
		//EmpŬ������ ob��ü�� �������� setEmp()�� ���� �����͸� �����Ѵ�
		//printEmp()�� ����Ѵ�
		Emp em=new Emp();
		em.setEmp("��ȣ��", "������", 1520000);
		em.printEmp();
	}
}
/*
[���ȭ��]
��ȣ���� ������ ����̸� 1520000���� �޿��� �޽��ϴ�.
*/











