package dp_04_Factory_Method.idcard;

import java.util.ArrayList;
import java.util.List;

import dp_04_Factory_Method.framework.Factory;
import dp_04_Factory_Method.framework.Product;

/* 메소드 createProduct, registerProduct를 구현하고 있는 클래스 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
