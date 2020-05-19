package oper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 콘솔로 부터 데이타을 입력받는 방법
이름을 입력하시오 : 강호동
나의 이름은 강호동입니다
*/

public class InputTest1 {
	public static void main(String[] args) throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);// 한글 안깨지게 하려고 reader사용  하나씩 알아들을수 있다 
	BufferedReader br = new BufferedReader(isr);
	
	String name = null;
	int age;
	double tall;
	float weight;
	char gender;
	System.out.print("이름을 입력하시오"); name =br.readLine();
	System.out.print("나이를 입력하시오"); age =Integer.parseInt( br.readLine());// 숫자를 쓰고 싶을때는 integer.parseint로 감싸줘야 한다 
	System.out.print("키를를 입력하시오"); tall =Double.parseDouble(br.readLine());
	System.out.print("체중를 입력하시오"); weight=Float.parseFloat(br.readLine());
	System.out.print("성별을 입력하시오"); gender=br.readLine().charAt(0);//0 은 0번째 값
	
	
	System.out.println("나의 이름은"+ name +"입니다");
	System.out.println("나의 이름은"+ age +"세입니다");
	System.out.println("나의 키는"+ tall +"cm입니다");
	System.out.println("나의 체중"+ weight +"kg입니다");
	System.out.println("나의 성별은"+ gender+"자입니다");
	}
	
	
	
}

// 에러 Ctrl+1  파악 가능 더블클릭 해결 
//InputStreamReader / OutputStreamWriter는 바이트 스트림에서 문자 스트림으로, 또는 문자 스트림에서 바이트 스트림으로의 변환을 제공하는 입출력 스트림이다. 
//바이트를 읽어서 지정된 문자 인코딩에 따라 문자로 변환하는데 사용한다.
//BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기때문에 입력받은 데이터를 가공하는 작업이 필요할경우가 많습니다.
///력은 readLine();이라는 메서드를 활용하시면 되는데요. 여기서 주의할점이 두가지가 있습니다. 첫번째는 readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받을려면 형변환을 꼭 해주어야한다는 점입니다.
//두번째는 예외처리를 꼭 해주어야한다는 점입니다. readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업합니다.

