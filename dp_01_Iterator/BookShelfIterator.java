/* 서가를 검색하는 클래스 */

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) { // 다음 요소가 있는지 확인 
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index); // 다음 요소
        index++; // 내부적 조정
        return book;
    }
    
}

/* 구체적인 반복자(ConcreteIterator) */
