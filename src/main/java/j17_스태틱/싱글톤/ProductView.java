package j17_스태틱.싱글톤;

public class ProductView {
    private static ProductView instance = null;

    private ProductView(){}


    public static ProductView getInstance() { //객체를 하나만 생성. 이 이상의 객체는 생성되지 않음.
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }



}

