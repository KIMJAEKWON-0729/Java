package objectex;

class User{
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setPerson(String na, int a , int b, int c) {
		name = na;
		k = a;
		e= b;
		m= c;
		
	}
	public int gettotal() {
		return k+e+m;
	}
	public String getuser(){
		return name;
		
	}
	public void viewUser() {
		System.out.println("���� �̸��� "+name+"�̸� ������ "+gettotal()+" ���Դϴ�");
	}
}
	



public class ObjextEx2 {
	public static void main(String[] args){
		User uu = new User();
		uu.setPerson("��ȣ��", 2, 3, 4);
		uu.viewUser();
		
	}
}
