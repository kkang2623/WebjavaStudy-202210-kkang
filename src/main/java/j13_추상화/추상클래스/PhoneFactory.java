package j13_추상화.추상클래스;

public class PhoneFactory extends Factory {

    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {     //선언부 + 구현부 = 하나의 정의  //선언부
        System.out.println("[" + model + "}모델 스마트폰을 생성합니다.");     //구현부
    }
    @Override
    public void management(){
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
