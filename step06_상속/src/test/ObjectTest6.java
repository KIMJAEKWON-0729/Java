package test;

/* Ŭ������: Student
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
		//setter�� �̿��ؼ� ���� �����ϰ� getter�� �̿��ؼ� ����Ͻÿ�
		//ȫ�浿, 90, 96, 100
		Student ob=new Student("ȫ�浿",90,96,100);
		System.out.println("�̸�"+ob.getName());
		System.out.println("����:"+ob.total());
		System.out.println("���:"+ob.avg());



	}
}
/*
�̸�: ȫ�浿
����: 286��
���: 95.33��
*/