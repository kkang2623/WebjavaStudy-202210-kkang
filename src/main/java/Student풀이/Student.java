package Student풀이;

public class Student {

    //1번 시작
    String schoolName;
    int studentCode;
    int studentYear;
    String name;
    //1번 끝

    //6번 시작
    void increaseStudentYear(){
        studentYear++;
        if(studentYear>5){
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear--;
            return;
        }showStudentInfo();
    }
    //6번 끝

    void increaseStudentYear(int year){
        studentYear += year;
        if(studentYear>5){
            System.out.println("학년을 더하면." + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }
    //2번 시작
    void showStudentInfo(){
        System.out.println("학교: "+schoolName);
        System.out.println("학번: "+studentCode);
        System.out.println("학년: "+studentYear);
        System.out.println("이름: "+name);
    }//2번 끝
}
