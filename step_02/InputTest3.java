package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {
	public static void main(String[] args)  throws NumberFormatException, IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String id;
		Double kor ,eng ,math;
		
		System.out.println("아이디를 입력하시오 ");id=br.readLine();
		
		System.out.println("국어점수를 입력하시오:");kor = Double.parseDouble(br.readLine());
		
		System.out.println("영어점수를 입력하시오:");eng = Double.parseDouble(br.readLine());
		
		System.out.println("수학점수를 입력하시오:");math = Double.parseDouble(br.readLine());
		
		System.out.println("abcd님의 총점은"+(kor+eng+math)+"점입니다");
		
		System.out.printf("평균은 %.2f점입니다",(kor+eng+math)/3);
		
	}

}
