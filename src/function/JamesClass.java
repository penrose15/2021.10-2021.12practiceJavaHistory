package function;

public class JamesClass {
	int personOld;
	String personName;
	boolean inMarried;
	int personChild;
	

	public static void main(String[] args) {
		JamesClass person = new JamesClass();
		person.personOld = 40;
		person.personName = "James";
		person.inMarried = true;
		person.personChild = 3;
		
		
		
		
		System.out.println("나이가"+person.personOld+"살, 이름이 "+person.personName+"라는 남자가 있습니다.이 남자는 결혼을 "+person.inMarried+"했고, 자식이 "+person.personChild+"있다");
	}

}
