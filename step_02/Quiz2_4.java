package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	char a ;
	
	System.out.print("문자를 입력하세요:");a =(char)br.readLine().charAt(0);
	if(a>= 65 && a<=90) {
		System.out.println((char)(a+32));
		
	}
	else if ((a<=97) && (a<=122)) {
		System.out.println((char)(a-32));
		
	}
	else {
		System.out.println("입력데이터오류");
		
	}
	}
}


		
	