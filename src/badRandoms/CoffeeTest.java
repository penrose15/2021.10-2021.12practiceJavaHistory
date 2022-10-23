package badRandoms;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("±è",10000);
		Starbuck starbuck = new Starbuck();
		kim.takeMoney(starbuck);
		kim.showInfo();

	}

}
