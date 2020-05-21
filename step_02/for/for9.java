package ForEx;
/* 
[문제] continue 표식과 다중for문을 이용해서 구하시오
1-50사이의 소수 (1과 자기자신 이외의 약수를 갖지 않는 수)

2 3 5 7 11 .....47
*/
public class for9 {
	public static void main(String[] args) {
	for (int i = 2; i <=50; i++) {
		boolean check = false;
		
		for (int j = 2; j <i; j++) {
			if(i%j==0)
			check=true;
			
		}
		if(check == false) {
			System.out.print(i+" ");
			}
		}	
	
	}
} 