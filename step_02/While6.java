package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While6 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num;
	do {
		System.out.println("점수를 입력하시오:");num = Integer.parseInt(br.readLine());
		
		
	} while (num<0||num>100);
	System.out.println("당신의 점수는 "+num+"점입니다");
	
}
}
