package witharraylist;

public class Vip extends Customer{
	private int agentID;
	double saleRatio;
	
	public Vip(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";                    //super�� public Customer(int customerID, String customerName) {
		bonusRatio = 0.05;                        //this.customerID =customerID;
		saleRatio =0.1;                           //this.customerName = customerName;
		this.agentID = agentID;                   //  ... ����Ŭ������ �����ڸ� �ҷ��´�.
	}
	
	public int calcPrice(int price) {                //������
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showCustomerInfo() {                 //������
		return super.showCustomerInfo() + "��� ������ ��ȣ�� " + agentID +"�Դϴ�";
	}
	
	public int getAgentID() {
		return agentID;
	}

}
