package step03_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Call by value: ���� �����ϴ� ���
public class MethodEx10 {
	public static int rectangle(int i, int j) {
		return  i*j;
	}
	public static double tri(int i, int j) { 
		return i*j/2;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		while (true){
			System.out.println("��ȣ�� ����ּ��� 1.�簢�� 2.�ﰢ��,3.����");a = Integer.parseInt(br.readLine());
			
			  switch (a) { 
			  case 1: System.out.print("�����Է�:");
			  	int i =Integer.parseInt(br.readLine()); 
			  	System.out.print("�����Է�:"); 
			  	int j =	Integer.parseInt(br.readLine()); 
			  	System.out.println("����"+rectangle(i, j));
			  	break; 
			  case 2: System.out.print("�����Է�:");
			  	int x =Integer.parseInt(br.readLine()); 
			  	System.out.print("�����Է�:"); 
			  	int y =Integer.parseInt(br.readLine()); 
			  	System.out.println("����"+tri(x,y)); 
			  	break;
			  case 3:
			  System.out.println("**���α׷��� �����մϴ�**");
				System.exit(0);
			  
			 
			}
			
		} 	
	}
}
	



