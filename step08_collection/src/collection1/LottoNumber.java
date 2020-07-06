package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumber {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		for(Integer ob:list) {
			System.out.println(ob);
		}
	}

}
