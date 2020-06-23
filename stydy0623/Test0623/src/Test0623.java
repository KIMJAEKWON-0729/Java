
public class Test0623 {
	public static void main(String[] args) {
		// 1.선행연산자 Prefix 후행연산자 Postfix를 표현해주세요
		int num = 5;
		System.out.print((num++));
	
		System.out.print((num++));
		
		System.out.print((num));
		
		System.out.print((num--));
		
		System.out.print((num--));
		
		System.out.println((num));
		//2 특정 조건을 만족할때 실행하는  흐름을 만드는 제어문을 표현해주세요
		//if 
		
		//3 조건이 여러가지 일때 사용할수 있는 제어문을 표현해주세요 
		//switch else if
		
		//4.switch 문을 사용하여  국어 (96)일떄 A+ 
		
		int score = 9;
		char grade = 0;
		
		switch (score) {
		case 9:grade = 'A';
			System.out.println("당신의 성적은 "+grade+"입니다");
			break;

		default:
			break;
			
				
			}
		//5 while 문과 do while문을 실행하세요
		int n = 0;
		int nd= 0;
		while (n<5) {
			n++;
			System.out.println(n);
		
		
		}
		
		do {nd++;
		System.out.println(nd);
		
			
		} while (nd<5);
		//6 구구단 4단과 5단을 출력해주세요
		
		for (int i = 4; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+ i*j);
				
			}
			
		}
		//7 continue 문과 break문의 차이를 설명해주세요
		//continue문은 특정 조건을 만났을때 건너 뛰에서 반복문을 실행하고 break는 특정조건을 만나면 while문을 탈출한다
		
		//8 이 제어문은 무한 루프에 빠질 위험이 있으며 반드시 break문과 함께 사용해야 합니다 표현을 작성해주세요 
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}
	}
}
