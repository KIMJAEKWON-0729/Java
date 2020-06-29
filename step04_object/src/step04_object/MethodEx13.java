package step04_object;

public class MethodEx13 {
	public static String toString(String a, int b, double c) {
		return "나의 이름은 "+a+"입니다 \n 나의 나이는" +b+"세이고 키는 "+c+"cm입니다";
		
	}
	public static void main(String[] args) {
		System.out.print(toString("이순신", 25, 175.3));
	}

}
