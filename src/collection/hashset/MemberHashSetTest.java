package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberlee = new Member(1001, "이정길");
		Member memberjeon = new Member(1002, "전규호");
		Member memberkim = new Member(1003, "김기범");
		
		memberHashSet.addMember(memberlee);
		memberHashSet.addMember(memberjeon);
		memberHashSet.addMember(memberkim);
		memberHashSet.showAllMember();
		
		Member memberha = new Member(1003,"하현우");  //아이디가 중복됨에도 추가가 됨->고쳐
		memberHashSet.addMember(memberha);
		memberHashSet.showAllMember();
	}

}
