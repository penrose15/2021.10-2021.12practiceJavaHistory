package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberlee = new Member(1001, "������");
		Member memberjeon = new Member(1002, "����ȣ");
		Member memberkim = new Member(1003, "����");
		
		memberHashSet.addMember(memberlee);
		memberHashSet.addMember(memberjeon);
		memberHashSet.addMember(memberkim);
		memberHashSet.showAllMember();
		
		Member memberha = new Member(1003,"������");  //���̵� �ߺ��ʿ��� �߰��� ��->����
		memberHashSet.addMember(memberha);
		memberHashSet.showAllMember();
	}

}
