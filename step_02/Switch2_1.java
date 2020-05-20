package Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* [문제[]
 * 숫자를 입력하시오 :5
 * 5는 홀수 입니다
 */

public class Switch2_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a;
		System.out.print("숫자를 입력하시오:");a = Integer.parseInt(br.readLine());
		switch (a%2) {
		case 1:
			System.out.println(a+"는 홀수입니다");
			break;
		case 0:
			System.out.println(a+"는 짝수입니다");
			break;

		default:
			break;
		}
	}

}
