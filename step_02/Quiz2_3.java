package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String name;
	char gender;
	int age;
	Double tall;
	
	System.out.println("�̸��� �Է��ϼ���:");name = br.readLine();
	System.out.println("������ �Է��ϼ���:");gender = br.readLine().charAt(0);
	System.out.println("���̸� �Է��ϼ���:");age = Integer.parseInt(br.readLine());
	System.out.println("Ű�� �Է��ϼ���:");tall = Double.parseDouble(br.readLine());
	String rs=(gender=='M')?"����":"����";
	
	
	System.out.println("����:"+name);
	System.out.println("����:"+rs);
	System.out.println("����:"+age);
	System.out.println("����:"+tall);
	
	}
}


		
	