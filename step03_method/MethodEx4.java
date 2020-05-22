package step03_method;

public class MethodEx4 {
	public static void main(String[] args) {
		public static void show1(int a , char b, double c, float d){
			System.out.println(a+" "+b+" "+c+" "+d);//return 빠져있음 	
			}
			public static void show2(int a,int b,int c){
				System.out.println("합계="+(a+b+c));
			}
			public static void show3(float a,float b,float c){
				System.out.printf("합계=%.2f\n",(a+b+c)/3);
			}	
			public static void show4(float a,float b,float c){
				if (((a+b+c)/3)>60) {
					System.out.printf("합격");
				}
				else {
					System.out.println("불합격");
				}
				
			}	
			
			
			
			public static void main(String[] args) {
				
				show1(10,'A',10.4,100.3f);
				show2(95,85,73);
				show3(95,85,73);
				show4(35,25,13);
			}
	}

}
