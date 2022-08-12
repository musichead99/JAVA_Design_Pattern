package 상속;

/* adapter -> adaptee역할의 메소드를 사용해서 target의 역할을 만족시킨다.( showWithParen() -> printWeak) */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
