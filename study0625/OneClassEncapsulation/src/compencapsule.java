
 class SinivelCap{
	 void take() {
		 System.out.println("�๰");
	 }

}
 class sneezecap{
	 void take() {
		 System.out.println("��ä��");
	 }
 }
 class snufllecap{
	 void take() {
		 System.out.println("��");
	 }
 }

 class sinuscap{
	 SinivelCap sicap = new SinivelCap();
	 sneezecap szcap = new sneezecap();
	 snufllecap sfcap = new snufllecap();
	 
	 void take() {
		 sicap.take(); szcap.take(); sfcap.take();
		 
	 }
 }
 
 
 class coldpatient{
	 void takesinus(sinuscap cap) {
		 cap.take();
	 }
 }
 
 class compencasulaton{
	 public static void main(String[] args) {
		coldpatient suf = new coldpatient();
		suf.takesinus(new sinuscap());
	}
 }