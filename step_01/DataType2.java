
public class DataType2 {

	public static void main(String[] args) {
		float num = 78.3456f;
		System.out.println(num);
		System.out.printf("|%f|\n",num);
		System.out.printf("|%10.2f|\n",num);
		System.out.printf("|%-10.1f|\n",num);
	}

}

//printf 를 쓸경우 6자리 까지 다 쓰는것 %10.2f는 10자리확보(그래서 콘솔에 빈칸 발생) 2자리 밑반올림 