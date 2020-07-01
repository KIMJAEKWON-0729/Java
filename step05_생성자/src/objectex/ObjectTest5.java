package objectex;

import java.util.Scanner;

/*
 -base:int
 -top:int
 -height:int

 +setTrapezoid(base:int, top:int, height:int):void 
 +calc():double                     <--- 사다리꼴 넓이를 구해서 리턴
 +toString():String


 사다리꼴 넓이 = (밑변 + 윗변)*높이/2
*/

class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public Trapezoid() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input base:"); base = sc.nextInt();
		System.out.print("input top:"); top = sc.nextInt();
		System.out.print("input height:"); height = sc.nextInt();
		
		
	}
	public int cal() {
		return ((base+top) *height)/2;
	}
	public void display() {
		System.out.println("사다리꼴 넓이"+cal());
	}
	
	
}
public class ObjectTest5
{
	public static void main(String[] args) 
	{
        //Trapezoid 클래스로 객체를 만들어서 사다리꼴의 넓이를 구하시오
		//밑변 3, 윗변 4, 높이 5  나머지 코드를 완성하시오
		Trapezoid ob=new Trapezoid();
		ob.display();
		

	}
}
/*
사다리꼴 넓이:17.5
*/