package constructorex;

/*�⺻������(default constructor)
   -�����ڰ� �����Ǿ� ���� ������ �ڵ� �����ȴ�
   -�����ڰ� 1���� �����Ǿ� ������ �⺻�����ڴ� �ڵ������� �ȵȴ�
*/
class Member{
	private String name="kim";
	private int age=20;
	
	public Member() { //default �����ڴ� ���� �Ⱦ��� ����� �δ� ���� ����
		
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
		Member ob1=new Member("ȫ�浿",27);
		ob1.view();
		
		Member ob2=new Member();
		ob2.view();
	}
}












