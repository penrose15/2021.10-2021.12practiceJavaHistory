package inheritance;


public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerA = new Customer(10010, "이순신");
		System.out.println(customerA.getCustomerName()+"님이 지불해야 할 금액은 " + customerA.CalPrice(price) + "원입니다.");
		
		Vip customerB = new Vip(10020,"김연비", 12345);
		System.out.println(customerB.getCustomerName()+"님이 지불해야 할 금액은"+customerB.CalPrice(price)+"원 입니다.");
		
		Customer vc = new Vip(10030,"김빛솔", 56789);
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 "+ vc.CalPrice(10000)+" 원입니다.");
		

	}

}
