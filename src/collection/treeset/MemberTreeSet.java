package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberid) {
		Iterator<Member> ir = treeSet.iterator();  
		
		while(ir.hasNext()) {  //���� ������ True ������
			Member member = ir.next();  //������ ���� �ͼ�
			int tempid = member.getMemberId();  //�ŰԺ����� ������
			if(tempid == memberid) {
				treeSet.remove(member);  //����
				return true;
			}
			
		}
		System.out.println(memberid+"�� �������� �ʽ��ϴ�");
		return false;
		
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
			
		}
		System.out.println();
	}

}
