class simplebox{
	private int data;
	
	simplebox(int data){
		this.data = data;
	}
	void setdata(int data) {
		this.data = data;
	}
	int getdata() {
		return this.data;
	}
}

class thisinst{
	public static void main(String[] args) {
		simplebox box = new simplebox(99);
		System.out.println(box.getdata());
		
		box.setdata(77);
		System.out.println(box.getdata());
	}
}
