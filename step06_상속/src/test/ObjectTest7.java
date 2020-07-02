package test;

public class ObjectTest7 {
	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmp("이순신", 175.3, 64, 'M');
		System.out.println(ob.getEmp());
		

	}
}
// 이순신의 키는 175.3cm이고 64kg 남자 입니다. 
// [조건] M(남자),F(여자),나머지는 생략