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
		System.out.println(lineNumber+"�� �°��� "+passengercount+"���̰� ������ "+money+"�Դϴ�.");
	}

}
