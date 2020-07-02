package staticex;

class BankAccount{
	public int year;
	public String name;
	public int money;
	public static double rate;
	
	public BankAccount(int year, String name, int money, double r){
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate = r;
		
	}
	public static void setRate(double r) {
		//��ȿ���˻�
		if(r<0.02||r>0.12) {
			System.out.println("�ݸ� ����");
			System.exit(0);
		}
		rate = r;
	}
	public void view() {
		System.out.println(year+"\t"+name+"\t" +money+"\t" +rate);
	}
	
}
public class StaticEx2{
	public static void main(String[] args) {
		System.out.println("����� �ݸ�");
		BankAccount ob1 = new BankAccount(1994, "kim", 1000, 0.07);
		BankAccount ob2 = new BankAccount(1998, "lee", 1000, 0.12);
		BankAccount ob3 = new BankAccount(2005, "park", 1000, 0.05);
		
		System.out.println("\n ** 2005 �� ������ �ݸ� **");
		ob1.view();
		ob2.view();
		ob3.view();

		System.out.println("\n ** 0.04�� ������ �ݸ�**");
		BankAccount.rate = 0.14;
		ob1.view();
		ob2.view();
		ob3.view();
	}
}

//class Test{
//	int x;
//	int y;
//	static int z;
//	static {
//		System.out.println("static �� �ʱ�ȭ ����");
//	}
//	public Test(int x, int y , int z1) {
//		this.x = x;
//		this.y = y;
//		z = z1;
//		System.out.println("��ü�� �ʱ�ȭ ����");
//	}
//	public void view() {
//		System.out.println(x+" "+ y+" "+z);
//	}
//}
//
//public class StaticEx2 {
//	public static void main(String[] args) {
//		Test ob1 = new Test(1,2,3);
//		Test ob2 = new Test(4,5,6);
//		ob1.view();
//		ob2.view();
//	}
//}
