package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();  //display�� typing�� �Ϸ� Ŭ������ ���� ������ �޶���
	public void turnOn() {
		System.out.println("������ ŵ�ϴ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�");  //turnon, turnoff�� Computer�� ��� �޴� Ŭ���� ���� �������� ����
	}
}
