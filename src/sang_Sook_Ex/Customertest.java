package sang_Sook_Ex;

public class Customertest {

	public static void main(String[] args) {
		Customer customerlee = new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("�̼���");
		customerlee.bonuspoint = 1000;
		System.out.println(customerlee.showCustomerInfo());
		
		Vip customerkim = new Vip();
		customerkim.setCustomerID(10020);
		customerkim.setCustomerName("������");
		customerkim.bonuspoint = 10000;
		System.out.println(customerkim.showCustomerInfo());

	}

}
