package test;

/*  -(private) , +(public) , #(protected)
 *  
 *  Ŭ������ : Register
 *  -id:String    
 *  -pw:String              
 *  -name:String
 *  -birth:String
 *  -phone:String
 *  
 *  +setRegister(id:String,pw:String,name:String,birth:String,phone:String):void
 *  +viewRegister():void   --���
 */
class Register{
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String phone;
	
	public void setRegister(String id, String pw, String name, String birth, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}
	public void viewRegister(){
		System.out.println("�̸�:"+name);
		System.out.println("����ó"+phone);
		System.out.println("�������:"+birth.substring(0,4)+"��"
									+birth.substring(4, 6)+"��"
									+birth.substring(6, 8)+"��");
		System.out.println("ID��"+id+"�̰� password ��"+pw+"�Դϴ�");
	}



}
public class ObjectTest8 {
	public static void main(String[] args) {
		// RegisterŸ���� ��ü ob�� ���� 
		// setRegister�� abcd,1234,�̼���,19911212,010-1234-5678�� �����Ͻÿ�
		Register ob = new Register();
		ob.setRegister("abcd", "1234", "�̼���", "19911212", "010-1234-5424");
		ob.viewRegister();
		


	}
}
/* �̸� : �̼���
 * ������� : 1991�� 12�� 12��
 * ����ó:010-1234-5678
 * ID�� abcd�̰� password�� 1234�Դϴ�.
 */



