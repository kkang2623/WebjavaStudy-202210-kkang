package j09_클래스.Student풀이;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.schoolCode = 201330010;
        s1.schoolYear = 2013;
        s1.name = "남강석";

        s2.schoolName = "우산대학교";
        s2.schoolCode = 201330010;
        s2.schoolYear = 2013;
        s2.name = "남약석";


        s1.showStudentInfo();
        System.out.println();

        s2.showStudentInfo();
        System.out.println();

        System.out.println("학년증가반복");
        for(int i = 0; i<10; i++){
            s1.increaseStudentYear();
        }s1.showStudentInfo();



    }
}
