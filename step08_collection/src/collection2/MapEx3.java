package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("ddd","둘리");
		map.put("bbb","도우넛");
		map.put("aaa","또치");
		map.put("ccc","마이콜");
		
		Set<String> keys =  map.keySet();
		ArrayList<String> list = new ArrayList<>(keys); 
		Collections.sort(list); // 오름차순
		for (String ob : list) {
			System.out.print(ob + "\t"+map.get(ob)+"\t");	map.put("ccc","마이콜");
	
		}

	}
}
/* 오름차순 정렬 출력
 * aaa 또치
 * bbb 도우넛
 * ccc 마이클
 * ddd	둘리
*/