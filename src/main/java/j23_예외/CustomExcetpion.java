package j23_예외;

import lombok.Getter;

import java.util.Map;

public class CustomExcetpion extends RuntimeException{ //예외 익셉션
    @Getter
    private Map<String,String> errorMap;

    public CustomExcetpion(String message, Map<String, String> errorMap) {
        //예외를 생성할 때 throw을 가져옴 //Exception은
        super(message);
        this.errorMap = errorMap;
    }
}
