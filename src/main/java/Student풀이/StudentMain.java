package Student풀이;

public class StudentMain {
    public static void main(String[] args) {

        //3번
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20133310;
        s1.studentYear = 1;
        s1.name = "남강석";

        s2.schoolName = "창신대학교";
        s2.studentCode = 20133310;
        s2.studentYear = 2;
        s2.name = "남강성";
        //3번 끝

        //4번 시작
        s1.showStudentInfo();{}
        System.out.println();

        s2.showStudentInfo();{}
        System.out.println();
        //4번 시작

        //5번시작
       /* System.out.println("학년증가 반복");
        for(int i =0; i<10; i++){
        s1.increaseStudentYear();
        }
        s1.showStudentInfo();*/
        //5번 끝

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

        s1.showStudentInfo();

        s2.increaseStudentYear(5);
    }
}
