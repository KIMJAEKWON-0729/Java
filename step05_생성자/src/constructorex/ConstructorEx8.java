package constructorex;

/*기본생성자(default constructor)
   -생성자가 구현되어 있지 않으면 자동 생성된다
   -생성자가 1개라도 구현되어 있으면 기본생성자는 자동생성이 안된다
*/
class Member{
	private String name="kim";
	private int age=20;
	
	public Member() { //default 생성자는 쓰던 안쓰던 만들어 두는 것이 좋다
		
	}
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void view() {
		System.out.println(name + "  " + age);
	}
}
public class ConstructorEx8 {
	public static void main(String[] args) {
		Member ob1=new Member("홍길동",27);
		ob1.view();
		
		Member ob2=new Member();
		ob2.view();
	}
}












