package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new Vip(10030, "하현우",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 " +vc.CalPrice(10000)+" 원입니다.");

	}

}
