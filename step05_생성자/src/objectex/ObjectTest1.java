package objectex;

/*  클래스명 : Emp
-name:String
-dept:String
-salary:int

+setEmp(name:String, dept:String,  salary:int):void
+printEmp():void
*/

//ObjectTest1.java --> ObjectTest1.class  Emp.class
class Emp{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name,String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void printEmp() {
		System.out.println(name+"은 "+dept+"원이며 "+salary+"원의 급여를 받습니다");
	}
}
public class ObjectTest1 {
	public static void main(String[] args) {
		//Emp클래스로 ob객체를 생성한후 setEmp()를 통해 데이터를 대입한다
		//printEmp()로 출력한다
		Emp em=new Emp();
		em.setEmp("강호동", "영업부", 1520000);
		em.printEmp();
	}
}
/*
[결과화면]
강호동은 영업부 사원이며 1520000원의 급여를 받습니다.
*/











