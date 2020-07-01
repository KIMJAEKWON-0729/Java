package Inheritance;

//기본생성자, 인자 2개받는생성자, to String()추가
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
		return "나의 이름은" + name + " phone=" + phone ;
	}
	
	
}	
