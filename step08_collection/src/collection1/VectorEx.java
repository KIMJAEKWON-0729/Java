package collection1;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> ob = new Vector<>(3,2);
		System.out.println("�뷮"+ob.capacity());
		System.out.println("ũ��"+ ob.size());
		
		ob.add(100.3);
		ob.add(new Double(3.14));
		ob.add(50.5);
		ob.add(95.3);
		System.out.println("�뷮"+ob.capacity());
		System.out.println("ũ��"+ob.size());
	
		double s = 3.14;
		int index = ob.indexOf(s);
		if (index != -1) {
			System.out.println(s+"�� ��ġ��"+(index+1)+"��° �Դϴ�");
			
		
		}else {
			System.out.println(s+"�� �����ϴ�");
		}
		//===========================================================
		
		double d = 3.14;
		if(ob.contains(d)) {
			ob.remove(d);
			System.out.println(d+"�� �����߽��ϴ�");
		}
		System.out.println(ob);
		//---------------------------------------
		
		ob.trimToSize();//���ʿ��� �뷮 ���̱� 
		System.out.println(ob.capacity()+ " "+ob.size());
		
	
	}

}
