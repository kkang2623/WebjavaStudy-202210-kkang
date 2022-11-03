package j15_Object클래스;

public class TeacherEquals {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("남강석", "코리아아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("남강석", "코리아아이티2");


//        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode() == teacher2.hashCode());
    }


}
