package Inheritance;
//������ ����

class ParentEx{
	public ParentEx() {
		System.out.println("Parent class");
	}
}
class ChildEx extends ParentEx{
	public ChildEx() {
		System.out.println("Child class");
	}
}

public class InheritanceEx2 {
	public static void main(String[] args) {
		new ChildEx();
	}

}
