package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {


        StudentAccessModifier sam = new StudentAccessModifier(20220001, "남강석");

        System.out.println(sam.getName());
        sam.showInfo();
        sam.setName("남 약약석");
        sam.showInfo();


    }
}
