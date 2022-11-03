package j06_조건.j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) { //여기서 실행
        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService(new Scanner(System.in), new StudentRepository());

        String select = null;

        while (true) { //무한 반복
            System.out.println("[학생 관리 프로그램 메뉴]");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            select = scanner.nextLine();

            if (select.equals("q")) {
                break;
            } else if (select.equals("1")) {
                studentService.showStudent();
            } else if (select.equals("2")) {
                studentService.registerStudent();

            } else if (select.equals("3")) {
                studentService.modifyStudent();

            } else if (select.equals("4")) {
                studentService.deleteStudent();

            } else if (select.equals("5")) {
                studentService.showStudent();

            } else {
                System.out.println("잘못된 입력!! 다시입력하세요.");

            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }


}







       /* studentService.registerStudent();
        studentService.registerStudent();
        studentService.showStudents();
//        studentService.showStudent();
//        studentService.deleteStudent();
//        studentService.showStudent();
//        studentService.deleteStudent();
        studentService.modifyStudent();
        studentService.showStudent();*/


//crud 추가 읽기 수정 삭제
//Create 생성
//Read   읽기
//Update 추가
//Delete 삭제

