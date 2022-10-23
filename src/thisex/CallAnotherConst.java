package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음",1);
	}
	Person(String name, int age) { //반환형은 클래스형
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this; //this반환
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noname = new Person();
		System.out.println(noname.name);
		System.out.println(noname.age);
		
		Person p = noname.returnItSelf(); //this값을 클래스 변수에 대입
		System.out.println(p); //noname.returnitself()반환값 출력
		System.out.println(noname); //참조변수 출력

	}

}
