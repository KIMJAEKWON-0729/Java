package employee;
/* Emp를 상속받는다
* -salary:long
* -bonus:long
* 
* +Engineer()
* +Engineer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [조건]
*  보너스+=150000을 수당으로 지급
*//* [출력결과]
 * 사원번호:101
 * 사원이름:Scott
 * 내선번호:5678
 * 기본급여:2500000
 * 보너스+수당:450000
 * 지급금액 : 2950000원
 * 
 * 사원번호:201
 * 사원이름:Steve
 * 내선번호:1234
 * 기본급여:1500000
 * 보너스+수당:225000
 * 지급금액 : 1725000원
 */

 class Engineer extends Emp {
	 long salary;
	 long bonus;
	 
	public Engineer() {
		super();
	}
	
	public Engineer(long salary, long bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}


	@Override
	public void setBonus() {
		System.out.println(bonus+=150000);
	}

	@Override
	public void setSalary() {
		
	}
	public String toString(String eno, String ename, String phone){
		
	}
	

}
