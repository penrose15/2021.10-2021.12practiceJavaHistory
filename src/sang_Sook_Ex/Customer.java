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
		System.out.println("Customer() ������ ȣ��");
	}
	
	public int calPrice(int price) {
		bonuspoint += price*bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName+" ���� ����� "+customerGrade+" �̸� ���ʽ� ����Ʈ�� "+bonuspoint+" �Դϴ�.";
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
	//protected ������ ������ ������ �ܺο��� �� �� �ֵ��� get(), set()�޼��� ���, get()�� ���� �������� set()�� ���� ������ �� ����

}
