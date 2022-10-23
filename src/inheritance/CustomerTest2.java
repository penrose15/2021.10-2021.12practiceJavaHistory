package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		Vip kim = new Vip();
		kim.setCustomerID(10020);
		kim.setCustomerName("±Ë¿ØΩ≈");
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());

	}

}
