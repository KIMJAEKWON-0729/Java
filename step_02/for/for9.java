package ForEx;
/* 
[����] continue ǥ�İ� ����for���� �̿��ؼ� ���Ͻÿ�
1-50������ �Ҽ� (1�� �ڱ��ڽ� �̿��� ����� ���� �ʴ� ��)

2 3 5 7 11 .....47
*/
public class for9 {
	public static void main(String[] args) {
	for (int i = 2; i <=50; i++) {
		boolean check = false;
		
		for (int j = 2; j <i; j++) {
			if(i%j==0)
			check=true;
			
		}
		if(check == false) {
			System.out.print(i+" ");
			}
		}	
	
	}
} 