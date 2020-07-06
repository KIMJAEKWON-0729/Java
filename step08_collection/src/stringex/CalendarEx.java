package stringex;

import java.sql.Date;
import java.util.Calendar;

class Today{
	public void print() {
		//System.out.println("오늘 날짜:"+new Date(0));
		Calendar ca=Calendar.getInstance();  //시스템에 설정된 날짜/시간
		
		System.out.println("오늘날짜:" 
		                    + ca.get(Calendar.YEAR)+"년"
		                    + (ca.get(Calendar.MONTH)+1)+"월"
		                    + ca.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println("현재시간:" 
			                + ca.get(Calendar.HOUR_OF_DAY)+"시"
			                + ca.get(Calendar.MINUTE)+"분"
			                + ca.get(Calendar.SECOND)+"초");
	}
}


public class CalendarEx {
	public static void main(String[] args) {
		new Today().print();
	}
}
