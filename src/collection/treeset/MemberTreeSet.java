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
		
		while(ir.hasNext()) {  //만약 있으면 True 내보냄
			Member member = ir.next();  //다음놈 끌고 와서
			int tempid = member.getMemberId();  //매게변수와 같으면
			if(tempid == memberid) {
				treeSet.remove(member);  //쓱싹
				return true;
			}
			
		}
		System.out.println(memberid+"가 존재하지 않습니다");
		return false;
		
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
			
		}
		System.out.println();
	}

}
