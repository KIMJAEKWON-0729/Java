package Switch;
//switch ����(char, byte, short, int), ���ڿ�(String), long(�ȵ�)
//break �� ������ break �ִ� �������� ���������� 
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
