package sang_sook;

public class Housedog extends Dog{
	
	
	
	
	public void sleeping( ) {
		System.out.println(this.name+" is sleeping"); //부모 클래스 메소드 동일(메소드 오버라이딩, 메소드 덮어쓰기)
	}
	public void sleeping(int hour) {
		System.out.println(this.name+" is sleeping in house for "+hour+"hours");
		}
	

	public static void main(String[] args) {
		Housedog housedog = new Housedog();
		housedog.setName("cheese");
		housedog.sleeping();  //sleeping() 메소드 호출
		housedog.sleeping(5);  //sleeping(int hour)메소드 호출
		//입력항목이 다르면 동일한 이름의 여러 메소드를 만들 수 있다(메소드 오버로딩)

	}

}
