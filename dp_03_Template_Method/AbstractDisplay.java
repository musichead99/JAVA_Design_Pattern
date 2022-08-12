package dp_03_Template_Method;

/* 메소드 display만 구현되고 있는 추상 클래스
 * open(), print(), close()는 하위 클래스에서 구현
 * 따라서 위의 3가지 메소드들이 실제로 하는 일은 해당 클래스만 확인해서는 알 수가 없음
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display() { // Template method
        open();
        for(int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
/* Template method의 장점 : 상위 클래스의 템플릿 메소드에서 알고리즘이 기술되어 있으므로 하위 클래스에까지 일일히 기술할 필요 없음 */
/* 상위 클래스명의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다(하위 클래스를 상위 클래스와 동일시함) -> LSP원칙 */