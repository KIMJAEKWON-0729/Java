package constructorex;
/*Ŭ������ : UserInfo
+name:String   
+addr:String

+UserInfo()
+UserInfo(name:String, addr:String)   
+getter
*/
class UserInfo{
	public String name;
	public String addr;
	
	public UserInfo() {
		System.out.println("** �ּҷ� **");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
public class ConstructorEx3 {
	public static void main(String[] args) {
		UserInfo ob=new UserInfo("���󿡸�","�泲 â���� 150 ��ũ����ũ");
		System.out.println("�̸�: " + ob.getName());
		System.out.println("�ּ�: " + ob.getAddr());
	}
}
/* 
[��� ȭ��] 
** �ּҷ� **           <---�⺻�����ڿ��� ���
�̸� : ���󿡸�                  <---main()�Լ����� getter�� �̿��ؼ� ���
�ּ� : �泲 â���� 150 ��ũ����ũ
*/











