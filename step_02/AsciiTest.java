package oper;

/*  ASCII �ڵ�� 7��Ʈ 2�� 7�� 128���� �⺻������ �ƽ�Ű �ڵ� ������ ���� 1�� 49 
 * ����0�� 48 �빮�� A �� 65 �ҹ��� a�� 97 ���� " "�� 32  49 65 97 32 'A'+32 = 97 ���������� 
 * A(1000001) : 65
 * a: 97
 * 1: 49
 * ���� : 32
 *  */
 
public class AsciiTest {
	public static void main(String[] args) {
	System.out.println('A'+":"+(int)'A');	
	System.out.println('a'+":"+(int)'a');	
	System.out.println(65+":"+(char)65);	
	System.out.println(97+":"+(char)97);	
	System.out.println(65+":"+(char)65);	
	System.out.println("A"+"B");	
	
	}

}
// ""�� ''������ ������ �޶�����  "A"+"B" = AB 'A'+'B' = 131 String str = "HELLO"  str�� ���� HELLO�� ��� 
//5 % 3->2 %�� ������ 