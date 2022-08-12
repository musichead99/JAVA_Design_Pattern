package 위임;

/* Target -> 실제 사용하는 것(Main 클래스를 보면 Print로 선언한다) */
public abstract class Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
