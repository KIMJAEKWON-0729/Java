package oper;
//5 % 3->2 %는 나머지 

/*		System.out.println(5%3);/2
System.out.println(5/3);1
System.out.println(5.0/3);1.6666 */

/*int a = 5;
String str = "Korea";
int score = 57;
boolean ck = score<0 || score>=100;
System.out.println(ck);// FALSE
System.out.println(score>=70 && score<90);//FALSE
System.out.println(str =="Korea" || str =="KOREA");// TRUE
System.out.println(a==5);// TRUE
System.out.println(a>=5);// TRUE
System.out.println(a!=5);// FASLE */
//int a = 5;
//System.out.println(++a);
//System.out.println(a++);
//System.out.println(a);
//System.out.println(--a);
//System.out.println(a--);
//
//int p = 3;
//p+=2;
//p*=3;
//p-=2;
//p%=3;
//System.out.println(p);//1


//조건
public class OperatorEx {
	public static void main(String[] args) {
		
		char gender = '남';
		String rs=(gender=='M'||gender=='남')?"Man":"Woman";
		System.out.println(rs);
		
		int a = 0;
		float b = 0.0f;
		char c ='\0';
		String d = "";
		System.out.println(a+" "+b+""+c+" "+d);
		
	}
}	
	


