package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("��ī����");
		String str2 = new String("��ī����");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));  //���ڿ��� �����Ƿ� true
		
		String str3 = "��ī����";
		String str4 = "��ī����";
		
		System.out.println(str3 == str4);  //��ī������ ���Ǯ�� ����Ǿ� �����Ƿ� �ּ� ���� ����
		System.out.println(str3.equals(str4)); 

	}

}
