package override;
class test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("vidw3 method");}
}
class Test2 extends test1{
	@Override
	public void view2() {System.out.println("view11 method");}
	public void view4() {System.out.println("vidw22 method");}

}

public class OverrideEx {
	public static void main(String[] args) {
		test1 ob = new Test2();
		ob.view1();
		ob.view3();
		
//		Test2 ob = new Test2();
//		ob.view1();
//		ob.view2();
//		ob.view3();
		
	}

}
