
 class SinivelCap{
	 void take() {
		 System.out.println("콧물");
	 }

}
 class sneezecap{
	 void take() {
		 System.out.println("재채기");
	 }
 }
 class snufllecap{
	 void take() {
		 System.out.println("코");
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