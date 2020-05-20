package Switch;

/* [문제] args로 데이터를 입력받아 다음과 같이 출력하시오
$ java SwitchEx4 홍길동 A
  홍길동은 A학점 입니다
  등급은 Gold입니다
  
 A는 Gold
 B,C는 Silver
 나머지는 Bronze    
*/
public class SwitchEx4 {
	public static void main(String[] args) {
		String name = args[0];
		char grade = args[1].charAt(0);
		String lev;
		switch (grade) {
		case 'A': lev = "Gold";
			break;
		case 'B': lev = "Silver";
			break;
		case 'C': lev = "Silver";
			break;

		default:lev = "Bronze";
			break;
		}
		System.out.println(name+"은 "+grade+"학점입니다");
		System.out.println("등급은"+lev+"입니다");
		
	}
}






















