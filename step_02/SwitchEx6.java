package Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* [����] �ֿܼ��� �����͸� �Է¹޾� ������ ���� ����Ͻÿ�
������ �Է��Ͻÿ�: circle    <--- rectangle, triangle
���� �����ϼ̽��ϴ�
    
������ �Է��Ͻÿ�: rectangle
�簢���� �����ϼ̽��ϴ�

������ �Է��Ͻÿ�: triangle
�ﰢ���� �����ϼ̽��ϴ�    
 
������ �Է��Ͻÿ�: xyz
����!!
  
*/
public class SwitchEx6 {
	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(args[0]);
		
		switch (a%3) {
		case 0: System.out.println(a+"�� 3�� ����Դϴ�");	
			break;
		case 1: System.out.println(a+"�� 3�� ������ƴմϴ�");	
			break;

		}
		
		
	}
		
}























