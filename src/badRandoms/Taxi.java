package badRandoms;

public class Taxi {
	int taxiNumber;
	int money;
	int passengercount;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money+=money;
		passengercount++;
	}
	public void showInfo() {
		System.out.println("�ý� ��ȣ�� "+taxiNumber+" �̰�,ž���ο��� "+passengercount+"�̰� ������ "+money+"�Դϴ�.");
	}
	

}
