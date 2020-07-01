package objectex;

import java.util.Scanner;

/*
 -base:int
 -top:int
 -height:int

 +setTrapezoid(base:int, top:int, height:int):void 
 +calc():double                     <--- ��ٸ��� ���̸� ���ؼ� ����
 +toString():String


 ��ٸ��� ���� = (�غ� + ����)*����/2
*/

class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public Trapezoid() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input base:"); base = sc.nextInt();
		System.out.print("input top:"); top = sc.nextInt();
		System.out.print("input height:"); height = sc.nextInt();
		
		
	}
	public int cal() {
		return ((base+top) *height)/2;
	}
	public void display() {
		System.out.println("��ٸ��� ����"+cal());
	}
	
	
}
public class ObjectTest5
{
	public static void main(String[] args) 
	{
        //Trapezoid Ŭ������ ��ü�� ���� ��ٸ����� ���̸� ���Ͻÿ�
		//�غ� 3, ���� 4, ���� 5  ������ �ڵ带 �ϼ��Ͻÿ�
		Trapezoid ob=new Trapezoid();
		ob.display();
		

	}
}
/*
��ٸ��� ����:17.5
*/