package j06_조건.j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {


    private Scanner scanner;
    //== private Int scanner;
    //== private String scanner;
    private StudentRepository studentRepository; // 다른 클래스를 가져와서 씀

    //스튜던트 서비스가 생성될 때 스캐너스캐너,리파짓토리 가 써진다.
    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }


    //레지스터스튜던트의 로직
    public void registerStudent() {
        String name;
        int kor;
        int eng;
        int math;
        System.out.println("[학생정보 등록]");
        System.out.println("이름: ");
        name = scanner.nextLine();
        System.out.println("국어: ");
        kor = scanner.nextInt();
        System.out.println("영어: ");
        eng = scanner.nextInt();
        System.out.println("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, kor, eng, math);
        //학생 객체 생성

        studentRepository.addStudent(student);


    }

    public void showStudents() {
        Student[] students = studentRepository.getStudentArray();

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null) {
                student.showInfo();
            }
        }
    }

    private int indexOf(){
        String name;
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

        return studentRepository.findStudentByName(name);

    }
    public void showStudent() {
        System.out.println("[학생 정보 이름으로 조회]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.getStudent(index).showInfo();

    }

    public void deleteStudent() {
        System.out.println("[학생 정보 이름으로 삭제]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.removeStudent(index).showInfo();
        System.out.println("삭제 완료!");
        System.out.println();
    }

    public void modifyStudent(){
        System.out.println("[학생 정보 이름으로 수정]");
        int index = indexOf();

        int kor;
        int eng;
        int math;

        if (index == -1) {
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return;
        }
        System.out.println("국어: ");
        kor = scanner.nextInt();
        System.out.println("영어: ");
        eng = scanner.nextInt();
        System.out.println("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student updatestudent = new Student("",kor,eng,math);

        studentRepository.updateStudent(index,updatestudent);
        System.out.println("수정완료!");
    }

}


