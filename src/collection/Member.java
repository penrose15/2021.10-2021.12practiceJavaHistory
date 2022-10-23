package collection;

public class Member implements Comparable<Member>{
	private int memberid;
	private String memberName;
	
	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberid;
	}
	
	public void setMemberId(int memberid) {
		this.memberid = memberid;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵��"+memberid+"�Դϴ�";
	}

	@Override
	public int hashCode() {
		return memberid;
	}

	@Override
	public boolean equals(Object obj) {  //Member�� obj�� ����Ŭ�����ΰ�? ->true�� ����ȯ�� ����
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberid == member.memberid) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		return this.memberName.compareTo(member.memberName);
		
	}
	
	
	

}
