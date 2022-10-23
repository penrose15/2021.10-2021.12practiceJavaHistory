package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerlee = new Customer(10010, "이순신");
		customerlee.bonusPoint = 1000;
		
		Vip customerkim = new Vip(10020, "김유신", 12345);
		customerkim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerlee.getCustomerName()+"님이 지불해야 하는 금액은 "+customerlee.CalPrice(price)+" 원입니다.");
		System.out.println(customerkim.getCustomerName()+"님이 지불해야 하는 금액은 "+customerkim.CalPrice(price)+" 원입니다.");
		

	}

}
