package test;

/* Ŭ������:Emp
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
		if(gender == 'M')	gen = "����";
		else if(gender == 'F')	gen = "����";
		else			gen = "";
		return name+"�� Ű��"+tall+"cm�̰�"+weight+gen+"�Դϴ�";
		
	}
	
	

	
	
}












