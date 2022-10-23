package polymorphism;

import java.util.ArrayList;

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();  //�迭�� �ڷ����� Animal
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ�ĳ����");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Bald());
		aniList.add(new Eagle());   //aniList�� �߰��Ǹ鼭 �ڷ����� Animal�� �� ��ȯ
		
		for (Animal ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {
		for (int i = 0; i<aniList.size(); i++ ) { //��� ��Ҹ� �ϳ��� ���鼭
			Animal ani = aniList.get(i);  //Animal ������ ������
			if(ani instanceof Human) {  //human�̸�
				Human h = (Human)ani;  //human������ �ٿ�ĳ����
				h.readBook();
			}
			else if(ani instanceof Bald) {
				Bald b = (Bald)ani;
				b.shining();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();	
		    }
			else {
				System.out.println("�������� �ʴ� ����̴�");
			}
	}
}
}