package j25_문자열;

import java.util.Objects;

public class String6 {
    public static void main(String[] args) {
        String httpRequest = " ";
        /*
        문자열이 비어있지 않으면
        1. null X  //비어있는 주소값
        2. "" X    //문자열이 비어있음.
        3. " " X   //스페이스바로 비어있음.
         */

        if(!httpRequest.isBlank()){
            System.out.println("비어있음");
        }else{
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
// 1팀 박경효 김혜진 변상원 남강석
