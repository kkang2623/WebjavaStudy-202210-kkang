package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {
    @Getter
    private String company;
    private int serialNumber;

    private static Samsung instance = null;

    //싱글톤 방식
    private Samsung() {
//        this.company = "삼성";
        company = getClass().getSimpleName(); // 클래스명 가지고 오기.
        serialNumber = 20220000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }


}
