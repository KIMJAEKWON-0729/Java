package ifex;

public class IfEx1_1 {
	public static void main(String[] args) {
		String id = "abcd";
		
		if (id == "abcd") { 
			System.out.println(id+"님이 로그인 하셨습니다");
			System.out.println("현재 포인트는 2500점입니다");
		}//맞을경우 하나는 나올수 있는데 둘이면 괄호
		System.out.println("**작업을 종료합니다");//틀릴경우
			
		}
}