package emp;

/* VO(Value Object), Entity, DTO(Data Transfer Object), Bean
:����Ÿ�� ��üȭ ���Ѽ� ������ �������� ���� Ŭ���� 

����Ʈ������, ����3���޴� ������, getter&setter*/
public class Empvo {
	private String ename;
	private String dept;
	private int salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public Empvo(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	

}
