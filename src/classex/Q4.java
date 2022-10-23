package classex;

class Mydog {
	String name;
	String type;
	
	Mydog(String name, String type) {
		this.name = name;
		this.type = type;
		
	}
	public String toString() {
		return type+name;
	}
}

public class Q4 {

	public static void main(String[] args) {
		Mydog dog = new Mydog("∏€∏€¿Ã","¡¯µæ∞≥");
		System.out.println(dog);

	}

}
