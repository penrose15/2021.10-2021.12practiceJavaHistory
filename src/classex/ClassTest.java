package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass = person.getClass();  //Object의 getClass()메서드 사용하기
		System.out.println(pClass.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());//직접 class 파일 대입하기
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		

	}

}
