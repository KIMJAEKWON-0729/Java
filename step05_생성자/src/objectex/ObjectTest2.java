package objectex;

/*  Ŭ������ : Emp2
-name:String
-dept:String
-salary:int

+setEmp(name:String, dept:String,  salary:int):void
+printEmp():String
*/
class Emp2{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name,String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String printEmp() {
		return name+"�� "+dept+"�̸� "+salary+"���� �޿��� �޽��ϴ�";
	}
}
public class ObjectTest2 {
	public static void main(String[] args) {
		//Emp2Ŭ������ ob��ü�� �������� setEmp()�� ���� �����͸� �����Ѵ�
		//printEmp()�� ����Ѵ�
		Emp2 em=new Emp2();
		em.setEmp("��ȣ��", "������", 1520000);
		System.out.println(em.printEmp());
	}
}
/*
[���ȭ��]
��ȣ���� ������ ����̸� 1520000���� �޿��� �޽��ϴ�.
*/




