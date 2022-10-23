package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass = person.getClass();  //Object�� getClass()�޼��� ����ϱ�
		System.out.println(pClass.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());//���� class ���� �����ϱ�
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		

	}

}
