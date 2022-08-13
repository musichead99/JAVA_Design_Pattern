package dp_04_Factory_Method.framework;

/* 추상 메소드 use()만 정의되어 있는 추상 클래스 */
public abstract class Product {
    public abstract void use();
}

/* 하위 클래스의 인스턴스가 가져야 할 인터페이스를 결정한다. */