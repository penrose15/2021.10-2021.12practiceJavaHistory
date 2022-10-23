package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
	private int memberid;
	private String memberName;
	
	public Member2(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}
	
	public int getMemberid() {
		return memberid;
	}
	
	public void SetMemberid(int memberid) {
		this.memberid = memberid;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberid()-mem2.getMemberid();  //compare to()와 달리 두개의 매개변수를 비교한다
	}
	
	

}
