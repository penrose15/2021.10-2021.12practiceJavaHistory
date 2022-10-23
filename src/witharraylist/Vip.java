package witharraylist;

public class Vip extends Customer{
	private int agentID;
	double saleRatio;
	
	public Vip(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";                    //super는 public Customer(int customerID, String customerName) {
		bonusRatio = 0.05;                        //this.customerID =customerID;
		saleRatio =0.1;                           //this.customerName = customerName;
		this.agentID = agentID;                   //  ... 상위클래스의 생성자를 불러온다.
	}
	
	public int calcPrice(int price) {                //재정의
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showCustomerInfo() {                 //재정의
		return super.showCustomerInfo() + "담당 상담원의 번호는 " + agentID +"입니다";
	}
	
	public int getAgentID() {
		return agentID;
	}

}
