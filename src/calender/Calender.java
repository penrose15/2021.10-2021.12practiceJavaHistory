package calender;

import java.util.Calendar;
import java.util.Scanner;

public class Calender {
	private static final int[] MaxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDayOfMonth(int month) {
		return MaxDay[month-1];
	}
	
	public static void main(String[] args) {
		String prompt = "cal>";
		Scanner sc = new Scanner(System.in);
		Calender cal = new Calender();
		
		System.out.println("���� �Է��ϼ��� : ");
		System.out.print(prompt);
		
		int month = sc.nextInt();
		for (int i=0; ;i++) {
			if (month>0 && month<13) {
				System.out.printf("%d���� %d������ �Դϴ�",month,cal.getMaxDayOfMonth(month));break;}
			else if(month ==0 || month<-1 || month>13) {
				continue;}
			else if (month == -1) {
				System.out.println("�۾� ����");break;
			}
		}
		
		
		

}

	}

