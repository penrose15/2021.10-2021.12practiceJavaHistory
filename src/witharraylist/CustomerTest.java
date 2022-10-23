package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerlee = new Customer(10010, "이정길");
		Customer customerha = new Customer(10020, "하현우");
		Customer customerjeon = new GoldCustomer(10030,"전규호");
		Customer customerkim = new Vip(10040, "김기범", 12345);
		
		customerList.add(customerlee);
		customerList.add(customerha);
		customerList.add(customerjeon);
		customerList.add(customerkim);
		
		System.out.println("====고객정보출력====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==========할인율과 보너스 포인트 계산===========");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는"+ customer.bonusPoint+"점입니다.");
		}

	}

}
