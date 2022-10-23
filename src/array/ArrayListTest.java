package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library= new ArrayList<Book>(); //<>���� ��ü�� �ڷ����� �ִ´�
		
		library.add(new Book("a","b"));
		library.add(new Book("c","d"));
		library.add(new Book("e","f"));
		library.add(new Book("g","h"));
		library.add(new Book("i","j"));
		
		for (int i=0; i<library.size(); i++) { //size()�� �迭�� ��ȿ�� ���� ����� ��� ������ ��ȯ
			Book book = library.get(i); //get()�� ��Ҹ� �ϳ� �������� �޼���� �Ű������� ���° ��Ҹ� ������ ������ ����
			book.showInfo();
		}
		System.out.println()
;
		System.out.println("===���� for�� ���===");
		for(Book book : library) {
			book.showInfo();
		}
	}

}
