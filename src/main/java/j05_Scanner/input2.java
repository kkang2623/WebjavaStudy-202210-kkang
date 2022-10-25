package j05_Scanner;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // 입력받기 위한 명렁

        System.out.println("x입력: ");
        int x = scanner.nextInt();

        System.out.println("y입력: ");
        int y = scanner.nextInt();

        System.out.println("x + y ="+(x + y)); // 10 + 20 = 30
        //System.out.println("x + y ="+x + y); 10 + 20 = 1020





    }
}
