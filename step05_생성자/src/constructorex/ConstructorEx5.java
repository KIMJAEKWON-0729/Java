package constructorex;

import java.util.Scanner;

/*
[����] �����ڿ��� �μ��� �Է¹޾� ū���� �������� ����Ͻÿ�
show()�޼��忡�� maxValue(), minValue()�� ȣ���Ұ�

Ŭ������ : Max
-a:int
-b:int
+Max()           <--�Է¹ޱ�
+maxValue():int  <--ū�� ����(���׿����� �̿�)
+minValue():int  <--������ ����
+show():void     <--���

[���]
Input a: 5
Input b: 3

ū�� : 5
������: 3
 */
class Max{
	private int a;
	private int b;
	
	public Max(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a :");  a=sc.nextInt();
		System.out.print("Input b :");  b=sc.nextInt();
		sc.close();
	}
	public int maxValue(){
		return (a>b)?a:b;
	}
	public int minValue(){
		return (a<b)?a:b;
	}
	public void show(){
		System.out.println("ū�� : " + maxValue());
		System.out.println("������ : " + minValue());
	}	
}
public class ConstructorEx5 {
	public static void main(String[] args) {
		new Max().show();
	}
}












