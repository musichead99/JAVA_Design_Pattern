package dp_07_Builder;

/* 한 개의 문서를 만드는 클래스 */
public class Director {
    private Builder builder;
    public Director(Builder builder) { // Builder클래스의 하위 인스턴스가 주어짐
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("아침과 낮에");
        builder.makeItems(new String[] {
            "좋은 아침입니다.",
            "안녕하세요.",
        });
        builder.makeString("밤에");
        builder.makeItems(new String[] {
            "안녕하세요.",
            "안녕히 주무세요.",
            "안녕히 가세요.",
        });
        builder.close();
    }
}
/* Builder역할의 API를 사용해서 인스턴스를 생성 -> Builder가 TextBuilder인지 HTMLBuilder인지는 모름
 *  -> 이 때문에 TextBuilder, HTMLBuilder로 교체해도 상관이 없게 됨 -> 교환가능성
 */