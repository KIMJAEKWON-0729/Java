package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {
	public static void main(String[] args) throws NumberFormatException, Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int score;
		System.out.println("������ �Է��Ͻÿ�:");score = Integer.parseInt(br.readLine());
		String rs=(score>=60)?"�հ��Դϴ�":"���հ��Դϴ�";
		System.out.println(rs);
		
		char A;
		System.out.println("�빮�ڸ� �Է��ϼ���");A  = (char)(br.readLine()).charAt(0);
		System.out.println((char)(A+32));
	
	}

}
