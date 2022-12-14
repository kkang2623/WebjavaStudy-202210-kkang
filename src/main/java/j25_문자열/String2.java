package j25_문자열;

public class String2 {

    public static void main(String[] args) {
        String phoneNumber = "010-2474-6352";

        int firstHypenIndex = phoneNumber.indexOf("-");
        int lastHypenIndex = phoneNumber.lastIndexOf("-");

        String subStringLastNumber = phoneNumber.substring(lastHypenIndex+1);
        String subStringMidNumber = phoneNumber.substring(firstHypenIndex +1 , lastHypenIndex);
        System.out.println(subStringLastNumber);
        System.out.println(subStringMidNumber);





    }
}
