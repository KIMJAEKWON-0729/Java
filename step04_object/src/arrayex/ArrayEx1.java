package arrayex;

public class ArrayEx1 {
	public static void main(String[] args) {
		int arr []; //배열선언
		arr = new int[5];// 메모리할당(5개의 int형 기억장소)
		arr[0] = 25;
		arr[1] = 36;
		arr[2] = 15;
		arr[3] = 19;
		arr[4] = 40;
		//System.out.println("배열의 길이 = "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("\n jdk 1.5 이상에서 제공한 foreach를 이용");
		for(int n:arr) {
			System.out.println(n);
		}
		System.out.println("\n 홀수번째 데이터만 출력");
		for (int i = 0; i < arr.length; i++) {
			if(i%2 !=0) {
			System.out.println(arr[i]);
			
		}
	}
		}
}
