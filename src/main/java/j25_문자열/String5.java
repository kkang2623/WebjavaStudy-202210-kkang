package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "GET";

        if(httpMethod.equalsIgnoreCase("Get")){ //영문자를 대소문자 구분 없이 알아보게 해줌.
            System.out.println("GET 요청입니다.");
        }else{
            System.out.println("GET요청이 아닙니다.");
        }

    }
}
