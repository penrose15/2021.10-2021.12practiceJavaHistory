package polymorphism;

import java.util.ArrayList;

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();  //배열의 자료형은 Animal
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Bald());
		aniList.add(new Eagle());   //aniList에 추가되면서 자료형은 Animal로 형 변환
		
		for (Animal ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {
		for (int i = 0; i<aniList.size(); i++ ) { //모든 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);  //Animal 형으로 가져옴
			if(ani instanceof Human) {  //human이면
				Human h = (Human)ani;  //human형으로 다운캐스팅
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
				System.out.println("지원되지 않는 기능이다");
			}
	}
}
}