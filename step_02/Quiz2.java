package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int a;
	int b;
	System.out.print("���ڸ� �Է��ϼ���:");a = Integer.parseInt(br.readLine());
	System.out.print("���ڸ� �Է��ϼ���:");b = Integer.parseInt(br.readLine());
	
		int rs=(a>b)?a:b;
		System.out.println(rs);
		
		
		}
}