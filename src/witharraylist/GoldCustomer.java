package witharraylist;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super (customerID, customerName);
		customerGrade = "Gold";
		saleRatio = 0.02;
		bonusRatio = 0.1;
	}
	public int CalcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price-(int)(price*saleRatio);
	}
}
