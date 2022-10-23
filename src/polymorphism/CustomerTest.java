package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerlee = new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("�̼���");
		customerlee.bonusPoint = 1000;
		
		System.out.println(customerlee.showCustomerInfo());
		
		Customer customerkim = new Vip(10020,"������",12345);
		customerkim.bonusPoint = 1000;
		
		System.out.println(customerkim.showCustomerInfo());
		System.out.println("==========�������� ���ʽ� ����Ʈ ���===========");
		
		int price = 10000;
		int leePrice = customerlee.calcPrice(price);
		int kimPrice = customerkim.calcPrice(price);
		
		System.out.println(customerlee.getCustomerName()+"����"+leePrice+"�� �����ϼ̴�");
		System.out.println(customerlee.showCustomerInfo());
		System.out.println(customerkim.getCustomerName()+"����"+kimPrice+"�� �����ϼ̴�");
		System.out.println(customerkim.showCustomerInfo());

	}

}
