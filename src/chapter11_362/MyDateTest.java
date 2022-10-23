package chapter11_362;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate my = (MyDate)obj;
			if(this.day == my.day) {
				return true;
			}
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return day;
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
		System.out.println(System.identityHashCode(date2)+" , "+System.identityHashCode(date1));

	}

	

	

}
