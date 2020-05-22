package step03_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Call by value: 값을 전달하는 방식
public class MethodEx10 {
	public static int rectangle(int i, int j) {
		return  i*j;
	}
	public static double tri(int i, int j) { 
		return i*j/2;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		while (true){
			System.out.println("번호를 골라주세요 1.사각형 2.삼각형,3.종료");a = Integer.parseInt(br.readLine());
			
			  switch (a) { 
			  case 1: System.out.print("가로입력:");
			  	int i =Integer.parseInt(br.readLine()); 
			  	System.out.print("세로입력:"); 
			  	int j =	Integer.parseInt(br.readLine()); 
			  	System.out.println("넓이"+rectangle(i, j));
			  	break; 
			  case 2: System.out.print("가로입력:");
			  	int x =Integer.parseInt(br.readLine()); 
			  	System.out.print("세로입력:"); 
			  	int y =Integer.parseInt(br.readLine()); 
			  	System.out.println("넓이"+tri(x,y)); 
			  	break;
			  case 3:
			  System.out.println("**프로그램을 종료합니다**");
				System.exit(0);
			  
			 
			}
			
		} 	
	}
}
	



