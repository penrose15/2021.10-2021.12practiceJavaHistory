package inheritance;


public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerA = new Customer(10010, "�̼���");
		System.out.println(customerA.getCustomerName()+"���� �����ؾ� �� �ݾ��� " + customerA.CalPrice(price) + "���Դϴ�.");
		
		Vip customerB = new Vip(10020,"�迬��", 12345);
		System.out.println(customerB.getCustomerName()+"���� �����ؾ� �� �ݾ���"+customerB.CalPrice(price)+"�� �Դϴ�.");
		
		Customer vc = new Vip(10030,"�����", 56789);
		System.out.println(vc.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� "+ vc.CalPrice(10000)+" ���Դϴ�.");
		

	}

}
