package test;

/* 클래스명:Emp
 * 
 *-name:String
 *-tall:double
 *-weight:int
 *-gender:char   
 *
 *+setEmp(name:String,tall:double,weight:int,gender:char):void
 *+getEmp():String
 * 
 */
public class Emp {
	private String name;
	private double tall;
	private int weight;
	private char gender;

	public void setEmp(String name, double tall, int weight, char gender) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
	}
	public String getEmp() {
		String gen;
		if(gender == 'M')	gen = "남자";
		else if(gender == 'F')	gen = "여자";
		else			gen = "";
		return name+"의 키는"+tall+"cm이고"+weight+gen+"입니다";
		
	}
	
	

	
	
}












