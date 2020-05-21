package ForEx;

public class for2 {
public static void main(String[] args) {
	int odd = 0, even = 0;
	for (int i = 1; i < 100; i++) {
		
		switch (i%2) {
		case 0: even+=i; break;
		case 1: odd+=i; break;
			
			

		}
		
	}
	System.out.println(odd);
	System.out.println(even);
}
}
