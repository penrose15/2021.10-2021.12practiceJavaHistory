package object2;

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
		if (obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.day == md.day) {
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
		MyDate date1 = new MyDate(11, 9 ,2021);
		MyDate date2 = new MyDate(11, 9, 2021);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());  //재정의된 해시코드값
		System.out.println(date2.hashCode());
		
		System.out.println(System.identityHashCode(date1));  //실재 해시코드값
		System.out.println(System.identityHashCode(date2));

	}

	

	

}
