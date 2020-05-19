package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);// 한글 안깨지게 하려고 reader사용  하나씩 알아들을수 있다 
		BufferedReader br = new BufferedReader(isr);
		int a;
		int b;
		System.out.println("숫자를 입력하시오:");a = Integer.parseInt(br.readLine());
		System.out.println("숫자를 입력하시오:");b = Integer.parseInt(br.readLine());
		System.out.println('a'+"+"+'b'+"="+(a+b));
	}

}
