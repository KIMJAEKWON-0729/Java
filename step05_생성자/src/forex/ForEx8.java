package forex;

//Selection Sort(���ü�Ʈ)
//40 20 10 60 50 30 --> 10 20 30 40 50 60(��������)
public class ForEx8 {
	public static void main(String[] args) {
		int[] num= {40,20,10,60,50,30};
		int tmp;
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		//----------------------------------------
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"   ");
		}
	}
}



















