
public class Test0623 {
	public static void main(String[] args) {
		// 1.���࿬���� Prefix ���࿬���� Postfix�� ǥ�����ּ���
		int num = 5;
		System.out.print((num++));
	
		System.out.print((num++));
		
		System.out.print((num));
		
		System.out.print((num--));
		
		System.out.print((num--));
		
		System.out.println((num));
		//2 Ư�� ������ �����Ҷ� �����ϴ�  �帧�� ����� ����� ǥ�����ּ���
		//if 
		
		//3 ������ �������� �϶� ����Ҽ� �ִ� ����� ǥ�����ּ��� 
		//switch else if
		
		//4.switch ���� ����Ͽ�  ���� (96)�ϋ� A+ 
		
		int score = 9;
		char grade = 0;
		
		switch (score) {
		case 9:grade = 'A';
			System.out.println("����� ������ "+grade+"�Դϴ�");
			break;

		default:
			break;
			
				
			}
		//5 while ���� do while���� �����ϼ���
		int n = 0;
		int nd= 0;
		while (n<5) {
			n++;
			System.out.println(n);
		
		
		}
		
		do {nd++;
		System.out.println(nd);
		
			
		} while (nd<5);
		//6 ������ 4�ܰ� 5���� ������ּ���
		
		for (int i = 4; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+ i*j);
				
			}
			
		}
		//7 continue ���� break���� ���̸� �������ּ���
		//continue���� Ư�� ������ �������� �ǳ� �ٿ��� �ݺ����� �����ϰ� break�� Ư�������� ������ while���� Ż���Ѵ�
		
		//8 �� ����� ���� ������ ���� ������ ������ �ݵ�� break���� �Բ� ����ؾ� �մϴ� ǥ���� �ۼ����ּ��� 
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}
	}
}
