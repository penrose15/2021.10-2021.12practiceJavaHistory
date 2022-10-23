package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member a = new Member(1, "하현우");
		Member b = new Member(2, "김기범");
		Member c = new Member(3, "전규호");
		Member d = new Member(4, "이정길");
		
		memberTreeMap.addMember(a);
		memberTreeMap.addMember(b);
		memberTreeMap.addMember(c);
		memberTreeMap.addMember(d);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(2);
		memberTreeMap.showAllMember();
		

	}

}
