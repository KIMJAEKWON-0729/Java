package objectex;

class Person{
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String na, int a , float s ) {
		name = na;
		age = a;
		score = s;
		
	}
	public void viewPerson() {
		System.out.println("�̸� :" + name);
		System.out.println("���� :" + age);
		System.out.println("���� :" + score);
		
	}
	
	
}
public class ObjextEx1 {
	public static void main(String[] args) {
		Person ob1 = new Person();// new Person(): ������ heap������ �޸𸮸� �Ҵ��ϴ� instance
		ob1.setPerson("������", 2, 73.5f);// ��ü(Object) = field + method
		ob1.viewPerson();
		
		Person ob2 = new Person();
		ob2.setPerson("�ε鷹", 23, 88.3f);
		ob2.viewPerson();
	}
	}

