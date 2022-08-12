package dp_03_Template_Method;

/* 추상 클래스를 상속받아 open(), print(), close()를 구현한다.
 * 추상 메소드들을 구현해서 Template method의 동작을 구현하는 것과
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
    
}
