package Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * month ������ 3�� �������� �����ϸ�
 * 3����31�� �Դϴ� 
 */
public class Switch3_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	int month = Integer.parseInt(args[0]);
	int day;
	switch (month%2) {
	case 1: day = 31;
		break;
	case 0:day = 30;
		break;
	default:
		day = 28;
		break;
		}
	System.out.println(month+"����"+day+"���Դϴ�");
	}	
	}
