package polymorphism;



class Animal {
	public void move() {
		System.out.println("동물이 움직인다");
	}

}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
		
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다");
	}
}

class Bald extends Animal{
	public void move() {
		System.out.println("대머리는 두발이 없어 걷지 못한다");
	}
	
	public void shining() {
		System.out.println("머리에 빛이 난다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 날아간다");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아간다");
	}
}
