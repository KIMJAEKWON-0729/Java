package collection1;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> ob = new Vector<>(3,2);
		System.out.println("용량"+ob.capacity());
		System.out.println("크기"+ ob.size());
		
		ob.add(100.3);
		ob.add(new Double(3.14));
		ob.add(50.5);
		ob.add(95.3);
		System.out.println("용량"+ob.capacity());
		System.out.println("크기"+ob.size());
	
		double s = 3.14;
		int index = ob.indexOf(s);
		if (index != -1) {
			System.out.println(s+"의 위치는"+(index+1)+"번째 입니다");
			
		
		}else {
			System.out.println(s+"는 없습니다");
		}
		//===========================================================
		
		double d = 3.14;
		if(ob.contains(d)) {
			ob.remove(d);
			System.out.println(d+"를 삭제했습니다");
		}
		System.out.println(ob);
		//---------------------------------------
		
		ob.trimToSize();//불필요한 용량 줄이기 
		System.out.println(ob.capacity()+ " "+ob.size());
		
	
	}

}
