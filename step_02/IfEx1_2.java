package ifex;

public class IfEx1_2 {
	public static void main(String[] args) {
		int score = 105;
		if(score>100 || score<0) {
			System.out.println("시스템오류");
			return;//메인함수를 무조건 빠져나간다
		}
		char grade = '\0';//초기화를 생략할수 없다 
		if(score>=90 && score<=100) grade ='A';
		if(score>=80 && score<90) grade ='B';
		if(score>=70 && score<80) grade ='C';
		if(score>=60 && score<70) grade ='D';
		if(score>=0 && score<60) grade ='F';
		System.out.println("나의 점수는"+score+"점이고 학점은"+grade+"입니다");
		}
}