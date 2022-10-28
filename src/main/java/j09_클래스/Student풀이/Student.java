package j09_클래스.Student풀이;

public class Student {

    String schoolName;
    int schoolCode;
    int schoolYear;
    String name;


    void increaseStudentYear(){
        schoolYear++;
        if(schoolYear>5){
            System.out.println("더이상 학년을 증가시킬 수 없습니다.");
            schoolYear--;
            return;
        }showStudentInfo();
    }

    void increaseStudentYear(int year){
        schoolYear += year;
        if(schoolYear>5){
            System.out.println(year + "학년을 더하면 " + schoolYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println();
            schoolYear -= year;
            return;
        }showStudentInfo();
    }

    void showStudentInfo(){
        System.out.println("학교: "+schoolName);
        System.out.println("학교: "+schoolCode);
        System.out.println("학교: "+schoolYear);
        System.out.println("학교: "+name);
    }
}

