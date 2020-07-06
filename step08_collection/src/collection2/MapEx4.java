package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {
	public static void main(String[] args) {
		Book ob1=new Book("java","kim",100);
		Book ob2=new Book("oracle","lee",250);
		Book ob3=new Book("c++","park",150);
		
		//hash map�߰�------------------------
		HashMap<String, Book> map = new HashMap<>();
		map.put(ob1.getTitle(),ob1);
		map.put(ob2.getTitle(),ob2);
		map.put(ob3.getTitle(),ob3);
		
		System.out.println(map);
		

		//[����1]�̸��� ���----------------------
		//kim
		//lee
		//park
		Set<String> keys = map.keySet();
		for(String k: keys) {
			System.out.println(map.get(k).getAuthor());
		}



		//[����2]�˻�-----------------------------
		//ã�� ������: c++
		//å�̸�:c++  ����:lee  ������:250
		//ã�� ������: php
		//ã�� ������ �����ϴ�
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�µ�����"); String t = sc.next();
		if(map.get(t) == null) {
			System.out.println("���� ������ �����ϴ�");
		}else {
			System.out.println("å�̸�:"+map.get(t).getTitle()+" "
								+"���� :"+map.get(t).getAuthor()+" "
								+"������:"+map.get(t).getPage());
		}
		
		sc.close();
		}

}

