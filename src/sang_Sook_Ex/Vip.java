package sang_Sook_Ex;

public class Vip extends Customer{
	private int agentID;
	double saleratio;
	
	public Vip() {
		customerGrade = "Gold";
		bonusRatio = 0.05;
		saleratio = 0.1;
		System.out.println("Vip() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	



}
