package collection.hashset;

import java.util.HashSet;

public class HashSetTest {  //set�������̽��� ������ Ŭ������ �ϳ�(HashSet)

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("������");
		hashSet.add("������");
		hashSet.add("����ȣ");
		hashSet.add("����");
		hashSet.add("������");
		
		System.out.println(hashSet); //������ ������� ���
	}

}
