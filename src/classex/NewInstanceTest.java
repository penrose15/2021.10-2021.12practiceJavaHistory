package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();  //�����ڷ� ����
		System.out.println(person1);  
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();  //ClassŬ������ newInstance()�޼���� ����
		System.out.println(person2);
		

	}

}
