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
public class SwitchEx5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a;
		System.out.println("������ ����ּ���:");a = br.readLine();
		
		switch (a) {
		case "circle":
			System.out.println("���� �����ϼ̽��ϴ�");
			break;
		case "rectangle":
			System.out.println("�簢���� �����ϼ̽��ϴ�");
			break;
		case "triangle":
			System.out.println("�ﰢ���� �����ϼ̽��ϴ�");
			break;

		default:
			System.out.println("����!!");
			break;
		}
		
	}
}






















