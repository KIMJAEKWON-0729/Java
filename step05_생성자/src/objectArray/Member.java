package objectArray;

/* 클래스명:Member
 -eno:int
 -ename:String
 -dept:String 
 
 +Member()
 +Member(eno:int,ename:String,dept:String)
 +view():void    --출력
*/
public class Member {
	private int eno;
	private String ename;
	private String dept;
	
	public Member() {
	}
	public Member(int eno, String ename, String dept) {

		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
	}
	public void view() {
		System.out.println(eno + "번 사원 " + ename + "은 " + dept + "입니다.");
	}
}





