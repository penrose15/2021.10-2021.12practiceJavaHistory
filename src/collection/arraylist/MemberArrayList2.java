package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList2 {
	private ArrayList<Member> arrayList;  //arrayList ����
	
	public MemberArrayList2() {
		arrayList = new ArrayList<Member>();  //Member������ ������ ArrayList����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);   //ArrayList�� ȸ���� �߰��ϴ� �޼���
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberid) {    //�ش� ���̵� ���� ȸ������ ArrayList���� ã�� ü����
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {  //���Ŀ� ��Ұ� �ִ��� Ȯ���ϴ� �޼����̸�, ��Ұ� �ִٸ� true��ȯ
			Member member = ir.next();  //���� ��� ��ȯ
			int tempid = member.getMemberId();
			if (tempid == memberid) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberid+"�� �������� �ʽ��ϴ�");
		return false;
		
	}
	
	public void showAllmember() {
		for (Member member : arrayList) {
			System.out.println(member);  //member Ŭ�������� �������� toString()�� ȣ��Ǹ鼭 ȸ�������� ��µ˴ϴ�
		}
		System.out.println();
	}
	
	//get() �޼���� ���� ������ �ϴ� �迭���� ����ϴ� �޼�����

}
