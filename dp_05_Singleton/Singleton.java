package dp_05_Singleton;

/* 유일한 인스턴스를 얻기 위한 static 메소드를 가지고 있음
 * 생성자를 private로 지정하여 외부에선 호출하지 못하는 것을 보장 
 * getInstance 메소드를 사용 시 static상태로 이미 가지고 있는 단 하나의 인스턴스를 반환 -> 인스턴스가 1개뿐인 것을 보증
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
