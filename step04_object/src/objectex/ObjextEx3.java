package objectex;

class Member{
	public String name;
	public int age;
	public double tall;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	
	
}

//Setter & Getter: �ʵ�(�������)�ϳ��� �ϳ��� ���� �����ϴ� setter�� �� ���� �����ϴ� getter
public class ObjextEx3 {
	public static void main(String[] args) {
		Member ob = new Member();
		ob.setName("��ȣ��");
		ob.setAge(25);
		ob.setTall(175.4);
		
		System.out.println("�̸� :"+ob.getName());
		System.out.println("���� :"+ob.getAge());
		System.out.println("�̸� :"+ob.getTall());
		
	}

}
