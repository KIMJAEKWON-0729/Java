package objectex;

/* 클래스명 : CellPhone
 * -model:String 
 * -number:String 
 * -chord:int             ==> 화음
 * 
 * +CellPhone()
 * +CellPhone(model:String, number:String, chord:int)
 * +getter & setter
 * +toString():String
 */
class CellPhone{
	private String model;
	private String number;
	private int chord;
	
	
}
public class ObjectTest4 {
	public static void main(String[] args) {
		// CellPhone의 객체생성후  setter를 이용해서 
		// LG-F120L, 010-111-1234, 60을 입력
		// toString()으로 출력
		// [출력]  
		// 모델명 : LG-F120L
		// 번호 : 010-111-1234
		// 화음 : 60화음
		CellPhone cp = new CellPhone();
		
		
		//------------------------------------------------------------------------
		// CellPhone의 객체를 생성하면서 SAM-S01, 010-900-9898, 80으로 초기화
		// getter를 이용해서 출력
		// [출력]
		// 나의 핸드폰 사양 : 모델명 SAM-S01/010-900-9898/80화음
		
	}
}






