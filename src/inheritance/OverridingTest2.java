package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new Vip(10030, "������",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+" ���� �����ؾ� �ϴ� �ݾ��� " +vc.CalPrice(10000)+" ���Դϴ�.");

	}

}
