package constructorex;

import java.util.Scanner;

/*
[문제] 생성자에서 두수를 입력받아 큰수와 작은수를 출력하시오
show()메서드에서 maxValue(), minValue()를 호출할것

클래스명 : Max
-a:int
-b:int
+Max()           <--입력받기
+maxValue():int  <--큰값 리턴(삼항연산자 이용)
+minValue():int  <--작은값 리턴
+show():void     <--출력

[출력]
Input a: 5
Input b: 3

큰수 : 5
작은수: 3
 */
class Max{
	private int a;
	private int b;
	
	public Max(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a :");  a=sc.nextInt();
		System.out.print("Input b :");  b=sc.nextInt();
		sc.close();
	}
	public int maxValue(){
		return (a>b)?a:b;
	}
	public int minValue(){
		return (a<b)?a:b;
	}
	public void show(){
		System.out.println("큰수 : " + maxValue());
		System.out.println("작은수 : " + minValue());
	}	
}
public class ConstructorEx5 {
	public static void main(String[] args) {
		new Max().show();
	}
}












