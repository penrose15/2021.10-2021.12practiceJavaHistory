package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("�̸� ����",1);
	}
	Person(String name, int age) { //��ȯ���� Ŭ������
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this; //this��ȯ
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noname = new Person();
		System.out.println(noname.name);
		System.out.println(noname.age);
		
		Person p = noname.returnItSelf(); //this���� Ŭ���� ������ ����
		System.out.println(p); //noname.returnitself()��ȯ�� ���
		System.out.println(noname); //�������� ���

	}

}
