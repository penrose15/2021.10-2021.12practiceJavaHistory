package calender;

import java.util.Calendar;
import java.util.Scanner;

public class Calender_week {
	public int syear;
	public int smonth;
	
	
	public Calender_week(int syear, int smonth) {
		this.syear = syear;
		this.smonth = smonth;
		
	}
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println(">연도를 입력하시오: ");
		int ayear = sc.nextInt();
		
		System.out.println(">월을 입력하시오: ");
		int amonth = sc.nextInt();
		
		Calender_week cal = new Calender_week(ayear, amonth);
		
		ayear = cal.syear;
		amonth = cal.smonth;
	
		
		Calendar date1 = Calendar.getInstance();
		
		date1.set(Calendar.YEAR, ayear);
		date1.set(Calendar.MONTH, amonth-1);
		date1.set(Calendar.DATE, 1);
		
		
		
		int dow = date1.get(Calendar.DAY_OF_WEEK);
		
		int endDate = date1.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		System.out.println("======================="+(amonth)+"월 =======================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=1;i<dow;i++) {
			System.out.print("\t");
		}
		for (int l=1;l<=endDate;l++) {
			date1.set(Calendar.DATE,l);
			System.out.print(l+"\t");
			
			int j = date1.get(Calendar.DAY_OF_WEEK);
			if (j%7 == 0) {
				System.out.println(" ");
			}
			
			}
			
			
		sc.close();
		}
		
		
		
		
		
		
		
		
		

	}

