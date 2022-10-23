package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerlee = new Customer(10010, "������");
		Customer customerha = new Customer(10020, "������");
		Customer customerjeon = new GoldCustomer(10030,"����ȣ");
		Customer customerkim = new Vip(10040, "����", 12345);
		
		customerList.add(customerlee);
		customerList.add(customerha);
		customerList.add(customerjeon);
		customerList.add(customerkim);
		
		System.out.println("====���������====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==========�������� ���ʽ� ����Ʈ ���===========");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����" + cost + "�� �����ϼ̽��ϴ�");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ��"+ customer.bonusPoint+"���Դϴ�.");
		}

	}

}
