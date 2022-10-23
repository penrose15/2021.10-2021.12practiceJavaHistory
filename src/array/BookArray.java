package array;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("나에게 없는것","톤");
		library[1] = new Book("이제는 잠과 재력이다","홍성연");
		library[2] = new Book("돈 많은 백수가 되는 법","있겠냐");
		library[3] = new Book("퇴사하고 싶다","홍성주");
		library[4] = new Book("복대와 면역력","하현좌");
		
	    for (int i=0;i<library.length;i++) {
	    	library[i].showInfo();  //Book 인스턴스 멤버들
	    }
	    for (int i=0;i<library.length;i++) {
	    	System.out.println(library[i]); //Book인스턴스를 저장한 메모리 공간 주소
	    }
	}

}
