package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue book = new BookShelf();
		book.enQueue("�¹���1");
		book.enQueue("�¹���2");
		book.enQueue("�¹���3");
		
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());

	}

}
