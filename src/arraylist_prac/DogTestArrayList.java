package arraylist_prac;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog("a", "b"));
		dog.add(new Dog("c", "g"));
		dog.add(new Dog("d", "h"));
		dog.add(new Dog("e", "i"));
		dog.add(new Dog("f", "j"));
		
		for (Dog a : dog) {
			System.out.println(a.showDogInfo());
		}

	}

}
