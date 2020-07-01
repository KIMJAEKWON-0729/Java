package objectex;

/*  클래스명 : Emp3
-name:String
-dept:String
-salary:int

+setter & getter
+toString():String
*/
class Emp3{
	private String name;
	private String dept;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name+"은 "+dept+"사원이며 "+salary+"원의 급여를 받습니다";
	}
} 
public class ObjectTest3 {
	public static void main(String[] args) {
		//Emp3로 객체 ob를 만들고 setter를 통해 "강호동","영업부",1520000을 대입한다
		//toString()으로 출력한다.
		Emp3 ob=new Emp3();
		ob.setName("강호동");
		ob.setDept("영업부");
		ob.setSalary(1520000);
		System.out.println(ob);   // .toString()은  생략가능

		//getter을 통해 이름, 부서, 급여를 출력한다.
		System.out.println("이름:" + ob.getName());
		System.out.println("부서:" + ob.getDept());
		System.out.println("급여:" + ob.getSalary());
	}
}
/*  
[결과화면]
강호동은 영업부사원이며 1520000원의 급여를 받습니다

 이름 : 강호동
 부서 : 영업부
 급여 : 1200000원
 
 */
