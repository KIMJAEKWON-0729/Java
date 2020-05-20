package ifex;


public class Quiz2_5 {
	public static void main(String[] args) {
	
	
	double mid = Double.parseDouble(args[0]);
	double fin = Double.parseDouble(args[1]);
	double rep = Double.parseDouble(args[2]);
	double chk = Double.parseDouble(args[3]);
	
	double fir = (mid+fin)/2;
	double score = ((fir*0.6)+(rep*0.2)+(chk*0.2));
	
	char grade;
	String ab = " ";
	if (score >= 90) {
		System.out.println (grade = 'A');
			}
	else if (score>=80) {
		System.out.println(grade = 'B');
			}
	else if (score>=70) {
		System.out.println(grade ='C');
	}
	else if (score>=60) {
		System.out.println(grade = 'D');
	}
	else {
		System.out.println(grade = 'F');
	}
	
	switch (grade) {
	case 'A':
		break;
	case 'B':
		ab = "Excellent";
		break;
	case 'C':
		break;
	case 'D':
		ab = "good";
		break;

	default:
		ab = "poor";
		break;
	}
	
	System.out.println("중간고사:"+mid);
	System.out.println("기말고사:"+fin);
	System.out.println("과제:"+rep);
	System.out.println("출석:"+chk);
	System.out.printf("성적 = %.2f",score);
	System.out.println("학점 ="+grade);
	System.out.println("평가 ="+ab);
	
	
			
	}
}