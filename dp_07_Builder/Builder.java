package dp_07_Builder;

/* 문서를 구성하기 위한 메소드를 결정하는 추상 클래스 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
/* 인스턴스를 생성하기 위한 인터페이스를 결정한다. */