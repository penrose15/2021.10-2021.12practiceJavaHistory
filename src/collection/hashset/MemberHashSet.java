package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberid) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();  //ȸ���� �ϳ��� �����ͼ�
			int tempid = member.getMemberId();  //���̵� ��
			if(tempid == memberid) {  //���̵� ������
				hashSet.remove(member);  //����
				return true;
			}
		}
		System.out.println(memberid + "�� �������� �ʽ��ϴ�");
		return false;
	}
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
