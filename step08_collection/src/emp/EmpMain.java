package emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDao dao = new EmpDao();

		System.out.println("***��� ��� ����ϱ�***");
		List<Empvo> list=dao.getEmpDao();
		for(Empvo ob:list) {
			System.out.println("�̸�:"+ob.getEname());
			System.out.println("�μ�:"+ob.getDept());
			System.out.println("�޿�:"+ob.getSalary()+"\n");
		}
		System.out.println("Lee ��� ����ϱ�");
		Empvo em = dao.getEmp("lee");
		if(em== null) {
			System.out.println("ã�� ����� �����ϴ�");
		}
		else {
			System.out.println(em.getEname()+em.getDept()+em.getSalary());
		}
	}

}
/*
***��� ��� ����ϱ�***
�̸� : kim
�μ� : ������
�޿� : 1000000

�̸� : lee
�μ� : ���ߺ�
�޿� : 1500000

�̸� : park
�μ� : ������
�޿� : 3000000
============================
** lee��� ����ϱ�**
lee  ���ߺ�  1500000
*/