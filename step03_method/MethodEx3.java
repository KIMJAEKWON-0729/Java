package step03_method;

// Call by value: 값을 전달하는 방식
public class MethodEx3 {
	public static void show1(){
		 System.out.println("Helo World");		;//return 빠져있음 	
	}
	public static void show2(char a,int b){
		System.out.println("type:"+a);
		System.out.println("code:"+25);
	}
	public static void show3(String a){
		 System.out.println("결괏값:"+a);		;//return 빠져있음 	
	}
	public static void show4(float a , float b , float c){
		 System.out.printf("결괏값:%.1f\n",(a+b+c)/3);		;//return 빠져있음 	
	}
	
		
	
	
	
	public static void main(String[] args) {
		
		show1();
		show2('A',25);
		show3("Good Morning");
		show4(15,45,73);
			}

}
