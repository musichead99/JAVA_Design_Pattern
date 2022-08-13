package dp_04_Factory_Method.framework;

/* 메소드 create를 구현하고 있는 추상 클래스 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}

/* new를 사용해서 실제의 인스턴스를 생성하는 대신, 인스턴스 생성을 위한 메소를 호출해서 구체적인 클래스 이름에 의한 속박에서 상위 클래스를 자유롭게 만든다. */