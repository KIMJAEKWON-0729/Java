package employee;
/*  Emp를 상속받는다
* -salary:long
* -bonus:long
* 
* +Develoer()
* +Developer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [조건]
*  보너스+=100000을 수당으로 지급
*/

public class Developer extends Emp {
	long salary;
	long bonus;

	@Override
	public void setSalary() {
		System.out.println(bonus+=100000);
	}

	@Override
	public void setBonus() {
		
	}

}
