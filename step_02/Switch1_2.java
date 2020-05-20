package Switch;

public class Switch1_2 {
	public static void main(String[] args) {
			int score = 90;
			char grade = 0 ;
			switch (score/10) {
			case 10: 	
				break;
			case 9: grade= 'A';	
				break;
			case 8: grade= 'B';	
				break;
			case 7: grade= 'C';	
				break;
			case 6: grade= 'D';	
				break;
		
			default:
				grade= 'F';
				break;
			}
			System.out.println("나의 점수는"+score+"점이며 학점은"+grade+"입니다");
				}
}


