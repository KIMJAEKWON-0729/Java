package step03_method;

// Call by value: ���� �����ϴ� ���
public class MethodEx3 {
	public static void show1(){
		 System.out.println("Helo World");		;//return �������� 	
	}
	public static void show2(char a,int b){
		System.out.println("type:"+a);
		System.out.println("code:"+25);
	}
	public static void show3(String a){
		 System.out.println("�ᱣ��:"+a);		;//return �������� 	
	}
	public static void show4(float a , float b , float c){
		 System.out.printf("�ᱣ��:%.1f\n",(a+b+c)/3);		;//return �������� 	
	}
	
		
	
	
	
	public static void main(String[] args) {
		
		show1();
		show2('A',25);
		show3("Good Morning");
		show4(15,45,73);
			}

}
