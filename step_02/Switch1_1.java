package Switch;
//switch 정수(char, byte, short, int), 문자열(String), long(안됨)
//break 가 없으면 break 있는 구문에서 빠져나간다 
public class Switch1_1 {
	public static void main(String[] args) {
		char check= 'G';
		switch (check) {
		case 'e':System.out.println("Excellent");	
			break;
		case 'E': System.out.println("good");
			break;
		case 'g': System.out.println("good");
			break;
		case 'G': System.out.println("good");
			break;
		
		default: System.out.println("bad");
			break;
		}
	}

}
