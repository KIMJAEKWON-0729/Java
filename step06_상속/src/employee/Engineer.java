package employee;
/* Emp�� ��ӹ޴´�
* -salary:long
* -bonus:long
* 
* +Engineer()
* +Engineer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [����]
*  ���ʽ�+=150000�� �������� ����
*//* [��°��]
 * �����ȣ:101
 * ����̸�:Scott
 * ������ȣ:5678
 * �⺻�޿�:2500000
 * ���ʽ�+����:450000
 * ���ޱݾ� : 2950000��
 * 
 * �����ȣ:201
 * ����̸�:Steve
 * ������ȣ:1234
 * �⺻�޿�:1500000
 * ���ʽ�+����:225000
 * ���ޱݾ� : 1725000��
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
