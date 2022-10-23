package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {  //배열에 요소 추가
		shelf.add(title);
		
	}

	@Override
	public String deQueue() { // 맨처음 요소를 배열에서 삭제후 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {  //배열 요소개수 제한
		return getCount();
	}

}
