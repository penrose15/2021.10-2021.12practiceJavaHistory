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
		return memberName + "회원님의 아이디는"+memberid+"입니다";
	}

	@Override
	public int hashCode() {
		return memberid;
	}

	@Override
	public boolean equals(Object obj) {  //Member가 obj의 상위클래스인가? ->true면 형변환이 가능
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
