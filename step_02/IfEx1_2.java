package ifex;

public class IfEx1_2 {
	public static void main(String[] args) {
		int score = 105;
		if(score>100 || score<0) {
			System.out.println("�ý��ۿ���");
			return;//�����Լ��� ������ ����������
		}
		char grade = '\0';//�ʱ�ȭ�� �����Ҽ� ���� 
		if(score>=90 && score<=100) grade ='A';
		if(score>=80 && score<90) grade ='B';
		if(score>=70 && score<80) grade ='C';
		if(score>=60 && score<70) grade ='D';
		if(score>=0 && score<60) grade ='F';
		System.out.println("���� ������"+score+"���̰� ������"+grade+"�Դϴ�");
		}
}