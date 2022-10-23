package sang_Sook_Ex;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonuspoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public int calPrice(int price) {
		bonuspoint += price*bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+" 이며 보너스 포인트는 "+bonuspoint+" 입니다.";
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
	//protected 에약어로 선언한 변수를 외부에서 쓸 수 있도록 get(), set()메서드 사용, get()로 값을 가져오고 set()로 값을 지정할 수 있음

}
