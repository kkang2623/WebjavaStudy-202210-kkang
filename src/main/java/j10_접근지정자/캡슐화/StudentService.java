package j10_접근지정자.캡슐화;

public class StudentService {

    public void registerStudent(){

        System.out.println("[학생 정보 등록 메뉴]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doublecheckStudent("남강석");
        System.out.println("학생정보를 등록합니다.");
    }

    private boolean doublecheckStudent(String studentName){//다른 메소드에서 쓰일 일이 없다. // private이니 내부에서만 사용 가능
        if(studentName.equals("남강석")){
            return false;
        }
        return true;
    }
}
