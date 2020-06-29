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
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("점수 :" + score);
		
	}
	
	
}
public class ObjextEx1 {
	public static void main(String[] args) {
		Person ob1 = new Person();// new Person(): 실제로 heap영역에 메모리를 할당하는 instance
		ob1.setPerson("개나리", 2, 73.5f);// 객체(Object) = field + method
		ob1.viewPerson();
		
		Person ob2 = new Person();
		ob2.setPerson("민들레", 23, 88.3f);
		ob2.viewPerson();
	}
	}

