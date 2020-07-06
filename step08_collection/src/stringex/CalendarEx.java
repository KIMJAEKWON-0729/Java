package stringex;

import java.sql.Date;
import java.util.Calendar;

class Today{
	public void print() {
		//System.out.println("���� ��¥:"+new Date(0));
		Calendar ca=Calendar.getInstance();  //�ý��ۿ� ������ ��¥/�ð�
		
		System.out.println("���ó�¥:" 
		                    + ca.get(Calendar.YEAR)+"��"
		                    + (ca.get(Calendar.MONTH)+1)+"��"
		                    + ca.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println("����ð�:" 
			                + ca.get(Calendar.HOUR_OF_DAY)+"��"
			                + ca.get(Calendar.MINUTE)+"��"
			                + ca.get(Calendar.SECOND)+"��");
	}
}


public class CalendarEx {
	public static void main(String[] args) {
		new Today().print();
	}
}
