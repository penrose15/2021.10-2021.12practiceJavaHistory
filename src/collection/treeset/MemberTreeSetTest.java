package collection.treeset;


import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		Member memberlee = new Member(1, "����");
		Member memberkim = new Member(100, "����");
		Member memberpark = new Member(24, "�������Ű");
		Member memberchoi = new Member(35, "��������Ű");
		
		mts.addMember(memberlee);
		mts.addMember(memberkim);
		mts.addMember(memberpark);
		mts.addMember(memberchoi);
		
		mts.showAllMember();
		
		Member memberhong = new Member(33,"ǻ�ٸ���Ű");
		mts.addMember(memberhong);
		mts.showAllMember();

	}

}
