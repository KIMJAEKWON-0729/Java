package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �ַܼ� ���� ����Ÿ�� �Է¹޴� ���
�̸��� �Է��Ͻÿ� : ��ȣ��
���� �̸��� ��ȣ���Դϴ�
*/

public class InputTest1 {
	public static void main(String[] args) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);// �ѱ� �ȱ����� �Ϸ��� reader���  �ϳ��� �˾Ƶ����� �ִ� 
	BufferedReader br = new BufferedReader(isr);
	
	String name = null;
	int age;
	double tall;
	float weight;
	char gender;
	System.out.print("�̸��� �Է��Ͻÿ�"); name =br.readLine();
	System.out.print("���̸� �Է��Ͻÿ�"); age =Integer.parseInt( br.readLine());// ���ڸ� ���� �������� integer.parseint�� ������� �Ѵ� 
	System.out.print("Ű���� �Է��Ͻÿ�"); tall =Double.parseDouble(br.readLine());
	System.out.print("ü�߸� �Է��Ͻÿ�"); weight=Float.parseFloat(br.readLine());
	System.out.print("������ �Է��Ͻÿ�"); gender=br.readLine().charAt(0);//0 �� 0��° ��
	
	
	System.out.println("���� �̸���"+ name +"�Դϴ�");
	System.out.println("���� �̸���"+ age +"���Դϴ�");
	System.out.println("���� Ű��"+ tall +"cm�Դϴ�");
	System.out.println("���� ü��"+ weight +"kg�Դϴ�");
	System.out.println("���� ������"+ gender+"���Դϴ�");
	}
	
	
	
}

// ���� Ctrl+1  �ľ� ���� ����Ŭ�� �ذ� 
//InputStreamReader / OutputStreamWriter�� ����Ʈ ��Ʈ������ ���� ��Ʈ������, �Ǵ� ���� ��Ʈ������ ����Ʈ ��Ʈ�������� ��ȯ�� �����ϴ� ����� ��Ʈ���̴�. 
//����Ʈ�� �о ������ ���� ���ڵ��� ���� ���ڷ� ��ȯ�ϴµ� ����Ѵ�.
//BufferedReader�� Enter�� ���� �ν��ϰ� ���� �����Ͱ� String���� �����Ǳ⶧���� �Է¹��� �����͸� �����ϴ� �۾��� �ʿ��Ұ�찡 �����ϴ�.
///���� readLine();�̶�� �޼��带 Ȱ���Ͻø� �Ǵµ���. ���⼭ ���������� �ΰ����� �ֽ��ϴ�. ù��°�� readLine()�� ���ϰ��� String���� �����Ǳ⿡ String�� �ƴ� �ٸ�Ÿ������ �Է��� �������� ����ȯ�� �� ���־���Ѵٴ� ���Դϴ�.
//�ι�°�� ����ó���� �� ���־���Ѵٴ� ���Դϴ�. readLine�� �Ҷ����� try & catch�� Ȱ���Ͽ� ����ó���� ���־ ������ �밳 throws IOException�� ���Ͽ� �۾��մϴ�.

