
class instcnt{
	static int instnum = 0;
	instcnt(){
		instnum++;
		System.out.println(instnum);
	}
}

public class classvar {
	public static void main(String[] args) {
		instcnt cnt1 = new instcnt();
		instcnt cnt2 = new instcnt();
		instcnt cnt3 = new instcnt();
	}

}
