package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerA = new Customer();
		customerA.setCustomerID(1000);
		customerA.setCustomerName("윤도현");
		customerA.bonusPoint = 1009;
		System.out.println(customerA.showCustomerInfo());
		
		Vip customerB = new Vip();
		customerB.setCustomerID(1001);
		customerB.setCustomerName("하현우");
		customerB.bonusPoint = 10000;
		System.out.println(customerB.showCustomerInfo());
	}

}
