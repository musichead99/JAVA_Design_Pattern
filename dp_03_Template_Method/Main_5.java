package dp_03_Template_Method;

/* 동작 테스트용 클래스 */
public class Main_5 {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("안녕하세요.");

        d1.display();
        d2.display();
        d3.display();
    }
}
