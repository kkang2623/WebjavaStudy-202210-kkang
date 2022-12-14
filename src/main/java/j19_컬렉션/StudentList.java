package j19_컬렉션;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//        ArrayList<Student> students = new ArrayList<Student>(); // 밑에거와 동일. 줄여 씀
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "남강석"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));


        String searchName = "김규민";

        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번 : " + student.getId());
                break;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (students.get(i).getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번 : " + student.getId());
            }
        }

        int searchId = 20220002;
        //지우고 학생리스트 출력

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }
        System.out.println(students);


        searchId = 20220003;

        for (Student student : students) {
            if (student.getId() == searchId && student.getName().equals("김규민")) {
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);


        System.out.println("-----------------------------------------------------");

        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println();

//        박경효를 박창우로 변경 iterator 사용

        searchId = 20220004;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == searchId) {
                student.setName("박창우");
                break;
            }

        }
        System.out.println(students);

        System.out.println("----------------------------------------------------------------------------------------");
        List<Student> reverseStudents = new ArrayList<Student>();

        for (int i = 0; i < students.size(); i++) {
            reverseStudents.add(students.get(students.size() - 1 - i));
        }
        System.out.println(reverseStudents);

//
//        for(Student student : students){
//            reverseStudents.add(0,student);
//
//        }
//        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        /*
        idList
        nameList
        각각의 id값 리스트
              name값 리스트
         */
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for (Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear();
        System.out.println(students);


        for(int i = 0; i < idList.size(); i++) {
            Student student = new Student(idList.get(i),nameList.get(i));
            students.add(student);
        }System.out.println(students);



    }
}
