package badRandoms;

public class Bus {
	int busnumber;
	int passengercount;
	int money;
	
	public Bus(int busnumber) {
		this.busnumber = busnumber;
	}
	public void take(int money) {
		this.money+=money;
		passengercount++;
	}
	public void showInfo() {
		System.out.println("���� "+busnumber+" ���� �°��� "+passengercount+" ���̰�, ������ "+money+" �Դϴ�.");
	}

}
