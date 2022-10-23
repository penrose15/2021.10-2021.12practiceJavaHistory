package badRandoms;

public class Starbuck {
	int money;
	
	int moneyLeft;
	int person1;
	
	public int takeMoney(int money) {
		money +=4000;
		person1++;
		return money;
		
	}
	public void showInfo() {
		System.out.println("손님 수는"+person1+"이고 수익은"+money+"입니다.");
	}

}
