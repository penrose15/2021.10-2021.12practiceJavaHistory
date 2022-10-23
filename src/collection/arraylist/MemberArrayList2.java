package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList2 {
	private ArrayList<Member> arrayList;  //arrayList 선언
	
	public MemberArrayList2() {
		arrayList = new ArrayList<Member>();  //Member형으로 선언한 ArrayList생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member);   //ArrayList에 회원을 추가하는 메서드
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberid) {    //해당 아이디를 가진 회원ㅇ르 ArrayList에서 찾아 체거함
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {  //이후에 요소가 있는지 확인하는 메서드이며, 요소가 있다면 true반환
			Member member = ir.next();  //다음 요소 반환
			int tempid = member.getMemberId();
			if (tempid == memberid) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberid+"가 존재하지 않습니다");
		return false;
		
	}
	
	public void showAllmember() {
		for (Member member : arrayList) {
			System.out.println(member);  //member 클래서에서 재정의한 toString()이 호출되면서 회원정보가 출력됩니다
		}
		System.out.println();
	}
	
	//get() 메서드는 순차 관리를 하는 배열에서 사용하는 메서드임

}
