package dp_06_Prototype.framework;

import java.util.HashMap;

/* createClone을 사용해서 인스턴스를 복제하는 클래스 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
