package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int score ;
	System.out.print("���ڸ� �Է��ϼ���:");score = Integer.parseInt(br.readLine());
	if(score>100 || score<0) {
		System.out.println("����!!!");
		return;//�����Լ��� ������ ����������
	}
	System.out.print(score);
	}
}


		
	