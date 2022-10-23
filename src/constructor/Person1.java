package constructor;

public class Person1 {
	String name;
	float height;
	float weight;
	
	public Person1() { }
	
	public Person1(String name) {
		this.name = name;
	}
	
	public Person1(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

}
