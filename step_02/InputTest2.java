package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);// �ѱ� �ȱ����� �Ϸ��� reader���  �ϳ��� �˾Ƶ����� �ִ� 
		BufferedReader br = new BufferedReader(isr);
		int a;
		int b;
		System.out.println("���ڸ� �Է��Ͻÿ�:");a = Integer.parseInt(br.readLine());
		System.out.println("���ڸ� �Է��Ͻÿ�:");b = Integer.parseInt(br.readLine());
		System.out.println('a'+"+"+'b'+"="+(a+b));
	}

}
