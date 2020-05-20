package Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* [문제] 콘솔에서 데이터를 입력받아 다음과 같이 출력하시오
도형을 입력하시오: circle    <--- rectangle, triangle
원을 선택하셨습니다
    
도형을 입력하시오: rectangle
사각형을 선택하셨습니다

도형을 입력하시오: triangle
삼각형을 선택하셨습니다    
 
도형을 입력하시오: xyz
오류!!
  
*/
public class SwitchEx6 {
	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(args[0]);
		
		switch (a%3) {
		case 0: System.out.println(a+"는 3의 배수입니다");	
			break;
		case 1: System.out.println(a+"는 3의 배수가아닙니다");	
			break;

		}
		
		
	}
		
}























