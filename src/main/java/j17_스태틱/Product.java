package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Product {

    public static int autoIncrement = 20220000;

    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = autoIncrement++;
        this.productName = productName;
    }

    public static int getAutoIncrement(){
        return autoIncrement;
    }

    public static void printInfo(){
//      System.out.println(productName);  // 멤버변수는 스새틱 메소드에서 사용할 수 없다.
//      생성이 되더야만 쓸 수 있는 것이라 쓸 수 없음 //자기 자신을 생성해서 쓰면 가능.
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }

}
