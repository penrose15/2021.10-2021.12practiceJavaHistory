package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}*/
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		bonusRatio = 0.01;
		//System.out.println("Customer(int ,String)생성자 호출");
	}
	public int CalPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+"의 보너스포인트는"+bonusPoint+"이고 등급은"+customerGrade+" 입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
