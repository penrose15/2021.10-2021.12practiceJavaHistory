package arraylist_prac;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("a","b");
		dog[1] = new Dog("c","d");
		dog[2] = new Dog("e","f");
		dog[3] = new Dog("g","h");
		dog[4] = new Dog("i","j");
		
		for (int i=0; i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		for (Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
