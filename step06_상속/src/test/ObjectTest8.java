package test;

/*  -(private) , +(public) , #(protected)
 *  
 *  클래스명 : Register
 *  -id:String    
 *  -pw:String              
 *  -name:String
 *  -birth:String
 *  -phone:String
 *  
 *  +setRegister(id:String,pw:String,name:String,birth:String,phone:String):void
 *  +viewRegister():void   --출력
 */
class Register{
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String phone;
	
	public void setRegister(String id, String pw, String name, String birth, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}
	public void viewRegister(){
		System.out.println("이름:"+name);
		System.out.println("연락처"+phone);
		System.out.println("생년월일:"+birth.substring(0,4)+"년"
									+birth.substring(4, 6)+"월"
									+birth.substring(6, 8)+"일");
		System.out.println("ID는"+id+"이고 password 는"+pw+"입니다");
	}



}
public class ObjectTest8 {
	public static void main(String[] args) {
		// Register타입의 객체 ob를 만들어서 
		// setRegister로 abcd,1234,이순신,19911212,010-1234-5678를 대입하시오
		Register ob = new Register();
		ob.setRegister("abcd", "1234", "이순신", "19911212", "010-1234-5424");
		ob.viewRegister();
		


	}
}
/* 이름 : 이순신
 * 생년월일 : 1991년 12월 12일
 * 연락처:010-1234-5678
 * ID는 abcd이고 password는 1234입니다.
 */



