package dp_06_Prototype.framework;

/* 추상 메소드 use와 createClone이 선언되어 있는 인터페이스 */
// public interface Product extends Cloneable {
//     public abstract void use(String s);
//     public abstract Product createClone();
// }

/* 연습문제 1번. createClone()메소드를 공유하는 법? */
public abstract class Product implements Cloneable {
    public abstract void use(String s);
    public Product createClone() {
        Product p = null;

        try {
            p = (Product)clone(); // 자기자신의 복제를 생성하는 메소드
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}