package Inheritance;

//�⺻������, ���� 2���޴»�����, to String()�߰�
public class Emp {
	private String name;
	private String phone;

	public Emp() {
		super();
	}

	public Emp(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "���� �̸���" + name + " phone=" + phone ;
	}
	
	
}	
