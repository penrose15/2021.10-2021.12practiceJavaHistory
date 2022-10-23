package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;  //arrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();  //Member������ ������ ArrayList����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);   //ArrayList�� ȸ���� �߰��ϴ� �޼���
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberid) {    //�ش� ���̵� ���� ȸ������ ArrayList���� ã�� ü����
		for (int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);  //get() �޼���� ȸ���� ���������� ������.ArrayList�� get()�� ����Ʈ���� � ��ü�� �������µ� ���Ǵ� �޼ҵ�
			int tempid = member.getMemberId();
			if(tempid == memberid) {    //ȸ�� ���̵� �Ű������� ���ٸ�
				arrayList.remove(i);  //�ش� ȸ�� ����
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
