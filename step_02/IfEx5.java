package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
	int score;
	System.out.print("������ �Է��ϼ���:");score = Integer.parseInt(br.readLine());
		if (score >= 65) { 
			System.out.println("�հ�");
			System.out.println("����� ������ "+score+"���Դϴ�");
			
		}//������� �ϳ��� ���ü� �ִµ� ���̸� ��ȣ
		else {
			System.out.println("����� ������"+score+"���̸� ������ȸ�� ");//Ʋ�����
			
		}
			
		}
}