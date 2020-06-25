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
	System.out.println("주민등록번호:"+reginum);
	
	if (passnum !=0) 
		System.out.println("여권번호:" + passnum + '\n');
	else
		System.out.println("여권을 가지고 있지 않습니다.\n");
		
	}
}

public class conoverloading {
	public static void main(String[] args) {
		person jung  = new person(335577, 112233);
		
		//여권 없는사람
		person hong = new person(775544);
		
		jung.showpersonalinfo();
		hong.showpersonalinfo();
	}
	}

