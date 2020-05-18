
/*
 [문제1]
String a = "100";
String b = "200";
a 와  b의 값을 형변환해서 두수의 곱을 구하시오

--출력--
100 * 200 = 20000 

*/



public class Test3 {
	public static void main(String[] args) {
		//1번
		String a = "100";
		String b = "200";
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		System.out.println(a1+"*"+b1 +"="+(a1*b1));
		//2번
		int money =  65430;
		int man = money/10000;
		int thou = (money-60000)/1000;
		int hun = (money-65000)/100;
		int ten = (money-65400)/10;
		System.out.println("만:"+man);
		System.out.println("천:"+thou);
		System.out.println("백:"+hun);
		System.out.println("십:"+ten);
		
				
		
		//3번
		double salary = 1500000;
		double pay = 55000;
		double tax = salary*0.1;
		System.out.println("실수령액:"+(salary+pay-tax)+"원");
		//4번
		
		String name = "이효리 ";
		String department = "개발부";
		String position = "대리";
		int sal  = 1500000;
		System.out.println("이름:"+ name);
		System.out.printf("부서: %s\n",department);
		System.out.print("직위 :"+position+"\n급여:"+sal+"원\n");
	
		//5번
		String Name = "민들레";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		double avg = (kor+eng+mat)/3.0;
		System.out.println("이름:"+Name);
		System.out.println("합계점수:"+(kor+eng+mat)+"점");
		System.out.printf("평균점수:%.1f",avg);
	
		
		float base = 10f;
		float height = 3f;
		float area = (base * height)/2f;
		System.out.printf("\n삼각형 넓이 = %.2f",area);
	}

}






