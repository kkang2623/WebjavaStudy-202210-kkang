package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {
        /*     Product[] products = new Product[5];
         *//*
        1. serialNumber = 20220001 , productName = "스타벅스 블랙 텀블러1"
        1. serialNumber = 20220002 , productName = "스타벅스 블랙 텀블러2"
        1. serialNumber = 20220003 , productName = "스타벅스 블랙 텀블러3"
        1. serialNumber = 20220004 , productName = "스타벅스 블랙 텀블러4"
        1. serialNumber = 20220005 , productName = "스타벅스 블랙 텀블러5"
        1. serialNumber = 20220006 , productName = "스타벅스 블랙 텀블러6"
         *//*

//        int serialNumber = 20220001;
//        String productName = "스타벅스 블랙 텀블러1";

//        for(int i = 0; i< products.length; i++){
//            products[i] = new Product("스타벅스 블랙 텀블러" + (i+1));
//        }

        products[0] = new Product("스타벅스 블랙 텀블러"+1);
        products[1] = new Product("스타벅스 블랙 텀블러"+2);
        products[2] = new Product("스타벅스 블랙 텀블러"+3);
        products[3] = new Product("스타벅스 블랙 텀블러"+4);
        products[4] = new Product("스타벅스 블랙 텀블러"+5);

        for(int i = 0; i< products.length;i++){
            System.out.println(products[i]);
        }
*/

        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;  // +1이 되었고
        System.out.println(Product.autoIncrement);

        //생성자에서 +1이 됨  Product 클래스에 ++autoIncrement 를 해놓았기 때문
        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");

        //이미 증가된 값만 나옴.
        System.out.println(p1.getAutoIncrement());
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());
        System.out.println(p5.getAutoIncrement());
        System.out.println();
        System.out.println(p5.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        System.out.println(PathRepository.PRODUCT_IMG_PAT);
        System.out.println(PathRepository.PROFILE_IMG_PAT);
        System.out.println(PathRepository.MAIN_IMG_PAT);


        Product.printInfo();

        ProductMain productMain = new ProductMain();
        productMain.setName("ㅇㅌㄴㅁㄹ");
        System.out.println(productMain.getName());

        Method1.main(new String[]{});

        System.out.println();
        Method1.call();


    }
}
