package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "�б�,��,������,ī��#����$���ӹ�,�뷡��";
		String[] value = str.split(",");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
			
		}
		//��뿹 �ֹε�Ϲ�ȣ ���ڸ� ���ڸ� 
		
		
		
		
		/*
		StringTokenizer ob = new StringTokenizer(str,",#$");//������ ����
		System.out.println("�Ľ��� ���ڿ��� ��:"+ob.countTokens()+"��");
		
		while(ob.hasMoreTokens()) {
			System.out.println(ob.nextToken());
		}*/
	}
}
