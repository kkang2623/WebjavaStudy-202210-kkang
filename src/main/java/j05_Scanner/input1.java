package j05_Scanner;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
/**
 * 문자열 입력
 * next()       -> 띄어쓰기 포함 x
 * nextLine()   -> 띄어쓰기 포함 o
 */
        String name = "남강석";

        Scanner scanner = new Scanner(System.in);
        //System.out -> 출력
        //System.in -> 콘솔창에 입력을 한다. 자바에서 쓸 수 있게 바꿔준다.

        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println("입력 받은 값1: "+ s);
        System.out.println("입력 받은 값2: "+ s2);
        System.out.println("입력 받은 값3: "+ s3);




    }
}
