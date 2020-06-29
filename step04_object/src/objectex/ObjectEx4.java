package objectex;

class Employee{
	public String name;
	public String dept;
	public int pay;
	public double score;
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept = dept;
		this.pay = pay;
		this.score = score;
	}
	public String toString() {
		return "���� �̸��� "+name+" �̸� "+dept+"���� �ٹ��ϸ� �޿��� "+pay+"�� �Ի缺����"+score+"�Դϴ�";
	}
	
}


public class ObjectEx4 {
	public static void main(String[] args){
		// [����1] Employee ��ü ob�� �����ϰ� setter�� �̿��ؼ� �����͸� �����ÿ�
		// ����� ob.toString()�� �̿��ؼ� �ۼ��Ͻÿ�
		
		Employee ob = new Employee();
		ob.setName("�̼���");
		ob.setDept("���ߺ�");
		ob.setPay(1500000);
		ob.setScore(85.75);
		System.out.println(ob.toString());
		
		//[����2] ob.setEmployee()�� �̿��ؼ� �����͸� �����ÿ�
		//����� getter�� �̿��ؼ� �ۼ��Ͻÿ�
		ob.setEmployee("�ε鷹", "�渮��", 1400000, 75.34);
		System.out.println("��� �̸�:"+ob.getName());
		System.out.println("�ٹ� �μ�:"+ob.getDept());
		System.out.println("�޴� �޿�:"+ob.getPay());
		System.out.println("�Ի� ����:"+ob.getScore());
		
	}
}
/*
[����1]
�̸��� �̼����̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000�� �Ի缺���� 85.75�Դϴ�

[����2]
����̸� : ���޷�
�ٹ��μ� : �渮��
�޴±޿� : 1200000��
�Ի����� : 75.34��
*/
