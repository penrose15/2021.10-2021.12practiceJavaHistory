package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Person1 personkim = new Person1("����", 183.0F, 77.0F);
		
		Person1 personlee = new Person1();
		personlee.name = "������";
		personlee.height = 175.0F;
		personlee.weight = 75.0F;
	}

}
