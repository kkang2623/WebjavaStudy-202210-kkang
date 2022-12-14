package j17_스태틱.싱글톤;


public class ProductView {
    private static ProductView instance = null;

    //싱글톤 방식
    private ProductView() {}

    public static ProductView getInstance() {
        if(instance == null){ //한번도 생성된 적이 없음. 한번 겟인스턴스가 호출되어지면 값이 들어감 //두번째부터는 리턴해줌
            instance = new ProductView();
        }
        return instance;
    }

    public  void showMainView() {
        System.out.println("상품 정보를 보여주는 메인화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
