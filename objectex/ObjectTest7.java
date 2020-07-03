package objectex;

/* 클래스명:Emp4
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
public class Emp4 {
	private String name;
	private double tall;
	private int weight;
	private char gender;

}
public class ObjectTest7 {
	public static void main(String[] args) {
		Emp4 ob=new Emp4();
		


	}
}
// [출력결과]
// 이순신의 키는 175.3cm이고 64kg이며 남자 입니다. 
//
// [입력데이타] 이순신, 175.3, 64, M
// [조건] M(남자),F(여자),나머지는 생략