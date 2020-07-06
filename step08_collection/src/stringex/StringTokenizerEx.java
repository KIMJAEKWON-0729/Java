package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "학교,집,도서관,카페#술집$게임방,노래방";
		String[] value = str.split(",");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
			
		}
		//사용예 주민등록번호 앞자리 뒷자리 
		
		
		
		
		/*
		StringTokenizer ob = new StringTokenizer(str,",#$");//구분자 설정
		System.out.println("파싱할 문자열의 수:"+ob.countTokens()+"개");
		
		while(ob.hasMoreTokens()) {
			System.out.println(ob.nextToken());
		}*/
	}
}
