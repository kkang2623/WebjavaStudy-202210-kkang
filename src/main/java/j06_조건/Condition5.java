package j06_조건;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selected =0;

        System.out.println("[선택 프로그램]");
        System.out.println("1. 짜장");
        System.out.println("2. 짬뽕");
        System.out.println("3. 탕수육");
        System.out.println("4. 깐풍기");
        System.out.println("5. 팔보채");
        System.out.println("실행할 명령을 선택하세요 : ");
        selected = scanner.nextInt();

        switch (selected) { //자료형이 같아야 한다.
            case 1:
                System.out.println("짜장을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("짬뽕 선택하셨습니다.");
                break;
            case 3:
                System.out.println("탕수육 선택하셨습니다.");
                break;
            case 4:
                System.out.println("깐풍기 선택하셨습니다.");
                break;
            case 5:
                System.out.println("팔보채 선택하셨습니다.");
        }

    }
}
