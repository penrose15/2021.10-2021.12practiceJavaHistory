package test;

public class Beginner extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("�޸��ϴ�");
	}
	
	@Override
	public void jump() {
		System.out.println("��������");
	}
	
	@Override
	public void turn() {
		System.out.println("���� ����");
	}
	
	@Override
	public void showPlayerInfo() {
		System.out.println("�ʺ���");
	}

}
