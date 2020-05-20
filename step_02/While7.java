package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[문제] do-while을 이용해서 반복처리하시오
다시할까요(Y/y) : Y
다시할까요(Y/y) : y
다시할까요(Y/y) : n

** 수고하셨습니다**
*/
public class While7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ck;
		do {
			System.out.println("다시 할까요?(Y/n)");ck = br.readLine().charAt(0);
			
		} while (ck =='Y'||ck=='y');
		System.out.println("고생하셨습니다");
	}

}
