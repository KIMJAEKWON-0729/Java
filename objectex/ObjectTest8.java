package objectex;

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
	
	
}
public class ObjectTest8 {
	public static void main(String[] args) {
		// RegisterŸ���� ��ü ob�� ���� 
		// setRegister�� abcd,1234,�̼���,19911212,010-1234-5678�� �����Ͻÿ�
		Register ob=new Register();
		

	}
}
/* �̸� : �̼���
 * ������� : 1991�� 12�� 12��
 * ����ó:010-1234-5678
 * ID�� abcd�̰� password�� 1234�Դϴ�.
 * 
 * 
 * [����]
	String str="901210";
	System.out.println(str.substring(2, 4));   // 12
	System.out.println(str.substring(2));      // 1210
 */









