package j18_제네릭;


import lombok.Data;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {
//        ResponseData = 응답데이터
        Date now = new Date();
        ResponseData<String> responseData = new ResponseData<String >("날짜 저장성공!", now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<Integer>("번호 저장성공!", 10 );
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<Date>("날짜 객체 저장 성공",now);
        System.out.println(responseData3);
    }
}
