package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//@AllArgsConstructor
@Data
//@To String
public class Product {
    //static은 공유되어지지만 //  다른클래스에 카피되지 않는다. //메모리는 복사x
    public static int autoIncrement = 20220000; //스태틱이 아니면 1씩 증가가 안 됨

    private int serialNumber;
    private  String productName;

    public  Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo(){ // <-스테틱 메소드 안에서는 스테틱 변수만 쓸 수 있음.
//        System.out.println(productName);  멤버변수는 스테틱 메소드에서 사용할 수 없다.
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }

}
