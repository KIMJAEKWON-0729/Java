package Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* [����[]
 * ���ڸ� �Է��Ͻÿ� :5
 * 5�� Ȧ�� �Դϴ�
 */

public class Switch2_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a;
		System.out.print("���ڸ� �Է��Ͻÿ�:");a = Integer.parseInt(br.readLine());
		switch (a%2) {
		case 1:
			System.out.println(a+"�� Ȧ���Դϴ�");
			break;
		case 0:
			System.out.println(a+"�� ¦���Դϴ�");
			break;

		default:
			break;
		}
	}

}
