package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();               //고객 포인트와 보너스 포인트 적립률 지정 함수 호출
	}
	public Customer(int customerID, String customerName) {
		this.customerID =customerID;
		this.customerName = customerName;
		initCustomer();             //고객 포인트와 보너스 포인트 적립률 지정 함수 호출
	}
	
	private void initCustomer() {         //멤버 변수의 초기화 부분
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade +" 이며, 보너스 포인트는 "+ bonusPoint+" 입니다.";
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
