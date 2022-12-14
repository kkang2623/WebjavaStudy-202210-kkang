package j25_문자열;

public class String3 {
    public static void main(String[] args) {

        String phoneNumber = "010-9988-1916_1/2";

//        String replacePhoneNumber = phoneNumber.replaceAll("-", " "); // 하이픈을 띄어쓰기로 바꿈.
        String replacePhoneNumber =
                phoneNumber.replaceAll("-", " ")
                        .replaceAll("/", " ")
                        .replaceAll("_", " ");
        System.out.println(replacePhoneNumber);

    }
}
