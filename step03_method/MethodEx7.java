package step03_method;

// Call by value: 값을 전달하는 방식
public class MethodEx7 {
	public static int sum(int x, int y){
		 return x+y;		//return 빠져있음 	
	}
	public static int sub(int x,int y){
		return x-y;
	}
	public static int multi(int x, int y){
		 return x*y		;//return 빠져있음 	
	}
	public static double divi(int x, int y){
		 return (double)x/y;		//return 빠져있음 	
	}
	
	public static void main(String[] args) {
		int x =5, y = 3;
		System.out.printf("두수의합 : %d\n 두수의차 :%d\n 두수의 곱:%d\n 두수의 몫: %.2f\n",
				sum(x,y),sub(x,y),sub(x,y),divi(x,y));
		
	}
}
