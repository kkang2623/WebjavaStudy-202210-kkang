package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("남강석","부산");

        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        String str = objectTest.toString();
        System.out.println(str);
        System.out.println(objectTest.toString());

        Teacher teacher1 = new Teacher("남약석","코리아아이티");
        Teacher teacher2 = new Teacher("남상석","오필승코리아");

        System.out.println(teacher1);
        System.out.println(teacher2);


    }
}
