package objectex;

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
	
	
}
public class ObjectTest8 {
	public static void main(String[] args) {
		// Register타입의 객체 ob를 만들어서 
		// setRegister로 abcd,1234,이순신,19911212,010-1234-5678를 대입하시오
		Register ob=new Register();
		

	}
}
/* 이름 : 이순신
 * 생년월일 : 1991년 12월 12일
 * 연락처:010-1234-5678
 * ID는 abcd이고 password는 1234입니다.
 * 
 * 
 * [참고]
	String str="901210";
	System.out.println(str.substring(2, 4));   // 12
	System.out.println(str.substring(2));      // 1210
 */









