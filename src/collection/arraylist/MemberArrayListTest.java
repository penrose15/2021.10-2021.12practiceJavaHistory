package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberlee = new Member(1001, "이정길");
		Member memberkim = new Member(1002, "김기범");
		Member memberjeon = new Member(1003, "전규호");
		Member memberha = new Member(1004, "하현우");    //새로운 회원 인스턴트 생성
		Member memberchung = new Member(1005, "이청희");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberkim);
		memberArrayList.addMember(memberjeon);
		memberArrayList.addMember(memberha);  //ArrayList에 회원 추가
		memberArrayList.insertMember(memberchung, 1);
		
		memberArrayList.showAllmember();
		
		memberArrayList.removeMember(memberha.getMemberId());  //하현우 없는 국카스텐...?
		memberArrayList.showAllmember();

	}

}
