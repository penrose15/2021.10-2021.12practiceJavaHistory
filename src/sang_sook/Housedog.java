package sang_sook;

public class Housedog extends Dog{
	
	
	
	
	public void sleeping( ) {
		System.out.println(this.name+" is sleeping"); //�θ� Ŭ���� �޼ҵ� ����(�޼ҵ� �������̵�, �޼ҵ� �����)
	}
	public void sleeping(int hour) {
		System.out.println(this.name+" is sleeping in house for "+hour+"hours");
		}
	

	public static void main(String[] args) {
		Housedog housedog = new Housedog();
		housedog.setName("cheese");
		housedog.sleeping();  //sleeping() �޼ҵ� ȣ��
		housedog.sleeping(5);  //sleeping(int hour)�޼ҵ� ȣ��
		//�Է��׸��� �ٸ��� ������ �̸��� ���� �޼ҵ带 ���� �� �ִ�(�޼ҵ� �����ε�)

	}

}
