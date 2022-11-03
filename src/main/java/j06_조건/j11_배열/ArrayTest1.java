package j06_조건.j11_배열;

public class ArrayTest1 {
    public static void main(String[] args) {


        int[] numArray = new int[10];
        //하나의 인트 변수로 10개로 묶어놓음
        //new ___ 는 동적변수이다
        //int의 배열 형태

        int index = 9;

        numArray[index] = 10;
        //index 배열에 numArray 에 10을 넣기


       // numArray[0] = 10; //0번째 numArray 에 10을 넣기
        for(int i =0;i<10; i++){
            System.out.println(numArray[i]);
            //컴퓨터 언어는 0부터 시작이기에 index9 는 10번째 들어간다.
        }

    }
}
