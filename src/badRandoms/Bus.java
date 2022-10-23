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
		System.out.println("버스 "+busnumber+" 번의 승객은 "+passengercount+" 명이고, 수입은 "+money+" 입니다.");
	}

}
