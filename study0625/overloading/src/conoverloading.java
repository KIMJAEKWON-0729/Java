class person{
	private int reginum;
	private int passnum;


person(int rnum, int pnum){
	reginum = rnum;
	passnum = pnum;
}
person(int rnum){
	reginum = rnum;
	passnum = 0;
	
}

void showpersonalinfo() {
	System.out.println("�ֹε�Ϲ�ȣ:"+reginum);
	
	if (passnum !=0) 
		System.out.println("���ǹ�ȣ:" + passnum + '\n');
	else
		System.out.println("������ ������ ���� �ʽ��ϴ�.\n");
		
	}
}

public class conoverloading {
	public static void main(String[] args) {
		person jung  = new person(335577, 112233);
		
		//���� ���»��
		person hong = new person(775544);
		
		jung.showpersonalinfo();
		hong.showpersonalinfo();
	}
	}

