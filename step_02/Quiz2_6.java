package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2_6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	float a;
	float b;
	char cal;
	System.out.print("���ڸ� �Է��ϼ���:");a = Integer.parseInt(br.readLine());
	System.out.print("���ڸ� �Է��ϼ���:");b = Integer.parseInt(br.readLine());
	System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/):");cal= (char)br.readLine().charAt(0);
	
	
		if (cal == '+') {
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if (cal =='-') {
			System.out.println(a+"-"+b+"="+(a-b));
			
		}
		else if (cal =='*') {
			System.out.println(a+"*"+b+"="+(a*b));
			
		}
		else if (cal =='/') {
			System.out.println(a+"/"+b+"="+(a/b));
			
		}
		else {
			System.out.println("error");
			
		}
			
		}
		
		
}