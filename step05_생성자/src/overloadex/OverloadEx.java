package overloadex;

//�����ε�: �����̸��� �޼��带 ������ �����ϴ°�
public class OverloadEx {
	int a=20;
	int b=15;
	
	public int max() {
		return (a>b)?a:b;
	}
	public int max(int a, int b) {
		return (a>b)?a:b;
	}
	public char max(char a, char b) {
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		OverloadEx ob=new OverloadEx();
		System.out.println("ū��:" + ob.max());
		System.out.println("ū��:" + ob.max(30,50));
		System.out.println("ū��:" + ob.max('Z','B'));
	}
}















