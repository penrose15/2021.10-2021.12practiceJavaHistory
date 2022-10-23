package badRandoms;

public class Person {
	public int money;
	public String name;
	public String coffee;
	
	public Person(String name,  int money) {
		this.name = name;
		
		this.money = money;
	}
	public void takeMoney(Starbuck starbuck) {
		starbuck.takeMoney(4000);
		this.money -= 4000;
	}
	/*public void TakeBean(Bean bean) {
		bean.takeMoney(4500);
		int money =money-4500;*/

	//}
	public void showInfo() {
		System.out.println(name+"¥‘¿« ¿‹æ◊¿∫"+money+"¿‘¥œ¥Ÿ.");
	}

}
