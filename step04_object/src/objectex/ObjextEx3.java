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

//Setter & Getter: 필드(멤버변수)하나당 하나씩 값을 대입하는 setter와 그 값을 리턴하는 getter
public class ObjextEx3 {
	public static void main(String[] args) {
		Member ob = new Member();
		ob.setName("강호동");
		ob.setAge(25);
		ob.setTall(175.4);
		
		System.out.println("이름 :"+ob.getName());
		System.out.println("나이 :"+ob.getAge());
		System.out.println("이름 :"+ob.getTall());
		
	}

}
