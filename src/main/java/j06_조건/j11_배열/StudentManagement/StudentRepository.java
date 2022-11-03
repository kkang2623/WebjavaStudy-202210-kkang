package j06_조건.j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students;
    //학생들을 저장할 수 있는 배열

    public StudentRepository() {
        students = new Student[0];
        //[10]을 넣는다고 해서 10명의 학생이 생성이 되는 것이 아니라 10명을 넣을 수 있는 공간이 형성이 됨
    }

    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if (index == -1) {
            index = increaseArray(); //인덱스는 -1이면 공간이 없다 // 배열을 증가시키겠다
        }

        students[index] = student;
        //새로운 정보를 넣음.

    }

    private int indexOfEmpty() {
        //비어있는 공간의 인덱스를 알려준다.
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                //null 뜻은 주소가 비었다 // 공간이 비었다
                return i;
            }
        }

        return -1; // 무조건 공간이 없다는 뜻
    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1];
        //임시 어레이를 넣어 //temp : (임시)라고 자주 씀
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return tempArray.length - 1;
        //마지막에 비어있는 인덱스 번호
    }

    public Student[] getStudentArray() {
        return students;
    }

    //내가 찾는 이름이 있는지 확인
    //있다면 그 인덱스 번호를 알 수 있게 확인
    public int findStudentByName(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {// 매개변수 이름이랑 같나 ?
                    return i;
                }
            }
        }
        return -1; //못 찾았다.// 없다는 말
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public Student removeStudent(int index) {
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent) {
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }


}
