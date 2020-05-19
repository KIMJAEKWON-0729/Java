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
	System.out.print("숫자를 입력하세요:");a = Integer.parseInt(br.readLine());
	System.out.print("숫자를 입력하세요:");b = Integer.parseInt(br.readLine());
	System.out.println("연산자를 입력하세요(+,-,*,/):");cal= (char)br.readLine().charAt(0);
	
	
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