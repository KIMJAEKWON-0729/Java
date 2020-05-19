package oper;

/*  ASCII 코드는 7비트 2의 7승 128까지 기본적으로 아스키 코드 값으로 숫자 1은 49 
 * 숫자0은 48 대문자 A 는 65 소문자 a는 97 띄어쓰기 " "는 32  49 65 97 32 'A'+32 = 97 무슨말이지 
 * A(1000001) : 65
 * a: 97
 * 1: 49
 * 공백 : 32
 *  */
 
public class AsciiTest {
	public static void main(String[] args) {
	System.out.println('A'+":"+(int)'A');	
	System.out.println('a'+":"+(int)'a');	
	System.out.println(65+":"+(char)65);	
	System.out.println(97+":"+(char)97);	
	System.out.println(65+":"+(char)65);	
	System.out.println("A"+"B");	
	
	}

}
// ""랑 ''쓸때랑 역할이 달라진다  "A"+"B" = AB 'A'+'B' = 131 String str = "HELLO"  str은 변수 HELLO는 상수 
//5 % 3->2 %는 나머지 