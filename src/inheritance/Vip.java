package inheritance;

public class Vip extends Customer{
	private int agentID;
	double saleRatio=0.1;
	
	/*public Vip() {
		//super(); //컴파일러가 자동으로 추가하는 코드이다, 상위 클래스의 Customer()가 호줄됨
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("Vip() 생성자 호출");
	}*/
	public Vip(int customerID, String customerName, int agentID) {
		super(customerID,customerName); //상위 클래스의 생성자를 호출하는 역할을 한다
		customerGrade = "Gold";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("Vip(int,String, int)생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public int CalPrice(int price) {  //오버라이드, 메서드 재정의
		bonusPoint +=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public String showVipInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
	}//상위 클라스의 메서드를 하위 클래스가 참조할 때도 super를 사용한다.

	/*@Override
	public int CalPrice(int price) {
		// TODO Auto-generated method stub
		return super.CalPrice(price);
	}*/
	
	}


