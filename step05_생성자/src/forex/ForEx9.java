package forex;

//Bubblet Sort(거품소트)
public class ForEx9 {
	public static void main(String[] args) {
		int[] num= {40,20,10,60,50,30,80,70};
		int tmp;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length-1-i; j++) {
				if(num[j] > num[j+1]) {
					tmp=num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		//----------------------------------------
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"   ");
		}
	}
}
