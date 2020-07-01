package Inheritance;
//super 와 this 

class Branch{
public Branch() {
	System.out.println("Branch default constructor");
}
public Branch(int n) {
	this();
	System.out.println(n+" ");
}

}


class Leaf extends Branch{
	public Leaf(String str , int n){
		System.out.println("Leaf default constructor");
}
	
}

public class InheritanceEx3 {
	public static void main(String[] args) {
	new Leaf("가나다",10);
}
}




//
//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");
//	}
//	public Branch(int n) {
//		this();
//		System.out.println(n+"");
//	}
//	
//}
//class Leaf extends Branch{
//	public Leaf(String str){
//		this("가나다",10);
//		System.out.println("Leaf default constructor");
//	}
//	public Leaf(String str, int n) {
//		super(n);
//		System.out.println(str+" "+n+"Leaf constructor");
//	}
//}
//
//
//public class InheritanceEx3 {
//	public static void main(String[] args) {
//		new Leaf("가나다");
//	}
//}


//class Branch{
//	public Branch() {
//		System.out.println("Branch default constructor");
//	}
//
//	public Branch(String str){
//		this();
//		System.out.println(str +"Branch constructor");
//	}
//}
//
//
//class Leaf extends Branch{
//	public Leaf(String str) {
//		super(str);
//		System.out.println(str+"Leaf constructor");
//	}
//}
//
//public class InheritanceEx3 {
//	public static void main(String[] args) {
//		new Leaf("가나다");
//	}
//}
