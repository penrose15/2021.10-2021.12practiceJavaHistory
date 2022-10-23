package calender;

import java.util.Scanner;

public class Calender4 {
	public int day;
	public int month;
	public int year;
	public int week;
	
	public Calender4(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">연도를 입력하시오: ");
		int syear = sc.nextInt();
		
		System.out.println(">월을 입력하시요: ");
		int smonth = sc.nextInt();
		
		System.out.println(">일을 입력하시요: ");
		int sday = sc.nextInt();
		
		Calender4 cal = new Calender4(syear, smonth, sday);
		 
		

	}

}
