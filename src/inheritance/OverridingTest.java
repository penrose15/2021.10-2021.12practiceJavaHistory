package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerlee = new Customer(10010, "�̼���");
		customerlee.bonusPoint = 1000;
		
		Vip customerkim = new Vip(10020, "������", 12345);
		customerkim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerlee.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+customerlee.CalPrice(price)+" ���Դϴ�.");
		System.out.println(customerkim.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+customerkim.CalPrice(price)+" ���Դϴ�.");
		

	}

}
