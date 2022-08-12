import java.util.ArrayList;

/* 서가를 나타내는 클래스 */

// public class BookShelf implements Aggregate {
//     private Book[] books;
//     private int last = 0;

//     public BookShelf(int maxsize) {
//         this.books = new Book[maxsize];
//     }

//     public Book getBookAt(int index) {
//         return books[index];
//     }

//     public void appendBook(Book book) {
//         this.books[last] = book;
//         last++;
//     }

//     public int getLength() {
//         return last;
//     }

//     public Iterator iterator() {
//         return new BookShelfIterator(this);
//     }
// }

/* 연습문제 : ArrayList를 이용해서 서가의 크기를 초과해도 책을 추가할 수 있도록 해라 */

public class BookShelf implements Aggregate {
    private ArrayList<Book> books; // ArrayList로 변경
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}