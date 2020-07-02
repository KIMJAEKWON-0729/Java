package test;

/* 클래스명: Student
 * -name:String
 * -kor:int
 * -eng:int
 * -mat:int
 * 
 * +setter & getter
 * +getTotal():int
 * +getAvg():double
 */
class Student{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public Student() {
		super();
	}
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int total() {
		return kor+eng+mat;
	}
	public double avg() {
		return (double)((kor+eng+mat)/3);
	}
	
	
	


}
public class ObjectTest6 {
	public static void main(String[] args) {
		//setter를 이용해서 값을 대입하고 getter를 이용해서 출력하시오
		//홍길동, 90, 96, 100
		Student ob=new Student("홍길동",90,96,100);
		System.out.println("이름"+ob.getName());
		System.out.println("총점:"+ob.total());
		System.out.println("평균:"+ob.avg());



	}
}
/*
이름: 홍길동
총점: 286점
평균: 95.33점
*/