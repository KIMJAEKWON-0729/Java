package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int score;
		System.out.println("점수를 입력하세요:"); score = Integer.parseInt(br.readLine());
		char grade;
		if (score >= 95) {
			System.out.println (grade = 'A');
		}
		else if (score>=80) {
			System.out.println(grade = 'B');
		}
		else if (score>=70) {
			System.out.println(grade ='C');
			
		}
		else if (score>=60) {
			System.out.println(grade = 'D');
		}
		else {
			System.out.println(grade = 'F');
		}
		
		
		System.out.println("당신의 점수는 "+score+"점이며 학점은"+grade+"입니다");	
		}
			
		}
			