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
public class SwitchEx5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a;
		System.out.println("도형을 골라주세요:");a = br.readLine();
		
		switch (a) {
		case "circle":
			System.out.println("원을 선택하셨습니다");
			break;
		case "rectangle":
			System.out.println("사각형을 선택하셨습니다");
			break;
		case "triangle":
			System.out.println("삼각형을 선택하셨습니다");
			break;

		default:
			System.out.println("오류!!");
			break;
		}
		
	}
}






















