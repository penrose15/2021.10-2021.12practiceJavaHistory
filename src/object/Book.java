package object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + " , " +bookNumber;
	}
	
	public class ToStringEx {
		public static void main(String[] args) {
			Book book1 = new Book(200, "������ ��Ƽī");
			
			System.out.println(book1);
			System.out.println(book1.toString());
		}
	}

	

}
