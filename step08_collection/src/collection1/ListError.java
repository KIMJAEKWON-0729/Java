package collection1;

import java.awt.List;
import java.util.ArrayList;

public class ListError {
	@SuppressWarnings(value = "unchecked") 
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(new Integer(10));
		list.add("�ܿ�");
		list.add(4.0);
		list.add(10.0f);
		
		for(int i=0; i<list.size(); i++) {
			String s=(String)list.get(i);
			System.out.println(s);
		}
	}

}
