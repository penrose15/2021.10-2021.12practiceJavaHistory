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
		System.out.println("�մ� ����"+person1+"�̰� ������"+money+"�Դϴ�.");
	}

}
