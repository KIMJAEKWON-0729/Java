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
	public CellPhone() {
		super();
	}
	public CellPhone(String model, String number, int chord) {
		super();
		this.model = model;
		this.number = number;
		this.chord = chord;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getChord() {
		return chord;
	}
	public void setChord(int chord) {
		this.chord = chord;
	}
	@Override
	public String toString() {
		return "모델명 :" + model + "\n번호:" + number + "\n화음 :" + chord + "화음";
	}
	
	
	
	
	
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
		cp.setModel("LG-F120L");
		cp.setNumber("010-111-1234");
		cp.setChord(60);
		System.out.println(cp.toString());
		
		
		CellPhone cp2 = new CellPhone("SAM-S01","010-900-9898",80);
		System.out.print("모델명 :"+cp2.getModel()+"/");
		System.out.print(cp2.getNumber()+"/");
		System.out.print(cp2.getChord()+"화음");
		//------------------------------------------------------------------------
		// CellPhone의 객체를 생성하면서 SAM-S01, 010-900-9898, 80으로 초기화
		// getter를 이용해서 출력
		// [출력]
		// 나의 핸드폰 사양 : 모델명 SAM-S01/010-900-9898/80화음
		
	}
}






