package step03_method;

// Call by value: 값을 전달하는 방식
public class MethodEx8 {
	public static void draw(int a, char b) {
	for (int i = 1; i < a; i++) {
		System.out.println(b+" ");
		
		}  	
	}
	
		
	
	
		
	public static void main(String[] args) {
		draw(10,'#');	
		}

}
