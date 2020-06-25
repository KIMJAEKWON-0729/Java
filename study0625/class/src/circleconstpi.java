class circle{
	static final double PI = 3.1415;
	private double radius;
	circle(double rad){
		radius = rad;
	}
	void showperimeter() {
		double peri = (radius * 2) *PI;
		System.out.println("ตัทนคำ"+peri);
	}
	void showarea() {
		double area = (radius*radius) *PI;
		System.out.println("ณะภฬ:"+area);
	}
}



public class circleconstpi {

}
