package sang_Sook_Ex;

public class Customertest2 {

	public static void main(String[] args) {
		Vip customerkim = new Vip();
		customerkim.setCustomerID(10020);
		customerkim.setCustomerName("kim");
		customerkim.bonuspoint = 10000;
		System.out.println(customerkim.showCustomerInfo());

	}

}
