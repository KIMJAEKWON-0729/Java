package arrayex;

public class ArrayEx1 {
	public static void main(String[] args) {
		int arr []; //�迭����
		arr = new int[5];// �޸��Ҵ�(5���� int�� ������)
		arr[0] = 25;
		arr[1] = 36;
		arr[2] = 15;
		arr[3] = 19;
		arr[4] = 40;
		//System.out.println("�迭�� ���� = "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("\n jdk 1.5 �̻󿡼� ������ foreach�� �̿�");
		for(int n:arr) {
			System.out.println(n);
		}
		System.out.println("\n Ȧ����° �����͸� ���");
		for (int i = 0; i < arr.length; i++) {
			if(i%2 !=0) {
			System.out.println(arr[i]);
			
		}
	}
		}
}
