package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {
	public static void main(String[] args)  throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String id;
		Double kor ,eng ,math;
		
		System.out.println("���̵� �Է��Ͻÿ� ");id=br.readLine();
		
		System.out.println("���������� �Է��Ͻÿ�:");kor = Double.parseDouble(br.readLine());
		
		System.out.println("���������� �Է��Ͻÿ�:");eng = Double.parseDouble(br.readLine());
		
		System.out.println("���������� �Է��Ͻÿ�:");math = Double.parseDouble(br.readLine());
		
		System.out.println("abcd���� ������"+(kor+eng+math)+"���Դϴ�");
		
		System.out.printf("����� %.2f���Դϴ�",(kor+eng+math)/3);
		
	}

}
