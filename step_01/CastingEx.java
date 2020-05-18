// 형변환
public class CastingEx {
	public static void main(String[] args) {
		int salary = 857650;
		double tax = 0.033;
		int result = salary
		//double result = (double)salary *(1-tax);
		System.out.printf("세금을 제외한 급여 :"+"%.0f", result);
		
		
		/*
		 * int k = 87, e = 88, m= 75; int tot = k+e+m; double avg = (double)tot/3;// .0을
		 * 붙이니 형변환 tot 앞 (double) System.out.printf("평균:%.2f",avg);
		 */
		//------------------------
		/*정수 나누기 정수는 정수로 취급 결과값 83.00
				byte a =100;
		int b = a;
		
		double c = 73.45;
		int d =(int)c;  // 강제 형변환 
		// 타입 미스매치 실수에서 정수로 가는것에 대한 오류
	
	
		System.out.println(a +"   "+b);
		System.out.println(c +"   "+d);
*/
	}

}
