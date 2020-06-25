class simplecalculator{
	static final double PI = 3.1415;
	
	double add(double n1, double n2) {
		return n1 +n2;
	}
	double min (double n1, double n2) {
		return n1 -n2;
	}
	double calcirclearea(double r) {
		return PI * r * r;
	}
	double calcircleperi(double r) {
		return PI * (r *2);
	}
}

public class usecalculator {
	public static void main(String[] args) {
	simplecalculator sc = new simplecalculator();
	System.out.println("3 + 4 = "+sc.add(3, 4));
	
	System.out.println("반지름 2.2 , 원의 넓이: " + sc.calcirclearea(2.2)+"\n");
	
	System.out.println("15-7" + sc.min(15, 7));
	
	System.out.println("반지름 5.0 원의둘레:"+sc.calcircleperi(5.0));
	}

}
