package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue book = new BookShelf();
		book.enQueue("ลยน้ป๊ธฦ1");
		book.enQueue("ลยน้ป๊ธฦ2");
		book.enQueue("ลยน้ป๊ธฦ3");
		
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());
		System.out.println(book.deQueue());

	}

}
