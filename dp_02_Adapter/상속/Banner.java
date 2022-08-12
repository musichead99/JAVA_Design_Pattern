package 상속;

/* 생성 시 입력받은 문자열에 효과를 더해주는 클래스 */
/* adaptee -> 개조되는 쪽(이미 준비되어 있는 메소드를 가지고 있음) */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
