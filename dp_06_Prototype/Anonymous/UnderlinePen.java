package dp_06_Prototype.Anonymous;

import dp_06_Prototype.framework.Product;

public class UnderlinePen extends Product {
    private char ulchar;
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i ++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    /* clone()메소드는 자신의 클래스(혹은 하위 클래스)에서만 호출 가능하므로 다른 클래스의 요청으로 복사할 때는 createClone과 같은 다른 메소드를 이용해야 함 */
    // @Override
    // public Product createClone() {
    //     Product p = null;

    //     try {
    //         p = (Product)clone(); // 자기자신의 복제를 생성하는 메소드
    //     } catch (CloneNotSupportedException e) {
    //         e.printStackTrace();
    //     }
    //     return p;
    // }
    
}
