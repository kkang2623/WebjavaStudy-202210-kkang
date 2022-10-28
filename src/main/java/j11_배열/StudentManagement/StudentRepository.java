package j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students; // 학생들을 저장할 수 있는 배열

    public StudentRepository() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        int flag = indexOfEmpty();

        if (flag == -1) {
            index = increaseArray();
        }
        students[index] student;

    }

    private int indexOfEmpty() { // 비어있는 공간의 인덱스를 알려준다.
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {//주소가 비었다. // 공간이 있다
                return i;
            }
        }
        return -1; //공간이 없다는 말.
    }

    private void increaseArray() {
        Student[] tempArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i]; // 배열이 하나 더 많음 ??
        }
        students = tempArray; //현재 배열에 템프어레이를 배치시킴 그러면 공간이 늘어남

        return tempArray.length - 1; //마지막에 비어있는 인덱스를 말해준다.
    }

}
