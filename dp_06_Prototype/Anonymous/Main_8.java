package dp_06_Prototype.Anonymous;

import dp_06_Prototype.framework.Manager;
import dp_06_Prototype.framework.Product;

public class Main_8 {
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
/* 왜 프로토타입 패턴이 필요할까?
 * 
 * 1. 종류가 너무 많아서 클래스로 정리할 수 없는 경우(위의 경우에는 3가지 클래스이지만 경우에 따라서 더 많은 클래스들을 다룰 수 있다.)
 * 2. 클래스로부터 인스턴스 생성이 어려운 경우
 * 3. framework와 생성하는 인스턴스를 분리하고 싶은 경우
 */