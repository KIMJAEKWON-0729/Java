package employee;
/*  Emp�� ��ӹ޴´�
* -salary:long
* -bonus:long
* 
* +Develoer()
* +Developer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [����]
*  ���ʽ�+=100000�� �������� ����
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
