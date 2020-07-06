package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add(2);
		set.add(new Float(3.0f));
		set.add(4.9f);
		set.add(new Integer(2));
		set.add(new Double(4.00));
		set.add(new String("one"));
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());	
		}
	}

}
