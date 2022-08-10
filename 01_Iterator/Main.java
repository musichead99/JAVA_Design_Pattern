/* 동작을 테스트하는 클래스 */

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("The Man Who Laughs")); // 연습문제를 위해 추가

        Iterator it = bookShelf.iterator();

        /* 해당 while 루프는 bookshelf의 구현에 의존하지 않는다. -> 클래스의 재이용화 촉진 */
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
