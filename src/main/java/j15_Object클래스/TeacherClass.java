package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("남강석", "코리아아이티");
        Teacher teacher2 = new Teacher("남강석", "코리아아이티");

        Class t_class = teacher1.getClass(); //해당 티쳐의 정보들을 가져온다.

        System.out.println(t_class.getSimpleName()); //클래스명
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println("========================");
            System.out.println(fields[i].getType().getSimpleName());

            System.out.println("========================");
            Method[] methods = t_class.getDeclaredMethods();
            for (int j = 0; j < methods.length; j++) {
                System.out.println(methods[i].getName());
                System.out.println("========================");
                System.out.println(methods[i].getReturnType());
            }
            System.out.println(teacher1.getClass() == teacher2.getClass());
            System.out.println(teacher1 instanceof Teacher);
            System.out.println(teacher1.getClass() == Teacher.class);
            System.out.println(teacher2.getClass() == Teacher.class);

        }
    }
}