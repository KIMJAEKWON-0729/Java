package emp;

import java.util.ArrayList;
import java.util.List;

//데이타베이스에서 자원을 가져올 용도로 사용됨(DAO: Data Access Object)
public class EmpDao {
	List<Empvo> list = null;
	
	public EmpDao() {
		list=new ArrayList<>();
		list.add(new Empvo("kim","영업부",1000000));
		list.add(new Empvo("lee","개발부",1500000));
		list.add(new Empvo("park","관리부",3000000));
		
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
