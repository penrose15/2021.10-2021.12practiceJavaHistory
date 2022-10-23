package abstractex;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");   //추상 메서드의 몸체 코드 작성
		
	}

}
