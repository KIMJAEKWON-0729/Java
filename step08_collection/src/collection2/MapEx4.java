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
		
		//hash map추가------------------------
		HashMap<String, Book> map = new HashMap<>();
		map.put(ob1.getTitle(),ob1);
		map.put(ob2.getTitle(),ob2);
		map.put(ob3.getTitle(),ob3);
		
		System.out.println(map);
		

		//[문제1]이름만 출력----------------------
		//kim
		//lee
		//park
		Set<String> keys = map.keySet();
		for(String k: keys) {
			System.out.println(map.get(k).getAuthor());
		}



		//[문제2]검색-----------------------------
		//찾는 도서명: c++
		//책이름:c++  저자:lee  페이지:250
		//찾는 도서명: php
		//찾는 도서가 없습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는도서명"); String t = sc.next();
		if(map.get(t) == null) {
			System.out.println("차즌ㄴ 도서가 없습니다");
		}else {
			System.out.println("책이름:"+map.get(t).getTitle()+" "
								+"저자 :"+map.get(t).getAuthor()+" "
								+"페이지:"+map.get(t).getPage());
		}
		
		sc.close();
		}

}

