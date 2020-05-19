package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
	int score;
	System.out.print("점수를 입력하세요:");score = Integer.parseInt(br.readLine());
		if (score >= 65) { 
			System.out.println("합격");
			System.out.println("당신의 점수는 "+score+"점입니다");
			
		}//맞을경우 하나는 나올수 있는데 둘이면 괄호
		else {
			System.out.println("당신의 점수는"+score+"점이며 다음기회에 ");//틀릴경우
			
		}
			
		}
}