package animal;

import java.util.Scanner;

//�������ε�(Dynamic binding):�������(run time)�� ȣ��޼��带 �����Ѵ� 
//						�ڵ����� ���κ� ���ϼ� �ִ� 
public class AnimalMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;//�θ��� �������� 
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\nSelect:");
			n = sc.nextInt();
			switch(n) {
			case 1:ani =new Dog(); break;
			case 2:ani=new Cat(); break;
			case 3:ani=new Duck();break;
			case 4:ani=new Fish(); break;
			default:System.out.println("�۾��� �����մϴ�");
			sc.close();
			System.exit(0);
			
			}
			ani.speak();
			ani.walk();
		}
	}

}
