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
		System.out.println("택시 번호는 "+taxiNumber+" 이고,탑승인원은 "+passengercount+"이고 수입은 "+money+"입니다.");
	}
	

}
