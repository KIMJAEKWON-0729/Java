package Switch;

/* [����] args�� �����͸� �Է¹޾� ������ ���� ����Ͻÿ�
$ java SwitchEx4 ȫ�浿 A
  ȫ�浿�� A���� �Դϴ�
  ����� Gold�Դϴ�
  
 A�� Gold
 B,C�� Silver
 �������� Bronze    
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
		System.out.println(name+"�� "+grade+"�����Դϴ�");
		System.out.println("�����"+lev+"�Դϴ�");
		
	}
}






















