package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("ddd","�Ѹ�");
		map.put("bbb","�����");
		map.put("aaa","��ġ");
		map.put("ccc","������");
		
		Set<String> keys =  map.keySet();
		ArrayList<String> list = new ArrayList<>(keys); 
		Collections.sort(list); // ��������
		for (String ob : list) {
			System.out.print(ob + "\t"+map.get(ob)+"\t");	map.put("ccc","������");
	
		}

	}
}
/* �������� ���� ���
 * aaa ��ġ
 * bbb �����
 * ccc ����Ŭ
 * ddd	�Ѹ�
*/