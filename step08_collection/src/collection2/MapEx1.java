package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import emp.Empvo;

public class MapEx1 {
	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<>();
		map.put("�Ѹ�",new Integer(85));
		map.put("��ġ",new Integer(100));
		map.put("������",new Integer(95));
		map.put("�����",null);

		
		
//		int score = map.get(args[0]);
//		System.out.println(args[0]+"�Ǽ�����"+score+"���Դϴ�");
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String v :keys) {
			System.out.println(v+"\t"+map.get(v));
		}
		
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(101,"�Ѹ�");
//		map.put(102,"��ġ");
//		map.put(103,"������");
//		map.put(104,"�����");
//		System.out.println("key:"+101+"value:"+map.get(101));
//
//		System.out.println("key:"+102+"value:"+map.get(102));
//
//		System.out.println("key:"+103+"value:"+map.get(103));
//
//		System.out.println("key:"+104+"value:"+map.get(104));
//		
		
		
		
		//		Map map = new HashMap();
//		map.put(101,"�Ѹ�");
//		map.put(102,"��ġ");
//		map.put(103,"������");
//		map.put(104,"�����");
//		System.out.println("key:"+101+"value:"+map.get(101));
//
//		System.out.println("key:"+102+"value:"+map.get(102));
//
//		System.out.println("key:"+103+"value:"+map.get(103));
//
//		System.out.println("key:"+104+"value:"+map.get(104));
		
		
	}
}
