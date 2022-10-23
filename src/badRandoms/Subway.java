package badRandoms;

public class Subway {
	String lineNumber;
	int passengercount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
		public void take(int money) {
			this.money +=money;
			passengercount++;
		}
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은 "+passengercount+"명이고 수입은 "+money+"입니다.");
	}

}
