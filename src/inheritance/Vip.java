package inheritance;

public class Vip extends Customer{
	private int agentID;
	double saleRatio=0.1;
	
	/*public Vip() {
		//super(); //�����Ϸ��� �ڵ����� �߰��ϴ� �ڵ��̴�, ���� Ŭ������ Customer()�� ȣ�ٵ�
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("Vip() ������ ȣ��");
	}*/
	public Vip(int customerID, String customerName, int agentID) {
		super(customerID,customerName); //���� Ŭ������ �����ڸ� ȣ���ϴ� ������ �Ѵ�
		customerGrade = "Gold";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("Vip(int,String, int)������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public int CalPrice(int price) {  //�������̵�, �޼��� ������
		bonusPoint +=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public String showVipInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}//���� Ŭ���� �޼��带 ���� Ŭ������ ������ ���� super�� ����Ѵ�.

	/*@Override
	public int CalPrice(int price) {
		// TODO Auto-generated method stub
		return super.CalPrice(price);
	}*/
	
	}


