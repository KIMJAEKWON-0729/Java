package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collection2.Book;

public class ListEx3 {
	public static void main(String[] args) {
		
	
	Book ob1 = new Book("java","kim",100);
	Book ob2 = new Book("java","kim",100);
	Book ob3 = new Book("java","kim",100);

	List<Book> list = new ArrayList<>();
	
	list.add(ob1);
	list.add(ob2);
	list.add(ob3);

	Iterator<Book> iter = list.iterator();
	while(iter.hasNext()) {
		Book m = iter.next();
		System.out.print("å�̸�:"+m.getTitle()+"\t");
		System.out.print("å����:"+m.getAuthor()+"\t");
		System.out.println("������:"+m.getPage());

	
	}
	
	
//	for(Book m :list) {
//		System.out.print("å�̸�:"+m.getTitle()+"\t");
//		System.out.print("å����:"+m.getAuthor()+"\t");
//		System.out.println("������:"+m.getPage());
//	}
	
	}
	
}
