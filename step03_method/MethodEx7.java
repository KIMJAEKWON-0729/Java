package step03_method;

// Call by value: ���� �����ϴ� ���
public class MethodEx7 {
	public static int sum(int x, int y){
		 return x+y;		//return �������� 	
	}
	public static int sub(int x,int y){
		return x-y;
	}
	public static int multi(int x, int y){
		 return x*y		;//return �������� 	
	}
	public static double divi(int x, int y){
		 return (double)x/y;		//return �������� 	
	}
	
	public static void main(String[] args) {
		int x =5, y = 3;
		System.out.printf("�μ����� : %d\n �μ����� :%d\n �μ��� ��:%d\n �μ��� ��: %.2f\n",
				sum(x,y),sub(x,y),sub(x,y),divi(x,y));
		
	}
}
