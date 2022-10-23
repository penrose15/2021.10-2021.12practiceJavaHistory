package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library= new ArrayList<Book>(); //<>에는 객체의 자료형을 넣는다
		
		library.add(new Book("a","b"));
		library.add(new Book("c","d"));
		library.add(new Book("e","f"));
		library.add(new Book("g","h"));
		library.add(new Book("i","j"));
		
		for (int i=0; i<library.size(); i++) { //size()는 배열에 유효한 값이 저장된 요소 개수를 반환
			Book book = library.get(i); //get()는 요소를 하나 가져오는 메서드로 매개변수로 몇번째 요소를 가져올 것인지 지정
			book.showInfo();
		}
		System.out.println()
;
		System.out.println("===향상된 for문 사용===");
		for(Book book : library) {
			book.showInfo();
		}
	}

}
