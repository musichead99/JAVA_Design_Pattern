package 위임;

/* 위임 : 어떤 메소드의 실제 처리를 다른 인스턴스의 메소드에 맡김
 * 여기서는 실제 출력을 Banner의 인스턴스에 위임함
 */

public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
