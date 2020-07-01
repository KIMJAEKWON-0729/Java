package Inheritance;

public class EmpMain {
	public static void main(String[] args) {
		Emp ob1 = new Emp("이순신","010-1111-1111");
		System.out.println(ob1.toString());
		EmpScore ob2 = new EmpScore("김재권","010311144",54.2,'A');
		System.out.println(ob2.toString());
		
	}
}
/*
나의 이름은 이순신이고 연락처는 010-1111-1111입니다

나의 이름은 강호동이고 연락처는 010-1234-5678입니다
나의 점수는 75.3점 이고 학점은 C입니다

*/