package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberlee = new Member(1001, "������");
		Member memberkim = new Member(1002, "����");
		Member memberjeon = new Member(1003, "����ȣ");
		Member memberha = new Member(1004, "������");    //���ο� ȸ�� �ν���Ʈ ����
		Member memberchung = new Member(1005, "��û��");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberkim);
		memberArrayList.addMember(memberjeon);
		memberArrayList.addMember(memberha);  //ArrayList�� ȸ�� �߰�
		memberArrayList.insertMember(memberchung, 1);
		
		memberArrayList.showAllmember();
		
		memberArrayList.removeMember(memberha.getMemberId());  //������ ���� ��ī����...?
		memberArrayList.showAllmember();

	}

}
