package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[����] do-while�� �̿��ؼ� �ݺ�ó���Ͻÿ�
�ٽ��ұ��(Y/y) : Y
�ٽ��ұ��(Y/y) : y
�ٽ��ұ��(Y/y) : n

** �����ϼ̽��ϴ�**
*/
public class While7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ck;
		do {
			System.out.println("�ٽ� �ұ��?(Y/n)");ck = br.readLine().charAt(0);
			
		} while (ck =='Y'||ck=='y');
		System.out.println("����ϼ̽��ϴ�");
	}

}
