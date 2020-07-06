package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import emp.Empvo;

public class MapEx1 {
	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();
		map.put("둘리",new Integer(85));
		map.put("또치",new Integer(100));
		map.put("마이콜",new Integer(95));
		map.put("도우넛",null);

		
		
//		int score = map.get(args[0]);
//		System.out.println(args[0]+"의성적은"+score+"점입니다");
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String v :keys) {
			System.out.println(v+"\t"+map.get(v));
		}
		
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(101,"둘리");
//		map.put(102,"또치");
//		map.put(103,"마이콜");
//		map.put(104,"도우넛");
//		System.out.println("key:"+101+"value:"+map.get(101));
//
//		System.out.println("key:"+102+"value:"+map.get(102));
//
//		System.out.println("key:"+103+"value:"+map.get(103));
//
//		System.out.println("key:"+104+"value:"+map.get(104));
//		
		
		
		
		//		Map map = new HashMap();
//		map.put(101,"둘리");
//		map.put(102,"또치");
//		map.put(103,"마이콜");
//		map.put(104,"도우넛");
//		System.out.println("key:"+101+"value:"+map.get(101));
//
//		System.out.println("key:"+102+"value:"+map.get(102));
//
//		System.out.println("key:"+103+"value:"+map.get(103));
//
//		System.out.println("key:"+104+"value:"+map.get(104));
		
		
	}
}
