/*[문제] 각각 변수를 만들어 다음과 같이 완성하시오

이름 : 강호동
국어 : 85
영어 : 73
수학 : 68
총점 : 226점
평균 : 75.33점
*/
public class Test2 {
	public static void main(String[] args) {
		
	
	String name = "강호동";
	double korean = 85;
	double english = 73;
	double math = 68;
	double mean = (korean+english+math)/3;
	System.out.println("이름 :"+name);
	System.out.println("국어 :"+ korean+"점");
	System.out.println( "영어 :"+ english+"점");
	System.out.println( "수학 :"+ math+"점");
	System.out.println("총점 :" + (korean+english+math)+"점");
	System.out.printf("평균:"+"%.2f점",mean);

			
	}
}
