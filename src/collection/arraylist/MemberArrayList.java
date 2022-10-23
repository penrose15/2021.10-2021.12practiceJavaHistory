package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;  //arrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();  //Member형으로 선언한 ArrayList생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member);   //ArrayList에 회원을 추가하는 메서드
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberid) {    //해당 아이디를 가진 회원ㅇ르 ArrayList에서 찾아 체거함
		for (int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);  //get() 메서드로 회원을 순차적으로 가져옴.ArrayList의 get()는 리스트에서 어떤 객체를 가져오는데 사용되는 메소드
			int tempid = member.getMemberId();
			if(tempid == memberid) {    //회원 아이디가 매개변수와 같다면
				arrayList.remove(i);  //해당 회원 삭제
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
