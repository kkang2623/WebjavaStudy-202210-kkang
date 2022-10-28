package j10_접근지정자.캡슐화.A;

public class AccessModiFierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001,"남강석");

        sam.showInfo();
        sam.setName("남약석");
        sam.showInfo();

        System.out.println(sam.getCode());



    }
}
