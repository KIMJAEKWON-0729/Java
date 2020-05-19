package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int score ;
	System.out.print("숫자를 입력하세요:");score = Integer.parseInt(br.readLine());
	if(score>100 || score<0) {
		System.out.println("오류!!!");
		return;//메인함수를 무조건 빠져나간다
	}
	System.out.print(score);
	}
}


		
	