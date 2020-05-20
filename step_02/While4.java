package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int dan;
		int cnt = 0;
		System.out.print("단을 입력하세요:");dan =Integer.parseInt(br.readLine());
		while (cnt<10) {
			int num = dan * ++cnt;
			System.out.println(dan+"*"+cnt+"="+num);
			
		}
	}
}
