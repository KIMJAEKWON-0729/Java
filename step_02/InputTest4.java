package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {
	public static void main(String[] args) throws NumberFormatException, Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int score;
		System.out.println("점수를 입력하시오:");score = Integer.parseInt(br.readLine());
		String rs=(score>=60)?"합격입니다":"불합격입니다";
		System.out.println(rs);
		
		char A;
		System.out.println("대문자를 입력하세요");A  = (char)(br.readLine()).charAt(0);
		System.out.println((char)(A+32));
	
	}

}
