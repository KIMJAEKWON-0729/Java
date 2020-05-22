package step03_method;

public class MethodEx1 {
	public static void view() {//view는 그냥 이름 지어준거 
		System.out.println("Hello");
		return;
	}
	public static void star() {// star도 마찬가지 
		System.out.println("*****");
		
	}
	public static void main(String[] args) {
		view();//view 가 위로 간다
		star();
	}

}
