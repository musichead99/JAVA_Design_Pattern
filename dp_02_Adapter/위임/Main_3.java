package 위임;

/* Client -> Target역할의 메소드를 사용해서 일을 한다. */
public class Main_3 {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");

        p.printWeak();
        p.printStrong();
    }
}
