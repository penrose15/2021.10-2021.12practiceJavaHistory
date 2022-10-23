package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerlee = new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("이순신");
		customerlee.bonusPoint = 1000;
		
		System.out.println(customerlee.showCustomerInfo());
		
		Customer customerkim = new Vip(10020,"김유신",12345);
		customerkim.bonusPoint = 1000;
		
		System.out.println(customerkim.showCustomerInfo());
		System.out.println("==========할인율과 보너스 포인트 계산===========");
		
		int price = 10000;
		int leePrice = customerlee.calcPrice(price);
		int kimPrice = customerkim.calcPrice(price);
		
		System.out.println(customerlee.getCustomerName()+"님이"+leePrice+"원 지불하셨다");
		System.out.println(customerlee.showCustomerInfo());
		System.out.println(customerkim.getCustomerName()+"님이"+kimPrice+"원 지불하셨다");
		System.out.println(customerkim.showCustomerInfo());

	}

}
