package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Buy buyer = c;       //Customer Ŭ�������� c�� Buy�������̽����� buyer�� �����Ͽ� �� ��ȯ, 
		buyer.buy();         //buyer�� Buy�������̽� �޼��常 ȣ�� �����ϴ�  
		buyer.order();
		
		Sell seller = c;        //Sell���� ������ ����Ʈ �޼��尡 �ƴϴ� Customer���� �������� �޼��尡 ����
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) {          //seller�� ���� Ŭ�������� Customer�� �ٽ�
			Customer c2 = (Customer)seller;        //�� ��ȯ   
			c2.buy();
			c2.sell();
		}
		c.order();
		
		

	}

}
