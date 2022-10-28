package j11_배열;

public class ArrayTesr1 {
    public static void main(String[] args) {

        int[] numArray = new int[10]; // 4바이트짜리 int가 10개가 묶여있다.
        //인트 [배열]

        int index = 9; //9번 인덱스에 10을 넣음?

        numArray[index] =10;
        //메모리에 접근을 하고 10을 넣음


        for(int i = 0; i<10; i++) {
            System.out.println(numArray[i]);
        }


    }
}
