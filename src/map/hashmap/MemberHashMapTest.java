package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member a = new Member(1001, "하현우");
		Member b = new Member(1002, "이정길");
		Member c = new Member(1003, "전규호");
		Member d = new Member(1004, "김기범");
		
		memberHashMap.addMember(a);
		memberHashMap.addMember(b);
		memberHashMap.addMember(c);
		memberHashMap.addMember(d);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);  //그동안 국카스텐을 사랑해주셔서 감사합니다 이제 카스텐으로 새롭게 돌아왔습니다.
		memberHashMap.showAllMember();

	}

}
