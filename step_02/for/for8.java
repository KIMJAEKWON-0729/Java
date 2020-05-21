package ForEx;

public class for8 {
	public static void main(String[] args) {
		One:for (int i = 0; i <5; i++) {
			for(int j = 0; j<3;j++) {
			if(j==2)
				continue One;
			System.out.println(i+"-->"+j);}
			
			}
		}			
}
