
/*
 [����1]
String a = "100";
String b = "200";
a ��  b�� ���� ����ȯ�ؼ� �μ��� ���� ���Ͻÿ�

--���--
100 * 200 = 20000 

*/



public class Test3 {
	public static void main(String[] args) {
		//1��
		String a = "100";
		String b = "200";
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		System.out.println(a1+"*"+b1 +"="+(a1*b1));
		//2��
		int money =  65430;
		int man = money/10000;
		int thou = (money-60000)/1000;
		int hun = (money-65000)/100;
		int ten = (money-65400)/10;
		System.out.println("��:"+man);
		System.out.println("õ:"+thou);
		System.out.println("��:"+hun);
		System.out.println("��:"+ten);
		
				
		
		//3��
		double salary = 1500000;
		double pay = 55000;
		double tax = salary*0.1;
		System.out.println("�Ǽ��ɾ�:"+(salary+pay-tax)+"��");
		//4��
		
		String name = "��ȿ�� ";
		String department = "���ߺ�";
		String position = "�븮";
		int sal  = 1500000;
		System.out.println("�̸�:"+ name);
		System.out.printf("�μ�: %s\n",department);
		System.out.print("���� :"+position+"\n�޿�:"+sal+"��\n");
	
		//5��
		String Name = "�ε鷹";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		double avg = (kor+eng+mat)/3.0;
		System.out.println("�̸�:"+Name);
		System.out.println("�հ�����:"+(kor+eng+mat)+"��");
		System.out.printf("�������:%.1f",avg);
	
		
		float base = 10f;
		float height = 3f;
		float area = (base * height)/2f;
		System.out.printf("\n�ﰢ�� ���� = %.2f",area);
	}

}






