package boxingex;

//Boxing : �⺻��  --> ��ü��
// 

public class BoxingEx1 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		
		String binary=Integer.toBinaryString(a);
		String octal=Integer.toOctalString(a);
		String hexa=Integer.toHexString(a);
		
		System.out.println("10����="+a);
		System.out.println("2����="+binary);
		System.out.println("8����=O"+octal);
		System.out.println("16����=Ox"+hexa);

		
//		String a = "100";
//		String b = "200";
//		int x= Integer.parseInt(a);
//
//		int y= Integer.parseInt(b);
//		System.out.println(x+y);
	
		
		
		
		/*int a = 5;
		Integer b= a;
		Integer c = new Integer(a);
		
		Integer x = 10;
		int y = x;
		int z = x.intValue();
		System.out.println(c+z);
		*/
	}

}
