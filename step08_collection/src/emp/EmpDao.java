package emp;

import java.util.ArrayList;
import java.util.List;

//����Ÿ���̽����� �ڿ��� ������ �뵵�� ����(DAO: Data Access Object)
public class EmpDao {
	List<Empvo> list = null;
	
	public EmpDao() {
		list=new ArrayList<>();
		list.add(new Empvo("kim","������",1000000));
		list.add(new Empvo("lee","���ߺ�",1500000));
		list.add(new Empvo("park","������",3000000));
		
	}
	public List<Empvo> getEmpDao(){
		return list;
	}
	public Empvo getEmp(String ename) {
		for(Empvo ob:list) {
			if(ename.equals(ob.getEname())) {
				return ob;
			}
		}
		return null;
		
	}
}
