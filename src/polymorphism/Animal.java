package polymorphism;



class Animal {
	public void move() {
		System.out.println("������ �����δ�");
	}

}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�");
		
	}
	
	public void readBook() {
		System.out.println("����� å�� �д´�");
	}
}

class Bald extends Animal{
	public void move() {
		System.out.println("��Ӹ��� �ι��� ���� ���� ���Ѵ�");
	}
	
	public void shining() {
		System.out.println("�Ӹ��� ���� ����");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� ���ư���");
	}
	
	public void flying() {
		System.out.println("�������� ������ ��� ���ư���");
	}
}
