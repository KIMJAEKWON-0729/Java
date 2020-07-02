package employee;
/*  -eno:int
 *  -ename:String
 *  -phone:String
 * 
 *  +Emp()
 *  +Emp(eno:int, ename:String, phone:String)
 *  +getter
 *  +setSalary(salary:long):void     --abstract
 *  +setBonus(bonus:long):void       --abstract
 */



abstract class Emp {
	int eno;
	String ename;
	String phone;
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	abstract public  void setSalary();
	abstract public void setBonus();
		

}
	


