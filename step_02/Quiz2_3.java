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
	
	System.out.println("이름을 입력하세요:");name = br.readLine();
	System.out.println("성별을 입력하세요:");gender = br.readLine().charAt(0);
	System.out.println("나이를 입력하세요:");age = Integer.parseInt(br.readLine());
	System.out.println("키를 입력하세요:");tall = Double.parseDouble(br.readLine());
	String rs=(gender=='M')?"남자":"여자";
	
	
	System.out.println("나이:"+name);
	System.out.println("성별:"+rs);
	System.out.println("나이:"+age);
	System.out.println("신장:"+tall);
	
	}
}


		
	