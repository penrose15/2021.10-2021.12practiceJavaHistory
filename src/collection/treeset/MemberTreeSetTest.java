package collection.treeset;


import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		Member memberlee = new Member(1, "¿ëÄí");
		Member memberkim = new Member(100, "µşÄí");
		Member memberpark = new Member(24, "¹ı»ç¸ÀÄíÅ°");
		Member memberchoi = new Member(35, "±ÙÀ°¸ÀÄíÅ°");
		
		mts.addMember(memberlee);
		mts.addMember(memberkim);
		mts.addMember(memberpark);
		mts.addMember(memberchoi);
		
		mts.showAllMember();
		
		Member memberhong = new Member(33,"Ç»¹Ù¸ÀÄíÅ°");
		mts.addMember(memberhong);
		mts.showAllMember();

	}

}
