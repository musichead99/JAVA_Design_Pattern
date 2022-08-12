package dp_03_Template_Method;

/* 추상 클래스를 상속받아 open(), print(), close()를 구현한다.
 * 추상 메소드들을 구현해서 Template method의 동작을 구현하는 것과
 */
public class StringDisplay extends AbstractDisplay {
    
    private String s;
    private int width;
    public StringDisplay(String s) {
        this.s = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
