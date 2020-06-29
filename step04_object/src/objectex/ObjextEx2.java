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
		System.out.println("나의 이름은 "+name+"이며 총점은 "+gettotal()+" 점입니다");
	}
}
	



public class ObjextEx2 {
	public static void main(String[] args){
		User uu = new User();
		uu.setPerson("강호동", 2, 3, 4);
		uu.viewUser();
		
	}
}
