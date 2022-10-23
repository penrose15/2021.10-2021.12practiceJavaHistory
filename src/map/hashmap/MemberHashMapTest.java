package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member a = new Member(1001, "������");
		Member b = new Member(1002, "������");
		Member c = new Member(1003, "����ȣ");
		Member d = new Member(1004, "����");
		
		memberHashMap.addMember(a);
		memberHashMap.addMember(b);
		memberHashMap.addMember(c);
		memberHashMap.addMember(d);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);  //�׵��� ��ī������ ������ּż� �����մϴ� ���� ī�������� ���Ӱ� ���ƿԽ��ϴ�.
		memberHashMap.showAllMember();

	}

}
